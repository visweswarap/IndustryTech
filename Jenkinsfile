pipeline {
  agent any
  tools {
    maven '3.8.6'
  }
  stages {
    stage ('Build') {
      steps {
        git 'https://github.com/visweswarap/IndustryTech.git'
        sh 'mvn clean package'
      }
    }
    }
}
