package com.rravichandran

class Book {
String title
String subject
String author
String isbn
date dateBorrowed
date returnDate
Student name
Boolean overdue
String toString()
{
return name }

static hasMany=[book reviews: BookReview]

    static constraints = {
title blank:false, nullable:false
subject blank:false, nullable:false
author blank:false, nullable:false
isbn blank:false, nullable:false, unique:true
dateBorrowed blank:false, nullable:false
returnDate blank:false, nullable:false
name blank:false, nullable:false
overdue blank:false, nullable:false

    }
}
