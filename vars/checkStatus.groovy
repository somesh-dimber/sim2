#!/usr/bin/env groovy
pipeline{
def call(body) {
    echo "Check status"

    (1..3).each {
        echo "Number: " + it
    }

    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}
}