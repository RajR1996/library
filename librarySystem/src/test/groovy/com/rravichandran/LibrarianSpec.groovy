package com.rravichandran

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "invalidEmail"(){
	when: "A librarian has an  email"
	
	def emma=new Librarian(name:'Emma Briggs', email: 'emma.wallace', office: 'Cantor 987', userName: 'emmabriggs', password: 'password', telephone: '01147564365', library: 'Owen')

	
	
	then: "The invalidEmail will check if the email is invalid and validation will fail if it is invalid"
	
	!emma.validate()
 
    }



}
