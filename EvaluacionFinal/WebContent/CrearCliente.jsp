<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="estilo.css">
</head>
<body>

<h1>Crear cliente</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="AgregarCliente" method="get">

  <table width="25%">
    <tr>
      <td width="13%"><label for="nombre">Nombre: </label></td>
      <td width="87%"><input type="text" name="nombre" id="nombre"></td>
    </tr>
    <tr>
      <td><label for="telefono">Telefono:  </label></td>
      <td><input type="text" name="telefono" id="telefono"></td>
    </tr>
    <tr>
      <td><label for="direccion">Direccion: </label></td>
      <td><input type="text" name="direccion" id="direccion"></td>
    </tr>
    <tr>
      <td><label for="correo">Correo: </label></td>
      <td><input type="text" name="correo" id="correo"></td>
    </tr>
   <tr>
      <td><label for="rubro">Rubro: </label></td>
      <td><input type="text" name="rubro" id="rubro"></td>
    </tr>
    <tr>
       <a  href="ListadoCliente">AGREGAR</a>
     
    </tr>
  </table>
  <p><br>
  </p>
</form>

<a href="${pageContext.request.contextPath}/ListadoCliente">Volver al listado de clientes</a>

</body>
</html>