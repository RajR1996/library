package com.rravichandran

class Student {
String name
String email
String username
String password
int studentId
Course title
String toString()
{
return title }


    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email:true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false, password:true
studentId blank:false, nullable:false, unique:true
title blank:false, nullable:false

    }
}
