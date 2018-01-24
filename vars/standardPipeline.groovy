def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()

        node {
            // Clean workspace before doing anything
            deleteDir()

            try {
                stage ('Clone') {
                    checkout scm
                }
                stage ('Build') {
                    sh "echo 'building ${config.projectName} ...'"
                    
                }
                stage ('Tests') {
                    parallel 'static': {
                        sh "echo 'shell scripts to run static tests...'"
                    },
                    'unit': {
                        sh "echo 'shell scripts to run unit tests...'"
                        
                    },
                    'integration': {
                        sh "echo 'shell scripts to run integration tests...'"
                    }
                }
                stage ('Publish to SonarQube') {
                    sh "echo '${config.sonarqubescan}'"
                    sh "echo '${config.branch}'"

                    if (config.sonarqubescan == true && config.branch == 'master || develop') {
                    sh "echo 'publishing reports to SonarQube server ...'"
                    } else {
                        sh "echo 'Not enabled..'"
                    }

                }
                stage ('Publish to Artifactory') {
                    sh "echo '${config.artifactoryRepokey}'"

                    if (config.branch == 'master || develop'){
                        sh "echo 'deploying to Artifactory with key ${config.artifactoryRepokey}...'"
                    } else {
                        sh "echo 'It is not a master or develop branch'"
                    }
                    
                }
                stage ('Deploy') {
                    sh "echo 'deploying to server ${config.serverDomain}...'"
                }
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }