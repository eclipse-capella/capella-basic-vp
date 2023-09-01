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
  }
  stages {
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
    stage('Deploy') {
	  when {
		  not { changeRequest() }
	  }
      steps {
          sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
            sh '''
              echo "publish mass update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/master
              scp -r releng/org.polarsys.capella.basic.mass.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/master/
  
              echo "publish mass dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/master
              scp -r releng/org.polarsys.capella.basic.mass.viewpoint.site/target/BasicMass-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/master/
 
              echo "publish perfo update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/master
              scp -r releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/master/
  
              echo "publish perfo dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/master
              scp -r releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/BasicPerfo-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/master/

              echo "publish price update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/master
              scp -r releng/org.polarsys.capella.basic.price.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/master/
  
              echo "publish price dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/master
              scp -r releng/org.polarsys.capella.basic.price.viewpoint.site/target/BasicPrice-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/master/
			  
			  echo "publish requirement update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicrequirement/updates/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicrequirement/updates/nightly/master
              scp -r releng/org.polarsys.capella.basic.requirement.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicrequirement/updates/nightly/master/
  
              echo "publish requirement dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicrequirement/dropins/nightly/master
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicrequirement/dropins/nightly/master
              scp -r releng/org.polarsys.capella.basic.requirement.viewpoint.site/target/BasicRequirement-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicrequirement/dropins/nightly/master/
			  
            '''
        }
      }
    }
    stage('Publish tests results') {
      steps {
        junit allowEmptyResults: true, testResults: '*.xml,**/target/surefire-reports/*.xml'
        sh "mvn -Djacoco.dataFile=$JACOCO_EXEC_FILE_PATH org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:report $MVN_QUALITY_PROFILES -e -f pom.xml"
	  }
    }   
  }
}