pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/yarradedeepya/jenkinsproject1.git'
                }
            }
        stage('Test'){
            steps{
                sh "python tinker.py"
		echo "sucess"
            
            }
            
        }
        stage('Deploy'){
            steps{
            println "deployed"
            }
        }
    }
}
    