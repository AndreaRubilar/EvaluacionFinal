 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>El mundo de la asesoria</title>
<a href="/ListadoCliente">volver </a>
</head>
<body>

<h1>Lista de clientes</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<table>
	<tr>
		<th>ID</th>
		<th>Nombre</th>
		<th>Telefono</th>
		<th>Direccion</th>
		<th>Correo electrónico</th>
		<th>Rubro</th>
		<th>Eliminar</th>
		<th>Editar</th>
	</tr>

<c:forEach items="${listaclientes}" var="cliente">
	<tr>
		<td>${user.getId()} </td>
		<td>${user.getNombre()}</td>
		<td>${user.getTelefono()}</td>
		<td>${user.getDireccion()}</td>
		<td>${user.getCorreoelectronico()}</td>
		<td>${user.getRubro()}</td>
		<td>
			<a href="${pageContext.request.contextPath}/EliminarCliente?id=${user.getId()}">Eliminar</a>
			&nbsp;
			<a href="${pageContext.request.contextPath}/EditarCliente?id=${user.getId()}">Editar</a>
		</td>
	</tr>
</c:forEach>	
	
</table>

<a href="${pageContext.request.contextPath}/AgregarCliente">Agregar Cliente</a><br/>
<a href="${pageContext.request.contextPath}/CerrarSesion">cerrar </a><br/>

</body>
</html>