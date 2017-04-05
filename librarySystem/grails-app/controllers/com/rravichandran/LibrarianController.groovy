package com.rravichandran

class LibrarianController {

	def scaffold= Librarian

	def search(){
	}

	def results(){
	
		def studentProps = Student.metaClass.properties*.name
		def students = Student.withCriteria{
			"${params.queryType}"{
				params.each {field,value ->
					if(studentProps.grep(field) && value){
						ilike(field, value)
					}
				}
		}
	}

	[students:students]
	}	
	

	def login(){
	}

	def validate(){
	
	def user = Librarian.findByUserName(params.username)
		if (user && user.password == params.password){
		session.user=user
		render view:'home'
	}

		else{
			flash.message="Invalid username and password"
			render view:'login'
			}
	}

	def logout = {
		session.user = null
		redirect(uri:'/')
	}
	

}
