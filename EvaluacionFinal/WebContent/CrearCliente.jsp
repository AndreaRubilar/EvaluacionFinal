<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Crear cliente</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="ListadoCliente" method="post">
	Nombre: <input type="text" name="txtnombre" /><br/>
	Telefono: <input type="text" name="txttelefono" /> <br/>
	Direccion: <input type="text" name="txtdireccion" /> <br/>
	Correo electrónico: <input type="email" name="txtcorreo" /> <br/>
	Rubro: <input type="text" name="txrubro" /> <br/>
	<input type="submit" value="Agregar cliente" />
</form>

<a href="${pageContext.request.contextPath}/ListarCliente">Volver al listado de clientes</a>

</body>
</html>