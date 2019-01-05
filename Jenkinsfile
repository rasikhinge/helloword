pipeline{
    agent any
            stages{
                    stage('One'){
                            steps{
                                    echo 'Hello, this is first step'
									sh 'mvn --version'
                            }
                    }
                    stage('Two'){
                            steps{
                                    input('Do you want to proceed ?')
                            }
                    }
                    stage('Three'){
                             when{
                                    not{
                                         branch "master"
                                    }
                             }
                             steps{
                                    echo "Hello"
                             }
                    }


                  }

}