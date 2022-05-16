<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Dnd Character</title>
</head>
<body>

<h3>Create new Dnd Character</h3>
		<form action="createNewDndCharacterEntity.do" method="GET">
			<label for="id">Enter Character Name</label> 
			<input type="text" name="name" id="name"/> 
			<label for="id">Enter Character job</label> 
			<input type="text" name="job" id="job"/>
			<label for="id">Enter Character race</label> 
			<input type="text" name="race" id="race"/>  
			<input type="submit" value="Create Character">
		</form>
	<br>
	<hr>	
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/index.jsp">Home Page Link</a>
	<hr>
</body>
</html>