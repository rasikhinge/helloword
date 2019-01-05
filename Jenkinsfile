pipeline{
    agent any
            stages{
                    stage('build'){
                            steps{
                                    echo 'Hello, this is first step'
									git "https://github.com/rasikhinge/helloword.git"
									
                            }
                    }
                    stage('compile'){
                            steps{
								   echo "compile"
								   sh "cd firstspringbootproject"
								   sh "mvn package"
                            }
                    }
                  }

}