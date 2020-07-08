<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body{
	background-color:#FFC;
}

table{
	background:#FF6;
	padding:10px;
	border:solid 2px #FF0000;
}

td{
	padding:5px 0;
}

</style>
</head>
<body>
<h1>Crear usuario</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="CrearCliente" method="post">
	Nombre: <input type="text" name="txtnombre" /><br/>
	Telefono: <input type="text" name="txttelefono" /> <br/>
	Correo electrónico: <input type="email" name="txtcorreo" /> <br/>
	Rubro: <input type="text" name="txtrubro" /> <br/>
	
	<a href="ListadoCliente">AGREGAR</a>
	
</form>

<a href="${pageContext.request.contextPath}/ListarCliente">Volver al listado de usuarios</a>

</body>
</html>
</html>