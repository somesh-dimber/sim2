def call(String mavenCommand ='test') {
	
	
	mvnHome = tool 'maven3'
	
	withEnv(["M2_HOME=$mvnHome"]) {
		
		log.warning "Starting Maven command ${mavenCommand}"
		bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore ${mavenCommand} package/)
	//bat(/"${mvnHome}\bin\mvn" -Dintegration-tests.skip=true clean package/)
	def pom = readMavenPom file: 'pom.xml'
	print pom.version
	//junit '**//*target/surefire-reports/TEST-*.xml'
	//archive 'target*//*.jar'
	
	
	}
	
	
	
}

