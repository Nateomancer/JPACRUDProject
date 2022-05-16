<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link rel=index href=index.jsp>
<link rel=showCharacter href=showCharacter.jsp> -->
<title>Welcome Friend</title>
</head>
<body>

	<h1>SD Dungeons & Dragons Character Manager</h1>
	<!--FIND CHARACTER BY ID  -->
	<div>
		<!--FIND CHARACTER BY ID  -->
		<br>
		<hr>
		<h3>Search for Character with their ID</h3>
		<form action="findCharacterById.do" method="GET">
			<label for="id">Enter Character ID:</label> 
			<input type="number" name="id" id="id" min=1 max=100 /> 
			<input type="submit" value="Find Character">
		</form>
		RESULT:	${dndCharIdResult} 
		
		<ul>
				<li><a><strong>Character ID:</strong> </a>${dndCharIdResult.id}</li>
				<li><a><strong>Name:</strong> </a>${dndCharIdResult.name}</li>
				<li><a><strong>Class: </strong></a>${dndCharIdResult.job}</li>
				<li><a><strong>Race: </strong></a>${dndCharIdResult.race}</li>
				<li><a><strong>Strength: </strong></a>${dndCharIdResult.strength}</li>
				<li><a><strong>Dexterity: </strong></a>${dndCharIdResult.dexterity}</li>
				<li><a><strong>Constitution: </strong></a>${dndCharIdResult.constitution}</li>
				<li><a><strong>Intelligence: </strong></a>${dndCharIdResult.intelligence}</li>
				<li><a><strong>Wisdom: </strong></a>${dndCharIdResult.wisdom}</li>
				<li><a><strong>Charisma: </strong></a>${dndCharIdResult.charisma}</li>
		
		</ul>
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
		RESULT: ${dndCharJobRaceSearchResult}	
	</div>
	<br>
	<hr>
	<div>
	<h3>Create Character</h3>
	<form action="createNewDndCharacter.do" method="GET">
	
			<label for="name">Enter Character Name:</label> 
			<input type="text"name="name" id="name" /> 
			<label for="job">Enter Character Job:</label> 
			<input type="text" name="job" id="job" /> 
			<label for="race">Enter Character Race:</label> 
			<input type="text" name="race" id="race" />
			<input type="submit" value="Create Character">
	
	</form>
	</div>
	<hr>
	<div>
	<h3>Update Character</h3>
	<form action="updateExistingDndCharacter.do" method="GET">
	
			<label for="id">Enter Character ID:</label> 
			<input type="number" name="id" id="id" /> 
			
			<label for="name">Enter Character Name:</label> 
			<input type="text" name="name" id="name" />
			
			<label for="job">Enter Character Job:</label> 
			<input type="text" name="job" id="job" /> 
			
			<input type="submit" value="Update Character">
	
	</form>
	</div>
	<hr>
	<div>
	<h3>Delete Character</h3>
	<form action="deleteExistingDndCharacter.do" method="GET">
	
			<label for="id">Enter Character ID:</label> 
			<input type="number"name="id" id="id" /> 
			<input type="submit" value="Delete Character">
	<hr>
	</form>
	</div>
	<div>
		<h2>Character Table-Lists all Characters</h2>
		<form action="index.do" method="GET">
		<input type="submit" value="Refresh Table">
		</form>
	<table>
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Job</th>
				<th scope="col">Race</th>
				<th scope="col">Strength</th>
				<th scope="col">Dexterity</th>
				<th scope="col">Constitution</th>
				<th scope="col">Intelligence</th>
				<th scope="col">Wisdom</th>
				<th scope="col">Charisma</th>
			</tr>
		</thead>
		
			<c:forEach var="dndChar" items="${dndCharacters}"> 
			<tr>
			
			<td>${dndChar.id}</td>
			<td>${dndChar.name}</td>
			<td>${dndChar.job}</td>
			<td>${dndChar.race}</td>
			<td>${dndChar.strength}</td>
			<td>${dndChar.dexterity}</td>
			<td>${dndChar.constitution}</td>
			<td>${dndChar.intelligence}</td>
			<td>${dndChar.wisdom}</td>
			<td>${dndChar.charisma}</td>
			</tr>
			</c:forEach>
			</table>	
	</div>
	<hr>
	<br>
	<div>
	<h2>NavLinks</h2>
	<nav>
	<p><a href=https://www.dndbeyond.com/>Visit Dnd Beyond for help  creating a Character</a></p>
	<p><a href=https://dnd.wizards.com/> Visit Dnd Wizards for more dnd info</a></p>
	</nav>
	</div>
</body>
</html>