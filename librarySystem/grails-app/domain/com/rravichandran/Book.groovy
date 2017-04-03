package com.rravichandran

class Book {
String title
String subject
String author
String isbn
Date dateBorrowed
Date returnDate
Student student
Library library
Boolean overdue
String toString()
{
return title }

static hasMany=[bookreviews: BookReview]


    static constraints = {
title blank:false, nullable:false
subject blank:false, nullable:false
author blank:false, nullable:false
isbn blank:false, nullable:false, unique:true
dateBorrowed blank:false, nullable:false
returnDate blank:false, nullable:false
student blank:false, nullable:false
library blank:false, nullable:false
overdue blank:false, nullable:false

    }
}
