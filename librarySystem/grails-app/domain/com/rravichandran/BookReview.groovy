package com.rravichandran

class BookReview {
String bookReview
Book book
Date dateMade
Student student
String review

String toString()
{
return bookReview }



    static constraints = {
bookReview blank:false, nullable:false
book blank:false, nullable:false
dateMade blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false



    }
}
