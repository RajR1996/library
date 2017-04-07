<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Librarian Search Results</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

	<div class="row">
			<h1>Librarian Search Results</h1>
			<p>Search for students <em>${term}</em>.
			Found <strong>${students.size()}</strong> students.
			</p>
			<ul>

		<g:each var="student" in="${students}">
		<li><g:link controller="student" action="show"
			id="${student.id}">${student.name}
		</g:link></li>

		</g:each>
	
		</ul>
		
		<br>

		<g:link action='search'>Search Again</g:link>

	</div>

</body>

</html>
		
		

