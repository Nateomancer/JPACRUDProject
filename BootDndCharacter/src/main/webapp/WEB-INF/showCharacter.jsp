<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dnd Character</title>
</head>
<body>
	<h1>THIS IS THE SHOW JSP</h1>
	<h1>SHOWING CHARACTER BY ID</h1>
	<a href=index.do>HOME</a>
</head>
<body>

}

<h3>Character List from example</h3>
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


<br>
<br>
<h3>Character Table from film project</h3>
	<div>
		<table>
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Class</th>
					<th scope="col">Race</th>
					<th scope="col">Strength</th>
					<th scope="col">Dexterity</th>
					<th scope="col">Constitution</th>
					<th scope="col">Intelligence</th>
					<th scope="col">Charisma</th>
					<th scope="col">Alignment</th>
					<th scope="col">Background</th>
					<th scope="col">Abilities</th>
				</tr>
			</thead>
			<tr>
				<td>${dndChar.id }</td>
				<td>${dndChar.CharacterName }</td>
				<td>${dndChar.charClass }</td>
				<td>${dndChar.race }</td>
				<td>${dndChar.strength }</td>
				<td>${dndChar.dexterity }</td>
				<td>${dndChar.constitution }</td>
				<td>${dndChar.intelligence }</td>
				<td>${dndChar.wisdom }</td>
				<td>${dndChar.charisma }</td>
			</tr>


			<%-- <td><form action="deleteFilm.do" method="POST">
				<input type="text" hidden="true" value="${film.id }" name="deleteId" /> 
				<input type="submit" value="Delete">
				</form></td>
				<td><form action="startEditFilm.do" method="POST">
				<input type="text" hidden="true" value="${film.id }" name="editId" /> 
				<input type="submit" value="Edit">
				</form></td>
		</tr> --%>

		</table>
	</div>

	<a href="home.do">Return to main page</a>
</body>
</html>