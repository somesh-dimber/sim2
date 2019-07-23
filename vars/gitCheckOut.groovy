def call() {
	log.info 'Inside Git Checkut'
	echo"Inside Git Checkout"
	//["git", "checkout", "https://github.com/somesh-dimber/sim2.git"].execute()
	git 'https://github.com/somesh-dimber/sim2.git'
	
	
		  }
		  