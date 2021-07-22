pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/yarradedeepya/jenkinsproject1.git'
		echo "sucess"
                }
            }
        stage('Test'){
            steps{
		echo %WORKSPACE%
		echo "in Test"
                sh "tinker.py"
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
    
