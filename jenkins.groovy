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
	stage('Reading-File'){
	    steps{
		def props = readJSON file:'emp.JSON'
		assert props['firstName'] == 'John'
		echo props['lastName']
	}
	}
        stage('Test'){
            steps{
		echo "in Test"
                bat "python tinker.py"
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
    
