pipeline{
    agent any
            stages{
                    stage('build'){
                            steps{
                                    echo 'Hello, this is first step'
									checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'ecdbfc87-67d7-4381-ad2d-a2b34b083eb0', url: 'https://github.com/rasikhinge/helloword.git']]])
									bat "cd firstspringbootproject"
									bat "mvn mvn -f "/path/to/pom.xml" package"
                            }
                    }
                    stage('test'){
                            steps{
                                    input('Do you want to proceed ?')
                            }
                    }
                  }

}