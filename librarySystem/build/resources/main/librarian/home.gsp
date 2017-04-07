<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Librarian part of Library System</title>
    <asset:stylesheet src="librarysystem.css"/>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    

    <div id="content" role="main">

    <div class="row">

	<div class="first">

		<h2>Students</h2>
		<p>Here you can add, create and register students</p>
		<button type="button" class"btn btn-success">
		<g:link controller="student" action="create">Add Student</g:link>
		</button>
	</div>

	<div class="second">
	
		<h2>Books</h2>
		<p>Here you can add books to the library and create book instances</p>
		<button type="button" class"btn btn-success">
		<g:link controller="book" action="create">Add Book</g:link>
		</button>
	</div>

	<div class="first">

		<h2>Courses</h2>
		<p>Here you can enter course details and create courses</p>
		<button type="button" class"btn btn-success">
		<g:link controller="course" action="create">Add Course</g:link>
		</button>
	</div>
	
	<div class="second">
	
		<h2>Librarians</h2>
		<p>Here you can register other librarians and create librarian instances</p>
		<button type="button" class"btn btn-success">
		<g:link controller="librarian" action="create">Add Librarian</g:link>
		</button>
	</div>
		
	<div class="first">

		<h2>Search Form</h2>
		<p>Search for Students using name, username or email</p>
		<button type="button" class"btn btn-success">
		<g:link controller="librarian" action="search">Search Form</g:link>
		</button>
	</div>
		

	</div>
	</div>
</body>
<html>
