package com.rravichandran

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString(){

	when:"A student has name, email and username"
	
	def SamStones = new Student(
	name:'Sam Stones',
	email:'sam.stones@shu.ac.uk',
	userName:'samstones')

	then:"the toString will merge them"
	
	SamStones.toString() == 'Sam Stones, sam.stones@shu.ac.uk, samstones'

}
	



}
