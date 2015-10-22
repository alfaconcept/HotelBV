<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Nome do Cliente: ${reserva.cliente.nmPessoa}<br>
Email do Cliente: ${reserva.cliente.dsEmail }<br>
Senha do Cliente: ${reserva.cliente.dsSenhaAcesso }<br>
Numero do quarto: ${reserva.tipoQuarto.nrQuarto }<br>
<!-- A linha abaixo formata a data para exibição -->
<fmt:formatDate value="${reserva.dtEntrada }" var="dtSolicitacaoFormat" type="date" pattern="dd/MM/yyyy"/>
Data de solicitação sem formatação: ${reserva.dtSolicitacao}<br>	
Data de Solicitação formatada: ${dtSolicitacaoFormat }<br>
<!-- A linha abaixo formata a data para exibição -->
<fmt:formatDate value="${reserva.dtEntrada }" var="dtEntradaFormat" type="date" pattern="dd/MM/yyyy"/>	
Data de Entrada: ${dtEntradaFormat }<br>
<!-- A linha abaixo formata a data para exibição -->
<fmt:formatDate value="${reserva.dtEntrada }" var="dtSaidaFormat" type="date" pattern="dd/MM/yyyy"/>	
Data de Saída: ${dtSaidaFormat }<br>
Quantidade de Adultos: ${reserva.qtAdulto }<br>
Quantidade de Crianças: ${reserva.qtCrianca }<br>
Quantiade de Quartos: ${reserva.qtQuarto }<br>
Valor da Reserva: R$${reserva.vlrReserva }
</body>
</html>