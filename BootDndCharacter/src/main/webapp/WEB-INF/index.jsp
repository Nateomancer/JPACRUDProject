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
<%@ include file="nav.jsp" %>

	<h1>SD Dungeons & Dragons Character Manager</h1>
	<!--FIND CHARACTER BY ID  -->
	${DEBUG} 
	<div>
		<!--FIND CHARACTER BY ID  -->
		<br>
		<hr>
		<h3>Search for Character with their ID</h3>
		<form action="showCharacter.do" method="GET">
			<label for="id">Enter Character ID:</label> 
			<input type="number" name="id" id="id" min=1 max=100 /> 
			<input type="submit" value="Find Character">
		</form>
		RESULT:	${dndCharIdResult} 
	</div>
	
	<hr>
	<br>
	<div>
		<!--FIND CHARACTER BY NAME  -->
		<h3>Search for Character with Characters Name</h3>
		<form action="findCharacterByName.do" method="GET">
			<label for="name">Enter Character Name:</label> 
			<input type="text"name="name" id="name" /> <input type="submit"value="Find Character">
		</form>
		<br>
		RESULT: ${dndCharNameResult}
	</div>

	<br>
	<hr>
	<div>
		<!--FIND CHARACTER BY CLASS OR RACE-->
		<h3>Search for Character by job and race</h3>
		<form action="findCharacterByJobAndRace.do" method="GET">
			<label for="job">Enter Character Job:</label> 
			<input type="text" name="job" id="job" /> 
			<label for="race">Enter Character Race:</label> <input type="text" name="race" id="race" />
			<input type="submit" value="Find Character">
		
		</form>
		<br>
		RESULT: ${dndCharJobAndRaceResultList}	
	</div>
	<br>
	<hr>
	
	
	<div>
		<h2>Character Table</h2>
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
	<hr>
	<br>
	<div>
	<h2>NavLinks</h2>
	<nav>
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/showCharacter.jsp"> Find Character </a>
		<a href="showCharacter.do>">showCharacter.do</a></p>
		
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/character/createCharacter.jsp"> New Character</a>
		<a href="newCharacter.do"> newCharacter.do</a></p>
		
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/character/deleteCharacter.jsp">Delete Character</a>
		<a href="deleteCharacter.do">deleteCharacter.do</a></p>
		
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/character/showAllCharacters.jsp">Show All Characters</a>
		<a href="getAllCharacters.do"> getAllCharacters.do</a></p>
			
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/index.jsp">Home Page Link</a>
		<a href="index.do">index.do</a></p>
	
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/noResult.jsp">No Result Link</a>
		<a href="noResult.do">noResult.Do</a></p>
	
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/operationSuccessful.jsp">CRUD Operation Successful</a>
		<a href="operationSuccesful.do">operationSuccessful.do</a></p>
		
	<p><a href="/BootDndCharacter/src/main/webapp/WEB-INF/operationSuccessful.jsp">CRUD Operation Failed</a>
		<a href="operationFailed.do">operationFailed.do</a></p>
		</nav>
	</div>
</body>
</html>