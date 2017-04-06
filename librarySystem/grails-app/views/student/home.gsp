<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Student part of Library System</title>
    <asset:stylesheet src="librarysystem.css"/>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    

    <div id="content" role="main">

    <div class="row">

	<div class="first">

		<h2>Book Reviews</h2>
		<p>Here you can create and list the reviews for all books</p>
		<button type="button" class"btn btn-success">
		<g:link controller="bookReview" action="create">Add a Book Review</g:link>
		</button>

		<button type="button" class="btn btn-success">
		<g:link controller="bookReview" action="index">List Book Reviews</g:link>
		</button>
	</div>

	<div class="second">
	
		<h2>Books</h2>
		<p>Here you can see a list of all the books</p>
		<button type="button" class"btn btn-success">
		<g:link controller="book" action="index">List Books</g:link>
		</button>
	</div>	
	
		
	<div class="first">

		<h2>Search Form</h2>
		<p>Search for Books using title, subject or author</p>
		<button type="button" class"btn btn-success">
		<g:link controller="student" action="search">Search Books</g:link>
		</button>
	</div>

	<div class="second">
	
		<h2>Book Index</h2>
		<p>List of all books in JSON</p>
		<button type="button" class"btn btn-success">
		<g:link controller="book" action="bindex">Book Index</g:link>
		</button>
	</div>	
		
	<div class="first">

		<h2>Book Show</h2>
		<p>View a book in JSON to see if it's overdue or not</p>		
		<button type="button" class"btn btn-success">
		<g:link controller="book" action="bshow">Action Show</g:link>
		</button>
	</div>

	<div class="second">
	
		<h2>Book Delete</h2>
		<p>Delete a book using JSON"  </p>
		<button type="button" class"btn btn-success">
		<g:link controller="book" action="bdelete">Book Delete</g:link>
		</button>
	</div>	

	</div>
	</div>
</body>
<html>
