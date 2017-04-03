package com.rravichandran

class BootStrap {

    def init = { servletContext ->

	def library1= new Library (
		building:'Adsetts',
		address:'Howard Street, Sheffield, S1 1WB',
		openingHours:'7:00am-12:00am',
		location:'Adsetts Learning Centre',
		studySpaces:300
	).save()

	def library2= new Library (
		building:'Owen',
		address:'Owen Street, Sheffield, S1 1WB',
		openingHours:'9:00am-5:00pm',
		location:'Owen Level 4',
		studySpaces:30
	).save()

	def course1= new Course (
		title:'Computing',
		code:'COM',
		leader:'Lynne Dawson',
		department:'Information Technology',
		description:'Everything tech related',
		studyMode:'Full-Time'
	).save()

	def course2= new Course (
		title:'Business',
		code:'BUS',
		leader:'Matthew Love',
		department:'Business & IT',
		description:'Everything business related',
		studyMode:'Part-Time'
	).save()

	def student1= new Student (
		name:'Joe Smith',
		email:'joe.smith@shu.ac.uk',
		userName:'joesmith',
		password:'password',
		studentId:1,
		course: course1
	).save()

	def student2= new Student (
		name:'Jane Franks',
		email:'jane.franks@shu.ac.uk',
		userName:'janefranks',
		password:'password',
		studentId:2,
		course: course2
	).save()

	def book1= new Book (
		title:'Coding Help',
		subject:'Information Technology',
		author:'John Steinbeck',
		isbn:'3245649867',
		dateBorrowed:new Date('21/01/2017'),
		returnDate:new Date('20/04/2017'),
		student: student1,
		library: library2,
		overdue: false
	).save()

	def book2= new Book (
		title:'Business Methods',
		subject:'Business',
		author:'Lee Smith',
		isbn:'2345438765',
		dateBorrowed:new Date('21/02/2017'),
		returnDate:new Date('21/04/2017'),
		student: student2,
		library: library1,
		overdue:false
	).save()

	def librarian1= new Librarian (
		name:'Jessica Bloggs',
		email:'jessica.bloggs@shu.ac.uk',
		office:'Adsetts 341',
		userName:'jessicabloggs',
		password:'password',
		telephone:'01149875638',
		library: library2
		).save()

	def librarian2= new Librarian (
		name:'Mark Stringfellow',
		email:'mark.stringfellow@shu.ac.uk',
		office:'Owen 401',
		userName:'markstringfellow',
		password:'password',
		telephone:'01149875687',
		library: library1
	).save()


	def bookreview1= new BookReview (
		bookReview:'Coding Help Review JS',
		book: book1,
		dateCreated: new Date('18/03/2015'),
		student: student1,
		review:'Helped programme an app'
	).save()

	def bookreview2= new BookReview (
		bookReview:'Business Methods Review JF',
		book: book2,
		dateCreated: new Date('20/03/2015'),
		student: student2,
		review:'Helped for a report'
	).save()

    }
    def destroy = {
    }
}


