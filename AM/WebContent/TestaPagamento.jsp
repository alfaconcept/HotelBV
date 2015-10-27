<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulário de pagamento</title>
</head>
<body>
<form action="ServletPagamento?action=checkOut" method="POST">
	<label>Código de hospedagem: <input type="text" name="nrHospedagem"></label>
	<input type="submit" value="Procurar">	
</form>
</body>
</html>