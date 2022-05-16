<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=index href=index.jsp>
<link rel=showCharacter href=showCharacter.jsp>
<link rel=noResult href=noResult.jsp>
<title>Dnd Character</title>
</head>
<body>
	<h1>THIS IS THE SHOW JSP</h1>
	<h1>SHOWING CHARACTER BY ID</h1>
	<a href=index.do>HOME</a>
</head>
<body>

	${DEBUG}
	
	${dndCharacters}
	
	<br>
	<div>
		<h2>Character List</h2>
		<ul>
			<c:forEach var="dndChar" items="${dndCharacters}">
				<li><a><strong>Character ID:</strong> </a>${dndChar.id}</li>
				<li><a><strong>Name:</strong> </a>${dndChar.characterName}</li>
				<li><a><strong>Class: </strong></a>${dndChar.characterClass}</li>
				<li><a><strong>Race: </strong></a>${dndChar.race}</li>
				<li><a><strong>Strength: </strong></a>${dndChar.strength}</li>
				<li><a><strong>Dexterity: </strong></a>${dndChar.dexterity}</li>
				<li><a><strong>Intelligence: </strong></a>${dndChar.intelligence}</li>
				<li><a><strong>Wisdom: </strong></a>${dndChar.wisdom}</li>
				<li><a><strong>Charisma: </strong></a>${dndChar.charisma}</li>
				<br>
				<br/>
				
			</c:forEach>
		</ul>
	</div>
	<br>
	<div>
	<a href=index.do>HOME Page</a>
	<a href="showCharacter.do">Return to main page</a>
	</div>
</body>
</html>