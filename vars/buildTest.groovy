def call() {
	
	
	def mvnHome = tool 'maven3'
	def pom = readMavenPom file: 'pom.xml'
	
	withEnv(["M2_HOME=$mvnHome"]) {
	
		echo"Maven Test Initiated for build number=${currentBuild.number}"
		
		bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean test package/)
	//bat(/"${mvnHome}\bin\mvn" -Dintegration-tests.skip=true clean package/)
//	def pom = readMavenPom file: 'pom.xml'
	print pom.version
	//junit '**//*target/surefire-reports/TEST-*.xml'
	//archive 'target*//*.jar'
	echo"Maven Test Done for ${currentBuild.number}"
	
	}
}
