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
	<h2>Assignation Cargaison à Société de Transport</h2>
	<div>
		<f:form modelAttribute="societeTransport" method="POST"
			action="attribuerUpdate">


			<div>
				<span class="btn">Sociétés de transport</span> <select name="idSociete">
					<optgroup>
						<option value="0">---</option>
						<c:if test="${not empty societeTransports}">
							<c:forEach items="${societeTransports}" var="s">
								<option value="${s.idSociete}"><c:out
										value="${s.nomSociete},${s.numSiret},${s.dateCreation}"></c:out></option>
							</c:forEach>
						</c:if>
					</optgroup>
				</select>

			</div>

			<div>
				<span class="btn">Cargaison</span> <select name="idCargaison">
					<optgroup>
						<option value="0">---</option>
						<c:if test="${not empty cargaisons}">
							<c:forEach items="${cargaisons}" var="c">
								<option value="${c.idCargaison}"><c:out
										value="${c.nomCargaison},${c.depart},${c.destination}"></c:out></option>
							</c:forEach>
						</c:if>
					</optgroup>
				</select>

			</div>

			<tr>
				<td><input type="submit" value="enregistrer" /></td>
			</tr>

		</f:form>
	</div>


	<!-- 
	<div id="listProduits">
		<table class="table1">
			<tr>
				<th>ID</th>
				<th>NOM</th>
				<th>N° SIRET</th>
				<th>Date de Création</th>
			</tr>
			<c:forEach var="s" items="${societeTransports}">
				<tr>
					<td>${s.idSociete}</td>
					<td>${s.nomSociete}</td>
					<td>${s.numSiret}</td>
					<td>${s.dateCreation}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div id="listProduits">
		<table class="table1">
			<tr>
				<th>ID CARGAISON</th>
				<th>NOM CARGAISON</th>
				<th>DEPART</th>
				<th>DESTINATION</th>
				<th>IMMATRICULATION</th>
				<th>PEAGE</th>
			</tr>
			<c:forEach var="r" items="${routieres}">
				<tr>
					<td>${r.idCargaison}</td>
					<td>${r.nomCargaison}</td>
					<td>${r.depart}</td>
					<td>${r.destination}</td>
					<td>${r.immatriculation}</td>
					<td>${r.peage}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div id="listProduits">
		<table class="table1">
			<tr>
				<th>ID CARGAISON</th>
				<th>NOM CARGAISON</th>
				<th>DEPART</th>
				<th>DESTINATION</th>
				<th>NUM VOL</th>
				<th>TAXE</th>
			</tr>
			<c:forEach var="a" items="${aeriennes}">
				<tr>
					<td>${a.idCargaison}</td>
					<td>${a.nomCargaison}</td>
					<td>${a.depart}</td>
					<td>${a.destination}</td>
					<td>${a.numVol}</td>
					<td>${a.taxe}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	 -->
</body>
</html>