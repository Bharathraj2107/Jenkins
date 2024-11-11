// Jenkinsfile
def gv
pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Choose the version to deploy')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Execute tests before deploying')
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"  // Load the external Groovy script
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests  // Only run tests if 'executeTests' is true
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
