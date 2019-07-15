def call() {
	
	
	mvnHome = tool 'maven3'
	
	withEnv(["M2_HOME=$mvnHome"]) {
		
		bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
	//bat(/"${mvnHome}\bin\mvn" -Dintegration-tests.skip=true clean package/)
	def pom = readMavenPom file: 'pom.xml'
	print pom.version
	//junit '**//*target/surefire-reports/TEST-*.xml'
	//archive 'target*//*.jar'
	
	
}
