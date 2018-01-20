
@Library('jenkins-sharedlibrary')_

node {

stage('Shared Library - Pipeline Flow') {
		
  		echo 'Hello World'

  		sayHello 'Everyone'

  		gradleBuild()
	standardPipeline{
		projectName = "Project1"
    		serverDomain = "Project1 Server Domain"	
	}

		}
}
