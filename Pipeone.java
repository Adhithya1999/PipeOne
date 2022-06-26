pipeline{
    agent any
    stages{
        stage('Compile'){
            steps{
                echo"compiling the script"
            }
        }
        stage('Build'){
            steps{
                echo"building the script"
            }
        }
        stage('Deploy'){
            steps{
                echo"Deploying the script"
            }
        }
        stage('Release'){
            steps{
                echo"releasing the script"
            }
        }
        stage('summa'){
            steps{
                echo"summa poten"
            }
        }
    }
}