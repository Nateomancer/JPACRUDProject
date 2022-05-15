<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Friend</title>
</head>
<body>

	<h1>SD Dungeons & Dragons Character Manager</h1>
	<!--FIND CHARACTER BY ID  -->
	${DEBUG}
	${dndChar}

	<div>
		<h3>Search for Character with their ID</h3>
		<form action="showCharacter.do" method="GET">
		Enter Character ID: 
		<input type="text" name="id" /> 
		<input type="submit" value="Show Character">
			
		</form>
	</div>
	<br>
	<div>
	<h2>Character List</h2>
		<ul>
			<c:forEach var="dndChar" items="${characters}">
			 	<li><a><strong>Character ID:</strong>  </a>${dndChar.id}</li>
				<li><a><strong>Name:</strong>  </a>${dndChar.characterName}</li>
				<li><a><strong>Class:  </strong></a>${dndChar.charClass}</li>
				<li><a><strong>Race:  </strong></a>${dndChar.race}</li>
				<li><a><strong>Strength: </strong></a>${dndChar.strength}</li>
				<li><a><strong>Dexterity:  </strong></a>${dndChar.dexterity}</li>
				<li><a><strong>Intelligence:  </strong></a>${dndChar.intelligence}</li>
				<li><a><strong>Wisdom:  </strong></a>${dndChar.wisdom}</li>
				<li><a><strong>Charisma:  </strong></a>${dndChar.charisma}</li>
			</c:forEach>
		</ul>
	</div>
	
	<a href="showCharecter.do>">Show Character</a>
	<a href="newCharacter.do"> Add a new Character</a>
	<br>
	<a href="getAllCharacters.do"> Show a list of all characters</a>
	<!-- <input action="createFilm.do" method="get" type="submit" name="addNewFilm" id="addNewFilm" value="Create New Film" /> -->
	<br>
</body>
</html>