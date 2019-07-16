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
      // Run the maven 
      withEnv(["M2_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$M2_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
         } else {
            bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
         }
      }
   }
   }
   catch(exc){
       echo "Build Failed"
   }
   
   stage('\u2778 TEST') {
      // Run the maven test
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
   }