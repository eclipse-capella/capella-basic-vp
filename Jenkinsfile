pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'oracle-jdk8-latest'
  }
  stages {
    stage('Package basic vp') {
      steps {
        sh 'mvn clean install -Pmass -Pperfo -Pprice  -e -f pom.xml'
      }
    }
    stage('Archive artifacts') {
      steps {
        archiveArtifacts artifacts: 'releng/org.polarsys.capella.basic.mass.viewpoint.site/target/BasicMass-*.zip,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/BasicPerfo-*.zip,releng/org.polarsys.capella.basic.price.viewpoint.site/target/BasicPrice-*.zip,releng/org.polarsys.capella.basic.mass.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/repository/**,releng/org.polarsys.capella.basic.price.viewpoint.site/target/repository/**'
      }
    }
        stage('Deploy') {
      steps {
          sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
            sh '''
              echo "publish mass update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/1.3.0
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/1.3.0
              scp -r releng/org.polarsys.capella.basic.mass.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicmass/updates/nightly/1.3.0/
  
              echo "publish mass dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/1.3.0
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/1.3.0
              scp -r releng/org.polarsys.capella.basic.mass.viewpoint.site/target/BasicMass-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicmass/dropins/nightly/1.3.0/
 
              echo "publish perfo update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/1.3.0
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/1.3.0
              scp -r releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicperfo/updates/nightly/1.3.0/
  
              echo "publish perfo dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/1.3.0
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/1.3.0
              scp -r releng/org.polarsys.capella.basic.perfo.viewpoint.site/target/BasicPerfo-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicperfo/dropins/nightly/1.3.0/

              echo "publish price update site"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/1.3.0
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/1.3.0
              scp -r releng/org.polarsys.capella.basic.price.viewpoint.site/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicprice/updates/nightly/1.3.0/
  
              echo "publish price dropins"
              ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/1.3.0
              ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/1.3.0
              scp -r releng/org.polarsys.capella.basic.price.viewpoint.site/target/BasicPrice-dropins*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/addons/basicprice/dropins/nightly/1.3.0/
			  
            '''
        }
      }
    }
  }
}