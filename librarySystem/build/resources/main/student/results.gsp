<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Student Search Results</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

	<div class="row">
			<h1>Student Search Results</h1>
			<p>Search for books <em>${term}</em>.
			Found <strong>${books.size()}</strong> books.
			</p>
			<ul>

		<g:each var="book" in="${books}">
		<li><g:link controller="book" action="show"
			id="${book.id}">${book.title}
		</g:link></li>

		</g:each>
	
		</ul>
		
		<br>

		<g:link action='search'>Search Again</g:link>

	</div>

</body>

</html>
		
