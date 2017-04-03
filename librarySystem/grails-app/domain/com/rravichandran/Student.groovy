package com.rravichandran

class Student {
String name
String email
String userName
String password
int studentId
Course course
String toString()
{
return name }

static hasMany=[books: Book, bookReviews: BookReview]


    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email:true
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false, password:true
studentId blank:false, nullable:false, unique:true
course blank:false, nullable:false


    }
}
