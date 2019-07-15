#!/usr/bin/env groovy

def call(String name = 'human') {
  
	echo "Hello, ${name}."
  
  (1..3).each {
	  echo "Number: " + it
  }

  currentBuild.result = 'SUCCESS' //FAILURE to fail
  return this
  
}