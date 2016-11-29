<%@page import="java.util.Locale"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%> 
<%@ page language = "java" contentType = "text/html; charset =utf-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
        <script src="../js/script.js"></script>
<title>Login Secretaria</title>


<style media="screen">
.espacio {
	text-align: center;
	padding-top: 50px;
	padding-bottom: 50px;
	font-family: sans-serif;
	color: white;
	background-color: #4B7CB1;
}

.espacio2 {
	padding-bottom: 70px;
}

.parrafo {
	font-family: sans-serif;
	font-weight: bold;
}
</style>
</head>

<body>
<%--tag decomentario declaracion de variable--%>
<%! Date fechaActual= new Date(); %>
<%! DateFormat fechaActualFormato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", new Locale("es","ES"));%>

	<div class="espacio">
		<h1>
			Secretaria
			</h>
	</div>
	<!--  Espacio despues del titulo-->
	<div class="espacio2"></div>
	<div class="row">
		<!-- espacio lado izquierdo -->
		<div class="col-md-2"></div>

		<div class="col-md-4">
			<p class="parrafo">SIAP es un sistema dedicado a la
				administración de pruebas patológicas dentro del laboratorio de
				anatomia patológica del Hospital de especialidades Eugenio Espejo</p>
                        <br>
                        <h4>Hoy es: <%=fechaActualFormato.format(fechaActual) %> </h4>
		</div>
		<div class="col-md-4">
                    <form action="..\lg" class="form-horizontal" method="POST" >
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-3 control-label">Email</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="txtEmail" id="email"
							placeholder="Email">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-3 control-label">Contraseña</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" name="txtContra"
							placeholder="Contraseña">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Ingresar</button>
						<button type="submit" class="btn btn-primary">Registro</button>
						
                                                <input type="button" value="Saludar" class="btn btn-primary" onclick="saludo()"/>
					</div>
				</div>
			</form>
		</div>
		<%--Scriplets Bloque de codigo --%>
		
<!--		<table border="1">
		  <thead>
		
				<td>Usuario</td>
				<td>Nombre</td>
		
		  </thead>
		  <%-- Unir el codigo con html --%>
                  <% for(int i=0; i< 8; i++) {%>
		  	<tr>
                            
		  		<td><%=i %></td>
				<td><%=i %></td>
		  	</tr>
                        <% }%>
		</table>
		
		-->
		<!-- Espacio derecho -->
		<div class="col-md-2"></div>
		
	</div>
</body>

</html>
