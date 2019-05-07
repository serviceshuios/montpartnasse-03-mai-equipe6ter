<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>
			<a href="http://localhost:8080/MavenSpringDataMvc/">HOME</a>
		</p>
	</div>

	<h2>CRUD SOCIETES DE TRANSPORT</h2>
	<div>
		<f:form modelAttribute="societeTransport" method="POST"
			action="saveSocieteTransport">
			<table>
				<tr>
					<td><f:hidden path="idSociete" /></td>
				</tr>
				<tr>
					<td>NOM:</td>
					<td><f:input path="nomSociete" /></td>
					<td><f:errors path="nomSociete" cssClass="error" /></td>
				</tr>
				<tr>
					<td>N° SIRET:</td>
					<td><f:input path="numSiret" /></td>
					<td><f:errors path="numSiret" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Date de Création:</td>
					<td><f:input path="dateCreation" type="date" /></td>
					<td><f:errors path="dateCreation" cssClass="error" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="enregistrer" /></td>
				</tr>

			</table>




		</f:form>
	</div>


	<div id="listProduits">
		<table class="table1">
			<tr>
				<th>ID</th>
				<th>NOM</th>
				<th>N° SIRET</th>
				<th>Date de Création</th>
				<th>SUPPRIMER</th>
				<th>MODIFIER</th>
			</tr>
			<c:forEach var="s" items="${societeTransports}">
				<tr>
					<td>${s.idSociete}</td>
					<td>${s.nomSociete}</td>
					<td>${s.numSiret}</td>
					<td>${s.dateCreation}</td>
					<td><a href="deleteSocieteTransport?idSociete=${s.idSociete}">supprimer</a></td>
					<td><a href="editSocieteTransport?idSociete=${s.idSociete}">editer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>