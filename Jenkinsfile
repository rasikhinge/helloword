pipeline{
    agent any
            stages{
                    stage('build'){
                            steps{
                                    echo 'Hello, this is first step'
									git "https://github.com/rasikhinge/helloword.git"
                            }
                    }
					stage('changeDirectory'){
							dir("firstspringbootproject"){
								"cd  firstspringbootproject"
							}
					}
                    stage('compile'){
                            steps{
								   echo "compile"
								   bat "mvn package"
                            }
                    }
                  }

}