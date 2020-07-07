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
 <h1 style="text-align:center">Registro de clientes</h1>
 
<form action="" method="get">

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
  
      <td colspan="2" align="center"><input type="submit" name="button" id="button" value="Enviar"></td>
    </tr>
  </table>
  <p><br>
  </p>
</form>
 
</body>
</html>