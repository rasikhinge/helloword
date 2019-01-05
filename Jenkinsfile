pipeline{
    agent any
            stages{
                    stage('build'){
                            steps{
                                    echo 'Hello, this is first step'
									bat "cd firstspringbootproject"
									bat "mvn package"
                            }
                    }
                    stage('test'){
                            steps{
                                    input('Do you want to proceed ?')
                            }
                    }
                  }

}