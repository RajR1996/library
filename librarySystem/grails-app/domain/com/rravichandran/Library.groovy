package com.rravichandran

class Library {
String building
String address
String openingHours
String location
int studySpaces
String toString(){
return building
}

static hasMany=[librarians: Librarian, books: Book, students: Student]

    static constraints = {
building blank:false, nullable:false
address blank:false, nullable:false
openingHours blank:false, nullable:false
location blank:false, nullable:false
studySpaces blank:false, nullable:false


    }
}


