import hudson.model.*
import hudson.EnvVars
import groovy.json.JsonSlurperClassic
import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import java.net.URL

node {
   def mvnHome
   try{
       
   
   stage('\u2776 CheckOut') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/somesh-dimber/sim2.git'
      
      }
      
      }
      catch(exc){
          echo "Git Unreachable or incorrect credentials"
      }
      
   try{
       
   

   stage('Build') {
      // Run the maven build
      withEnv(["M2_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$M2_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
         } else {
            bat(/"%M2_HOME%\bin\mvn" -Dmaven.test.failure.ignore verify package/)
         }
      }
   }
   }
   catch(exc){
       echo"Maven Build failed"
   }

   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'target/*.jar'
   }
}
