<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Editar Cliente</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="EditarCliente" method="post">
	Nombre: <input type="text" name="txtnombre" value="${datoscliente.getNombre()}" /><br/>	
	Telefono: <input type="text" name="txttelefono" value="${datoscliente.getTelefono()}" /> <br/>
	Direccion: <input type="text" name="txtdireccion" value="${datoscliente.getDireccion()}" /> <br/>
	Correo electrónico: <input type="correo" name="txtcorreo" value="${datoscliente.getCorreo()}" /> <br/>
	Rubro: <input type="text" name="txtrubro" value="${datoscliente.getRubro()}" /> <br/>
	<input type="hidden" name="hdnidcliente"  value="${datoscliente.getIdcliente()}" />
	<input type="submit" value="Agregar cliente" />
</form>

<a href="${pageContext.request.contextPath}/listadoCliente">Volver al listado de clientes</a>

</body>
</html>