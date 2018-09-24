pipeline {
      agent any


      stages {
         stage('Build') {
            steps {
               sh 'gradle clean compileJava'
               sh './gradlew clean assemble'
            }
         }
         stage('Deploy'){
                    steps{
                        sh 'cf push shipment-microservice -p ./build/libs/shipment-microservice-0.0.1-SNAPSHOT.jar'
                    }
         }
      }
  }