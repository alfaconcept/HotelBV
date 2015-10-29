<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>

</div>

Código de Hospedagem: ${hospedagem.cdHospedagem }<br>
Código do Cliente: ${hospedagem.reserva.cliente.cdPessoa }<br>
Código da Reserva: ${hospedagem.reserva.cdReserva }<br>
Número do Quarto: ${hospedagem.reserva.quarto.nrQuarto }<br>
Código do Funcionário: ${hospedagem.funcionario.cdPessoa }<br>
<fmt:formatDate value="${hospedagem.dtEntrada }" var="dtEntrada" type="date" pattern="dd/MM/yy"/>
Data de Check In: ${dtEntrada } <br>
<fmt:formatDate value="${hospedagem.dtSaida }" var="dtSaida" type="date" pattern="dd/MM/yy" />
Data de Check Out: ${dtSaida } <br>
</body>
</html>