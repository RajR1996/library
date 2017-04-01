package com.rravichandran

class Librarian {
String name
String email
String office
String userName
String password
int telephone
Library building
String toString()
{
return building }



    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email:true
office blank:false, nullable:false
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false, password:true
telephone blank:false, nullable:false, size:11..11
library blank:false, nullable:false
    }
}
