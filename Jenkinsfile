pipeline {
  agent any
  tools {
    maven '3.8.6'
         }
     stages {
         stage("Maven Build") {
             steps {
                     github 'https://github.com/visweswarap/IndustryTech.git'
                     bat "mvn clean package"
                    }
                 }
          stage("Up Load War Nexus") {
             steps {
             nexusArtifactUploader artifacts: [
                    [artifactId: 'IndustryTech',
                     classifier: '',
                     file: 'target/IndustryTech-1.0-SNAPSHOT.war',
                     type: 'war'
                     ]
             ],
             credentialsId: 'nexus-Tech',
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
