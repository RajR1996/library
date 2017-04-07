<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Book Search Form for Students</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

	<div class="row">
			<h1>Student Search Form</h1>
		
		<formset>
		<legend> Seach Form for Students to find Books</legend>
		<table>
		<g:form action="results">

		<tr>
			<td>Title</td>
			<td><g:textField name="title" /></td>
		</tr>

		<tr>
			<td>Subject</td>
			<td><g:textField name="subject" /></td>
		</tr>

		<tr>
			<td>Author</td>
			<td><g:textField name="author" /></td>
		</tr>
	
		<tr>
			<td>Query Type:</td>
			<td><g:radioGroup name="queryType" labels="['And','Or','Not']"
	 		values="['and','or','not']" value="and" >
			${it.radio} ${it.label}
			</g:radioGroup>
			</td>
		</tr>

		<tr>
		
		<td/>

		<td>
			<g:submitButton name="search" value="Search"/>
		</td>

		</tr>
		
		</g:form>
		
		</table>

	</formset>
</div>

</body>

</html>

