<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<legend>Formulário de Reserva</legend>
	<form action="ServletReserva?action=reservar" method="POST">
		<!-- Nome do Cliente: <input type="text" name="txtNmCliente"><br> -->
		Email do Cliente: <input type="email" name="txtEmail"><br>
		Senha do Cliente: <input type="password" name="pwdSenha"><br>
		Nome do quarto: <input type="text" name="txtNmQuarto"><br>	
		Data entrada: <input type="date" name="dtEntrada"><br>
		Data Saída: <input type="date" name="dtSaida"><br>
		Quantidade Adulto: <input type="text" name="nrQtdAdulto"><br>
		Quantidade Criança: <input type="text" name="nrQtdCrianca"><br>
		Quantidade quartos: <input type="text" name="nrQtdQuarto"><br>
		<input type="submit" value="Testar Reserva">
	</form>
</fieldset>
</body>
</html>