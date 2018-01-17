
library 'jenkins-sharedlibrary'

pipeline {
  agent any
  options {
    ansiColor('xterm')
    timestamps()
    timeout(time: 30, unit: 'MINUTES')
  }
  tools {
    jdk 'Oracle JDK 1.8'
    gradle 'Gradle 3.5'
  }
  stages {

	stage('Shared Library - Pipeline Flow') {

  		echo 'Hello World'

  		sayHello 'Raju'

  		gradleBuild 'java'

		}
	}
}