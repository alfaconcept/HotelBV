<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html class="full" lang="en">


<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Hotel Boa Viagem</title>

    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="css/bootstrap-theme.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="css/bootstrap-theme.css">

<!-- Optional theme -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script>

<!-- CSS -->
<!-- <link href="css/style.css" rel="stylesheet"> -->

</head>

<body>

    <!-- Navegacao -->
    <nav class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
        <div class="container">
            <!-- display responsivo -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Navegacao</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><img src="img/logo_branco.png"></a>
            </div>
            <!-- menu -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">Sobre o hotel</a>
                    </li>
                    <li>
                        <a href="#">Reserve Ja</a>
                    </li>
                    <li>
                        <a href="#"><span class="glyphicon glyphicon-phone"></span>Boa Viagem Mobile</a>
                    </li>
                    <li>
                        <a href="#">Acesso Funcionario</a>
                    </li>
                </ul>
                
            </div>
           
        </div>
        
    </nav>

    <!-- Inicio do container -->
    <div class="container">
            <br>  
            <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="row">
                                <form role="form" action="ServletReserva?action=reservar" method="post" id="formReserva">
                                    <div class="col-md-6">
                                    
                                       
                                    <div class="panel panel-default" width="300px">
                                        <div class="panel-heading">
                                            <h3 class="panel-title">
                                                Escolha seu quarto
                                            </h3>
                                        </div>
                                        <div class="panel-body">

                                            <input type="radio" name="rdQuarto" id="rdStandard" value="standard" checked="checked"> 
                                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<label for="radios"><img src="img/standard_v2.png" class="img-thumbnail"></label>   
                                            </div>
                                        
                                        <div class="panel-body">
                                            <input type="radio" name="rdQuarto" id="rdMaster" value="master">
                                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src="img/master.png" class="img-thumbnail">
                                        </div>

                                        <div class="panel-body">
                                            <input type="radio" name="rdQuarto" id="rdLuxo" value="luxo">
                                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src="img/luxo.png" class="img-thumbnail">
                                        </div>

                                        <div class="panel-body">
                                            <input type="radio" name="rdQuarto" id="rdMasterLuxo" value="master luxo">
                                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src="img/master_luxo.png" class="img-thumbnail">
                                        </div>

                                        <div class="panel-footer">
                                           <div class="alert alert-success alert-dismissable">
                 
                                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                                �
                                            </button>
                                            <h4>
                                                Aten��o!
                                            </h4>Apenas o quarto <strong>LUXO</strong> possui hidro, e apenas o quarto <strong>MASTER LUXO</strong> possui sauna. 
                                        </div> 
                                        </div>
                                    </div>
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="button1id"></label>
                                     
                                    </div>
                                        
                                    </div>

                                    <div class="col-md-6">

                                    <center><img src="img/topo_reservar.png" class="img-responsive"></center>
                                        
                                            <div class="form-group">
                                                 
                                                <label for="nomeHospede">
                                                    Nome:
                                                </label>
                                                <input type="text" name="txtNome" class="form-control" value="${reserva.cliente.nmPessoa }"/>
                                            </div>

                                            <div class="form-group">
                                            <label for="emailHospede">
                                                    E-mail:
                                                </label>
                                                <input type="email" name="txtEmail" class="form-control" />
                                            </div>
                                            
											<div class="form-group">
                                            <label for="senhaHospede">
                                                   Senha:
                                                </label>
                                                <input type="password" name="pwdSenha" class="form-control" />
                                            </div>


                                            <div class="form-group">
                                                 
                                                <label for="dataEntrada">
                                                    Data de Entrada: 
                                                </label>
                                                <input type="date" name="dtEntrada"/>

                                                 <label for="dataSaida">
                                                    &nbspData de Sa�da: 
                                                </label>
                                                <input type="date" name="dtSaida"/>

                                            </div>

                                            
                                            <div class="form-group">
                                              
                                                
                                                <label for="radios">Qtde. Adultos:&nbsp</label>

                                                <label class="radio-inline" for="radios-3">
                                                  <input type="radio" name="rdAdulto" id="radios-0" value="0" checked="checked">
                                                  0
                                                </label>
                                              
                                                <label class="radio-inline" for="radios-0">
                                                  <input type="radio" name="rdAdulto" id="radios-1" value="1" >
                                                  1
                                                </label> 
                                                <label class="radio-inline" for="radios-1">
                                                  <input type="radio" name="rdAdulto" id="radios-2" value="2">
                                                  2
                                                </label> 
                                                <label class="radio-inline" for="radios-2">
                                                  <input type="radio" name="rdAdulto" id="radios-3" value="3">
                                                  3
                                                </label> 
                                                <label class="radio-inline" for="radios-3">
                                                  <input type="radio" name="rdAdulto" id="radios-4" value="4">
                                                  4
                                                </label>

                                                <br><br>

                                                <label for="radios">Qtde. Crian�as: </label>

                                              <label class="radio-inline" for="radios-0">
                                                  <input type="radio" name="rdCrianca" id="radios-0" value="0" checked="checked">
                                                  0
                                                </label> 
                                                <label class="radio-inline" for="radios-0">
                                                  <input type="radio" name="rdCrianca" id="radios-0" value="1">
                                                  1
                                                </label> 
                                                <label class="radio-inline" for="radios-1">
                                                  <input type="radio" name="rdCrianca" id="radios-1" value="2">
                                                  2
                                                </label> 
                                                <label class="radio-inline" for="radios-2">
                                                  <input type="radio" name="rdCrianca" id="radios-2" value="3">
                                                  3
                                                </label> 
                                                <label class="radio-inline" for="radios-3">
                                                  <input type="radio" name="rdCrianca" id="radios-3" value="4">
                                                  4
                                                </label>
                                                
                                                <br><br>
                                                
                                                <label for="radios">Qtde. Quartos: </label>
                                                <label class="radio-inline" for="radios-0">
                                                  <input type="radio" name="rdQtdQuarto" id="radios-0" value="1" checked="checked">
                                                  1
                                                </label> 
                                                <label class="radio-inline" for="radios-1">
                                                  <input type="radio" name="rdQtdQuarto" id="radios-1" value="2">
                                                  2
                                                </label> 
                                                <label class="radio-inline" for="radios-2">
                                                  <input type="radio" name="rdQtdQuarto" id="radios-2" value="3">
                                                  3
                                                </label> 
                                                <label class="radio-inline" for="radios-3">
                                                  <input type="radio" name="rdQtdQuarto" id="radios-3" value="4">
                                                  4
                                                </label>

                                            </div>
                                           <div class="form-group">
                                                 <label for="dataEntrada">
                                                    Observa��o: 
                                                </label>
                                                <textarea class="form-control" id="textarea" name="txtObservacao">Ex.: Fumante.</textarea>
                                            </div>

                                            <center><br>
                                            
                                            <c:choose>
                                            	<c:when test="${empty reserva }">
                                            		<a href="#" onclick="document.getElementById('formReserva').submit()" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-shopping-cart"></span> GERAR RESERVA</a>
                                            	</c:when>
                                            	<c:when test="${not empty reserva }">
                                            		<a href="#" onclick="return confirm(Confirmar reserva?)" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-shopping-cart"></span> CONFIRMAR RESERVA</a>
                                            	</c:when>
                                            </c:choose>
                                            
                                            
                                            
                                            &nbsp<a href="#" class="btn btn-default btn-lg">Cancelar</a></center>
                                    </div>
									</form>
                                    </div>
                                </div>

                            </div>
                              
                            
                        </div>
            </div>
    </div>
    <!-- Fim do container -->
       
    </div>

    <div id="modalReserva" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
     
    <!-- Modal para logar ou cadastrar -->

    <div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="row"><br>
            <center><img src="img/hotel_preto.png"></center>
                <div class="col-md-6">
                    <h3 class="text-center"><br>
                        Ja tenho cadastro<br>
                    </h3>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                             
                            <label for="inputEmail3" class="col-sm-2 control-label">
                                Email
                            </label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" id="inputEmail3" />
                            </div>
                        </div>
                        <div class="form-group">
                             
                            <label for="inputPassword3" class="col-sm-2 control-label">
                                Senha
                            </label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="inputPassword3" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                     
                                    <label>
                                        <input type="checkbox" /> Nao me deixe esquecer
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                 
                                <button type="submit" class="btn btn-default">
                                    Acessar sua Conta
                                </button>
                            </div>
                        </div>
                    </form>
                    <div class="alert alert-dismissable alert-success">
                         
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                            �
                        </button>
                        <h4>
                            Hospede!
                        </h4> <strong>Atencao!</strong> Dispon�vel somente para pessoas f�sicas. <a href="#" class="alert-link">Leia o Regulamento</a>
                    </div>
                </div>
                <div class="col-md-6">
                    <h3 class="text-center"><br>
                        Ainda nao tenho cadastro<br>
                    </h3>
                    <dl>
                        <dt>
                            Nao perca essa oportunidade
                        </dt>
                        <dd>
                            Otimos precos com varias opcoes de pagamento.
                        </dd>
                        <dt>
                            Seguranca
                        </dt>
                        <dd>
                            Nosso sistema de reserva tem a qualidade Alfa Concept.
                        </dd>
                        <dd>
                            Suas informacoes estarao seguras conosco.
                        </dd>
                        <dt>
                            Qualidade
                        </dt>
                        <dd>
                            Garantimos qualidade, sendo o melhor hospedeiro da regiao.
                        </dd><br>
                        
                        <dd>
                            Clique no botao abaixo, e faca seu cadastro!
                        </dd>
                    </dl> 
                    <button type="button" class="btn btn-lg btn-success">
                        <center>Ok! Quero me cadastrar</center>
                    </button><br><br>
                </div>
            </div>
        </div>
        <div class="modal-footer">
                             
                            <button type="button" class="btn btn-default" data-dismiss="modal">
                                Sair
                            </button> 
                            
                        </div>
    </div>
</div>

    </div>
  </div>
</div>

    

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
