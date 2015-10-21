<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ServletReserva?action=reservar" method="GET">
	<input type="text" value="reservar" name="action">
	Data entrada: <input type="date" name="dtEntrada">
	Data Saída: <input type="date" name="dtSaida">
	Quantidade Adulto: <input type="text" name="nrQtdAdulto">
	Quantidade Criança: <input type="text" name="nrQtdCrianca">
	Quantidade quartos: <input type="text" name="nrQtdQuarto">
	<input type="submit" value="testar data">
</form>
</body>
</html>