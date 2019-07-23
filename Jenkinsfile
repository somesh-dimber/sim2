node {
   def mvnHome
   try{
       
   

   stage('\u2776 CheckOut') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/somesh-dimber/sim2.git'
              
      mvnHome = tool 'maven3'
   }
  }
  catch(exc){
  
  echo "Git  failed"
      }
  
try {
    
  
   stage('\u2777 Build') {
      // Run the maven build
      withEnv(["M2_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$M2_HOME/bin/mvn" -Dmaven.test.failure.ignore compile package'
         } else {
            bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore compile package/)
         }
      }
   }
   }
   catch(exc){
       echo "Build Failed"
   }
   
   stage('\u2778 TEST') {
      // Run the maven build TEST
      withEnv(["M2_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$M2_HOME/bin/mvn" -Dmaven.test.failure.ignore test package'
         } else {
            bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore test package/)
         }
      }
   }
	
   stage('\u2779 Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'target/*.jar'
   }
   
 
        if (env.BRANCH_NAME == 'feature1') {
            echo 'I only execute on the feature1 branch'
         stage('\u277A RETEST') {
      // Run the maven build
      withEnv(["M2_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$M2_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
         } else {
            bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore test package/)
         }
      }
   }
            
        } else {
            echo 'Stage ReTest cannot be executed'
        }
    
    
   
     }