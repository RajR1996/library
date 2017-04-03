package com.rravichandran

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void totalFees(){
	when: "A course has a title and fees"
	def computing = new Course(title: 'Computing', tuitionFees:9000)
	then: "The calculate method will show the total fees"
	computing.calculateFees()==36000
    }


}
