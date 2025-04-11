pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'openjdk-jdk17-latest'
  }
  environment {
		JACOCO_VERSION = "0.8.8"
		MVN_QUALITY_PROFILES = '-Pfull'
		JACOCO_EXEC_FILE_PATH = '${WORKSPACE}/jacoco.exec'
		BUILD_KEY = (github.isPullRequest() ? CHANGE_TARGET : BRANCH_NAME).replaceFirst(/^v/, '')
  }
  stages {
	stage('Generate Target Platform') {
		steps {
		    sh 'mvn verify -f releng/org.polarsys.capella.basic.viewpoints.target/pom.xml'
		}
	}
    stage('Package basic vp') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          script {
			def jacocoPrepareAgent = "-Djacoco.destFile=$JACOCO_EXEC_FILE_PATH -Djacoco.append=true org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:prepare-agent"
			sh "mvn ${jacocoPrepareAgent} clean verify -Pfull -Psign -e -f pom.xml"					    
		  }
        }
      }
    }
    stage('Archive artifacts') {
      steps {
        archiveArtifacts artifacts: 'releng/org.polarsys.capella.basic.mass.viewpoint.site/target/BasicMass-*.zip,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/BasicPerfo-*.zip,releng/org.polarsys.capella.basic.price.viewpoint.site/target/BasicPrice-*.zip,releng/org.polarsys.capella.basic.requirement.viewpoint.site/target/BasicRequirement-*.zip,releng/org.polarsys.capella.basic.mass.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.price.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.requirement.viewpoint.site/target/repository/**'
      }
    }
	
	stage('Deploy to Nightly') {
      		steps {
				script {
		    		def deploymentDirName = 
		    			(github.isPullRequest() ? "${BUILD_KEY}-${BRANCH_NAME}-${BUILD_ID}" : "${BRANCH_NAME}-${BUILD_ID}")
		    			.replaceAll('/','-')		
					
					deployer.addonNightlyDropins("${WORKSPACE}/releng/org.polarsys.capella.basic.mass.viewpoint.site/target/*-dropins-*.zip", deploymentDirName)
					deployer.addonNightlyDropins("${WORKSPACE}/releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/*-dropins-*.zip", deploymentDirName)
					deployer.addonNightlyDropins("${WORKSPACE}/releng/org.polarsys.capella.basic.price.viewpoint.site/target/*-dropins-*.zip", deploymentDirName)
					deployer.addonNightlyDropins("${WORKSPACE}/releng/org.polarsys.capella.basic.requirement.viewpoint.site/target/*-dropins-*.zip", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.mass.viewpoint.site/target/*-updateSite-*.zip", deploymentDirName)	
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/*-updateSite-*.zip", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.price.viewpoint.site/target/*-updateSite-*.zip", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.requirement.viewpoint.site/target/*-updateSite-*.zip", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.mass.viewpoint.site/target/bom*.json", deploymentDirName)	
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/bom*.json", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.price.viewpoint.site/target/bom*.json", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.basic.requirement.viewpoint.site/target/bom*.json", deploymentDirName)

					currentBuild.description = "${deploymentDirName} - <a href=\"https://download.eclipse.org/capella/addons/basic/dropins/nightly/${deploymentDirName}\">drop-in</a> - <a href=\"https://download.eclipse.org/capella/addons/basic/updates/nightly/${deploymentDirName}\">update-site</a>"
	       		}         
	     	}
	}
		
    stage('Publish tests results') {
      steps {
        junit allowEmptyResults: true, testResults: '*.xml,**/target/surefire-reports/*.xml'
        sh "mvn -Djacoco.dataFile=$JACOCO_EXEC_FILE_PATH org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:report $MVN_QUALITY_PROFILES -e -f pom.xml"
	  }
    }   
	
	stage('Perform Sonar analysis') {
			steps {
				script {
					sonar.runSonar("eclipse-capella_capella-basic-vp", "eclipse/capella-basic-vp", "sonar-token-capella-basic-vp")
				}
			}
		}
  }
}