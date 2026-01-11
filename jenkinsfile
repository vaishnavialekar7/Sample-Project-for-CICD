pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/vaishnavialekar7/Sample-Project-for-CICD.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
