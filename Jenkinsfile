pipeline {
  agent any
  tools {
    maven '3.8.6'
         }
     stages {
         stage("Maven Build") {
             steps {
                 script {
                     github 'https://github.com/visweswarap/IndustryTech.git';
                     bat "mvn clan package"
                         }
                    }
                 }
          stage("Up Load War Nexus") {
             steps {
             nexusArtifactUploader artifacts: [
                    [artifactId: 'IndustryTech',
                     classifier: '',
                     file: 'target/IndustryTech/1.0-SNAPSHOT.war',
                     type: 'war'
                     ]
             ],
             credentialsId: 'nexus3',
             groupId: 'com.application',
             nexusUrl: 'localhost:8081',
             nexusVersion: 'nexus3',
             protocol: 'http',
             repository: 'nexus_Tech',
             version: '1.0-SNAPSHOT'
           }
        }
      }
 }
