#!/usr/bin/env groovy
def call(body) {
	echo "Check status"

	(1..3).each {
		echo "Number: " + it
	}
echo "Inside Hello Statu"
	currentBuild.result = 'SUCCESS' //FAILURE to fail
	return this
}
//def call(String name = 'human') {
//  
//	echo "Hello, ${name}."
//  
//  (1..3).each {
//	  echo "Number: " + it
//  }
//
//  currentBuild.result = 'SUCCESS' //FAILURE to fail
//  return this
//  
//}