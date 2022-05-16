<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=index href=index.jsp>
<link rel=showCharacter href=showCharacter.jsp>
<title>Welcome Friend</title>
</head>
<body>

	<h1>SD Dungeons & Dragons Character Manager</h1>
	<!--FIND CHARACTER BY ID  -->
	${DEBUG} 
	<div>
		<!--FIND CHARACTER BY ID  -->
		<h3>Search for Character with their ID</h3>
		<form action="showCharacter.do" method="GET">
			<label for="id">Enter Character ID:</label> 
			<input type="number" name="id" id="id" min=1 max=100 /> 
			<input type="submit" value="Find Character">
		</form>
		RESULT:	${dndCharIdResult} 
		
	</div>
	<br>
	<div>
		<!--FIND CHARACTER BY NAME  -->
		<h3>Search for Character with Characters Name</h3>
		<form action="findCharacterByName.do" method="GET">
			<label for="name">Enter Character Name:</label> 
			<input type="text"name="name" id="name" /> <input type="submit"value="Find Character">
		</form>
		RESULT: ${dndCharNameResult}
	</div>

	<br>
	<div>
		<!--FIND CHARACTER BY CLASS OR RACE-->
		<h3>Search for Character with by class and race</h3>
		<form action="findCharacterByClassAndRace.do" method="GET">
			<label for="job">Enter Character Class:</label> 
			<input type="text" name="job" id="job" /> 
			<label for="race">Enter Character Race:</label> <input type="text" name="race" id="race" />
			<input type="submit" value="Find Character">
		</form>
		RESULT: ${dndCharResultList}	
	</div>
	<br>
	
	
	<div>
		<h2>Character List</h2>
		<ul>
			<c:forEach var="dndChar" items="${dndCharacters}">
				<li><a><strong>Character ID:</strong> </a>${dndChar.id}</li>
				<li><a><strong>Name:</strong> </a>${dndChar.name}</li>
				<li><a><strong>Class: </strong></a>${dndChar.job}</li>
				<li><a><strong>Race: </strong></a>${dndChar.race}</li>
				<li><a><strong>Strength: </strong></a>${dndChar.strength}</li>
				<li><a><strong>Dexterity: </strong></a>${dndChar.dexterity}</li>
				<li><a><strong>Constitution: </strong></a>${dndChar.constitution}</li>
				<li><a><strong>Intelligence: </strong></a>${dndChar.intelligence}</li>
				<li><a><strong>Wisdom: </strong></a>${dndChar.wisdom}</li>
				<li><a><strong>Charisma: </strong></a>${dndChar.charisma}</li>
			</c:forEach>
		</ul>
	</div>
	<br>
	<h2>Links</h2>
	<a href="showCharecter.do>">Show Character</a>
	<br>
	<a href="newCharacter.do"> Add a new Character</a>
	<!-- <input action="createCharacter.do" method="get" type="submit" name="addNewCharacter" id="addNewFilm" value="Create New Film" /> -->
	<br>
	<a href="getAllCharacters.do"> Show a list of all characters</a>
	<!-- <input action="createFilm.do" method="get" type="submit" name="addNewFilm" id="addNewFilm" value="Create New Film" /> -->
	<br>
</body>
</html>