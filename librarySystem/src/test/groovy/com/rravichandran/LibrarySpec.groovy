package com.rravichandran

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "upper case test"(){
		when: "The name begins with a lower letter"
			def ho1 = new Library(building: 'howard')
		then: "Validation should fail"
			!ho1.validate()

		when: "The name begins with an uppercase letter"
			ho1 = new Library(building: 'Howard')

		then: "Validation should pass"
			!ho1.validate()


    }
	
}
