<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Every Character in Account</title>
</head>
<body>

<h2>Character List</h2>
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

</body>
</html>