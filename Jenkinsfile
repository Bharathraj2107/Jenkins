pipeline {
    agent any
    stages {
        stage("build") {
            steps {
                echo 'building the application...'
            }
        }
        stage("test") { // Renamed to "test"
            steps {
                echo 'testing the application...'
            }
        }
        stage("deploy") {
            steps {
                echo 'deploying the application...'
            }
        }
    }
}
