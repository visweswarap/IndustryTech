pipeline {
  agent any
  tools {
    maven '3.8.6'
  }
  stages {
    stage ('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    }
}
