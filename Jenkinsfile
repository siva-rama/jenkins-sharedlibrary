
@Library('jenkins-sharedlibrary')_



final String PROJECT_GROUP = 'cl.scotiabank'
final String PROJECT_NAME = 'Project1'
final String ARTIFACTORY_CONTEXT_URL = 'http://localhost:8081/artifactory'
final String ARTIFACTORY_PROJECT_REPO_KEY = 'local-gradle-local'
final String BRANCH = env.BRANCH_NAME
final String GRADLE_SWITCHES = '--info'
final String APPROVALS_GROUP = ''
final String PUBLISH_ARTIFACTS = 'true'
final String TEAM_EMAIL_LIST = ''

//node {

//stage('Shared Library - Pipeline Flow') {
		
  	//	echo 'Hello World'

  	//	sayHello 'Everyone'

  	//	gradleBuild()
	
		standardPipeline{
    		projectName = PROJECT_NAME
    		projectGroup = PROJECT_GROUP
        	projectName = PROJECT_NAME
        	branch = BRANCH
        	sonarqubescan = true
        	publishtoartifactory = true
        	artifactoryProjectRepoKey = ARTIFACTORY_PROJECT_REPO_KEY
        	switches = GRADLE_SWITCHES
        	publishArtifacts = PUBLISH_ARTIFACTS
        	emailList = TEAM_EMAIL_LIST
        	serverDomain = "Project1 Server Domain"
		}
//	}
//}