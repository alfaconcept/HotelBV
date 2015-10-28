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

<script src="js/jquery.js"></script>

<!-- CSS -->
<!-- <link href="css/style.css" rel="stylesheet"> -->

</head>

<body>

	<!-- Navegacao -->
	<nav class="navbar navbar-inverse navbar-fixed-bottom"
		role="navigation">
		<div class="container">
			<!-- display responsivo -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Navegacao</span> <span class="icon-bar"></span>
					<span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><img src="img/logo_branco.png"></a>
			</div>
			<!-- menu -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">Sobre o hotel</a></li>
					<li><a href="#">Reserve Ja</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-phone"></span>Boa
							Viagem Mobile</a></li>
					<li><a href="#">Acesso Funcionario</a></li>
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

						<form role="form" action="ServletReserva?action=reserva"
							method="post">

							<div class="col-md-6">


								<div class="panel panel-default" width="300px">
									<div class="panel-heading">
										<h3 class="panel-title">Escolha seu quarto</h3>
									</div>
									<div class="panel-body">

										<input type="radio" name="rdQuarto" id="rdStandard"
											value="standard" checked="checked">
										&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<label for="radios"><img
											src="img/standard_v2.png" class="img-thumbnail"></label>
									</div>

									<div class="panel-body">
										<input type="radio" name="rdQuarto" id="rdMaster"
											value="master"> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img
											src="img/master.png" class="img-thumbnail">
									</div>

									<div class="panel-body">
										<input type="radio" name="rdQuarto" id="rdLuxo" value="luxo">
										&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src="img/luxo.png"
											class="img-thumbnail">
									</div>

									<div class="panel-body">
										<input type="radio" name="rdQuarto" id="rdMasterLuxo"
											value="master luxo"> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img
											src="img/master_luxo.png" class="img-thumbnail">
									</div>

									<div class="panel-footer">
										<div class="alert alert-success alert-dismissable">

											<button type="button" class="close" data-dismiss="alert"
												aria-hidden="true">×</button>
											<h4>Atenção!</h4>
											Apenas o quarto <strong>LUXO</strong> possui hidro, e apenas
											o quarto <strong>MASTER LUXO</strong> possui sauna.
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label" for="button1id"></label>

								</div>

							</div>

							<div class="col-md-6">

								<center>
									<img src="img/topo_reservar.png" class="img-responsive">
								</center>


								<img src="img/decorative.gif"
									class="img-responsive center-block"><br>



								<div class="form-group">

									<label for="dataEntrada"> Data de Entrada: </label> <input
										type="date" name="dtEntrada"> <label for="dataSaida">
										&nbspData de Saída: </label> <input type="date" name="dtSaida" />

								</div>


								<div class="form-group">


									<label for="radios">Qtde. Adultos:&nbsp</label> <label
										class="radio-inline" for="radios-0"> <input
										type="radio" name="rdAdulto" id="radios-1" value="1"
										checked="checked"> 1
									</label> <label class="radio-inline" for="radios-1"> <input
										type="radio" name="rdAdulto" id="radios-2" value="2">
										2
									</label> <label class="radio-inline" for="radios-2"> <input
										type="radio" name="rdAdulto" id="radios-3" value="3">
										3
									</label> <label class="radio-inline" for="radios-3"> <input
										type="radio" name="rdAdulto" id="radios-4" value="4">
										4
									</label> <br>
									<br> <label for="radios">Qtde. Crianças: </label> <label
										class="radio-inline" for="radios-0"> <input
										type="radio" name="rdCrianca" id="radios-0" value="0"
										checked="checked"> 0
									</label> <label class="radio-inline" for="radios-0"> <input
										type="radio" name="rdCrianca" id="radios-0" value="1">
										1
									</label> <label class="radio-inline" for="radios-1"> <input
										type="radio" name="rdCrianca" id="radios-1" value="2">
										2
									</label> <label class="radio-inline" for="radios-2"> <input
										type="radio" name="rdCrianca" id="radios-2" value="3">
										3
									</label> <label class="radio-inline" for="radios-3"> <input
										type="radio" name="rdCrianca" id="radios-3" value="4">
										4
									</label> <br>
									<br> <label for="radios">Qtde. Quarto(s): </label> <input
										type="number" name="txtQtdQuarto" min="1" max="10" value="1">

									</label>


								</div>
								<div class="form-group">
									<label for="dataEntrada"> Observação: </label>
									<textarea class="form-control" id="textarea"
										name="txtObservacao">Ex.: Fumante.</textarea>
								</div>

								<center>
									<br>
									<a href="#" class="btn btn-default btn-lg" data-toggle="modal"
										data-target=".bs-example-modal-sm"><span
										class="glyphicon glyphicon-shopping-cart"></span> GERAR
										RESERVA</a>&nbsp<a href="#" class="btn btn-default btn-lg"></span>
										Cancelar</a>
								</center>
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

	<div id="modalReserva" class="modal fade bs-example-modal-sm"
		tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel"
		aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">

				<!-- Modal para logar ou cadastrar -->

				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<div class="row">
								<br>
								<center>
									<img src="img/hotel_preto.png">
								</center>
								<div class="col-md-6">
									<h3 class="text-center">
										<br> Ja tenho cadastro<br>
									</h3>
									<form class="form-horizontal" role="form"  action="ServletReserva?action=reservar" method="post">
										<div class="form-group">

											<label for="inputEmail3" class="col-sm-2 control-label">
												Email </label>
											<div class="col-sm-10">
												<input type="email" class="form-control" id="inputEmail3" />
											</div>
											</div>
										<div class="form-group">

											<label for="inputPassword3" class="col-sm-2 control-label">
												Senha </label>
											<div class="col-sm-10">
												<input type="password" class="form-control"
													id="inputPassword3" />
											</div>
										</div>
										<div class="form-group">
											<div class="col-sm-offset-2 col-sm-10">
												<div class="checkbox">

													<label> <input type="checkbox" /> Nao me deixe
														esquecer
													</label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<div class="col-sm-offset-2 col-sm-10">

												<button type="submit" class="btn btn-default">
													Acessar sua Conta</button>
											</div>
										</div>
									</form>
									<div id="alertVerde"
										class="alert alert-dismissable alert-success">

										<button type="button" class="close" data-dismiss="alert"
											aria-hidden="true">×</button>
										<h4>Hospede!</h4>
										<strong>Atencao!</strong> Você receberá a confirmação da sua
										hospedagem no e-mail <strong>xxx@xnxx.com!</strong>
									</div>

									<div id="alertVermelho"
										class="alert alert-dismissable alert-danger">

										<button type="button" class="close" data-dismiss="alert"
											aria-hidden="true">×</button>
										<h4>ERRO!</h4>
										<strong>Atencao!</strong> Login e senha não conferem.
									</div>

								</div>
								<div class="col-md-6">
									<h3 class="text-center">
										<br> Ainda nao tenho cadastro<br>
									</h3>
									<dl>
										<dt>Nao perca essa oportunidade</dt>
										<dd>Otimos precos com varias opcoes de pagamento.</dd>
										<dt>Seguranca</dt>
										<dd>Nosso sistema de reserva tem a qualidade Alfa
											Concept.</dd>
										<dd>Suas informacoes estarao seguras conosco.</dd>
										<dt>Qualidade</dt>
										<dd>Garantimos qualidade, sendo o melhor hospedeiro da
											regiao.</dd>
										<br>

										<dd>Clique no botao abaixo, e faca seu cadastro!</dd>
									</dl>
									<button type="button" class="btn btn-lg btn-success">
										<center>Ok! Quero me cadastrar</center>
									</button>
									<br>
									<br>
								</div>
							</div>
						</div>
						<div class="modal-footer">

							<button type="button" class="btn btn-default"
								data-dismiss="modal">Sair</button>

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
