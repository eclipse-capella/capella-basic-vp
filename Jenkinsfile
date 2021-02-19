pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'openjdk-jdk14-latest'
  }
  stages {
    stage('Package basic vp') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          sh 'mvn clean install -Pfull -Psign -e -f pom.xml'
        }
      }
    }
    stage('Run tests') {
      steps {
        sh 'mvn integration-test -PmassTests -PpriceTests -PperfoTests -e -f pom.xml'
      }
    }
    stage('Archive artifacts') {
      steps {
        archiveArtifacts artifacts: 'releng/org.polarsys.capella.basic.mass.viewpoint.site/target/BasicMass-*.zip,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/BasicPerfo-*.zip,releng/org.polarsys.capella.basic.price.viewpoint.site/target/BasicPrice-*.zip,releng/org.polarsys.capella.basic.mass.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.price.viewpoint.site/target/repository/**'
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
			  
            '''
        }
      }
    }
  }
}