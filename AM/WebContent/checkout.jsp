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

<script src="js/script.js"></script>

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
                    
                </ul>
                
            </div>
           
        </div>
        
    </nav>

    <!-- Inicio do container -->
    <div class="container"><br><br>
           <div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="row">
                <div class="col-md-10">
                    <img alt="Hotel Boa Viagem | Modulo de Checkout" src="img/modulo_check.png" />
                </div>
                <div class="col-md-2">
                    <img alt="imagem" src="img/by.png" />
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                   <form class="form-horizontal" action="SerlvetPagamento?action=checkOut" method="post">
                        <fieldset>

                       <form class="form-horizontal">
                        <fieldset>

                        <!-- Form Name -->
                        <legend>Dados do Checkout</legend>

                        <!-- Text input-->
                        <div class="form-group">
                          <label class="col-md-4 control-label" for="textinput">Cod. Hospedagem:</label>  
                          <div class="col-md-2">
                          <input id="textinput" name="txtCodHospedagem" type="text" placeholder="" class="form-control input-md" required="">
                          </div>
                        </div>

                        <div class="form-group">
                          <label class="col-md-4 control-label" for="textinput">Hora de Saída:</label>  
                          <div class="col-md-3">
                          <input id="textinput" name="hrSaida" type="time" class="form-control">
                          </div>
                        </div>

                        <div class="form-group">
                          <label class="col-md-4 control-label" for="textinput">Data de Saída:</label>  
                          <div class="col-md-4">
                          <input id="textinput" name="dtSaida" type="date" class="form-control">
                          </div>
                        </div>

                        <br>
                        <div class="form-group">
                          <label class="col-md-4 control-label" for="textinput"></label>  
                          <div class="col-md-4">
                          <a href="#" onclick= class="btn btn-default btn-lg"><span class="glyphicon glyphicon-ok"></span> Registrar Checkout</a>

                          </div>
                        </div>

                        
                        </fieldset>
                        </form>

                        <hr>

                    <div class="row">

                        <div class="col-md-12">
                            
                                <legend>Opções de Pagamento</legend>

                                <div class="form-group">
                                  <label class="col-md-4 control-label" for="selectbasic">Tipo de Pagamento:</label>
                                  <div class="col-md-4">
                                    <select id="selPag" name="selectPag" class="form-control" onchange="javascript:mostra()">
                                    <option value="0">Selecione...</option>
                                    <option value="1">Cartão</option>
                                    <option value="2">Dinheiro</option>
                                    <option value="3">Cheque</option>
                                    </select>
                                  </div>
                                </div>

                                <div id="relativo">
                                <!-- Multiple Radios -->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="rdCartao">Pagamento:</label>
                                      <div class="col-md-4">
                                      <div class="radio">
                                        <label for="rdCartao-0">
                                          <input type="radio" name="rdCartao" id="rdCartao-0" value="1" checked="checked">
                                          <img src="img/mastercard.png">
                                        </label>
                                        <label for="rdCartao-1">
                                          <input type="radio" name="rdCartao" id="rdCartao-1" value="2">
                                         <img src="img/visa.png">
                                        </label>
                                        </div>
                                      </div>
                                    </div>

                                    <div class="form-group">
                                    <label class="col-md-4 control-label">Qtde. Parcelas:</label>
                                    <div class="col-md-2">
                                        <input type="number" name="txtQtdParcelas" min="1" max="10" value="1">
                                    </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="txtValor">Valor</label>  
                                      <div class="col-md-4">
                                      <input id="txtValor" name="txtValor" type="text" placeholder="" class="form-control input-md" required="">
                                        
                                      </div>
                                    </div>
                                </div>

                                <div id="relativo1">
                                <!-- Text input-->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="textinput">Valor:</label>  
                                      <div class="col-md-4">
                                      <input id="textinput" name="txtValor" type="text" placeholder="" class="form-control input-md" required="">
                                        
                                      </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="textinput">Troco</label>  
                                      <div class="col-md-4">
                                      <input id="textinput" name="txtTroco" type="text" placeholder="" class="form-control input-md">
                                        
                                      </div>
                                    </div>
                                </div>

                                <div id="relativo2">
                                <!-- Text input-->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="textinput">Valor:</label>  
                                      <div class="col-md-4">
                                      <input id="textinput" name="txtValor" type="text" placeholder="" class="form-control input-md" required="">
                                        
                                      </div>
                                    </div>
                                </div>
                                  


                                
                            
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <legend>Relação de Consumo</legend>
                    <table class="table">
                        <thead>
                            <tr class="active">
                                <th>
                                    # Cod.
                                </th>
                                <th>
                                    Descrição
                                </th>
                                <th>
                                    Qtde.
                                </th>
                                <th>
                                    Valor Unitário
                                </th>
                                <th>
                                    Valor Total
                                </th>
                                <th>
                                    
                                </th>
                                <th>
                                    
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    1
                                </td>
                                <td>
                                    Coca-Cola Marota
                                </td>
                                <td>
                                    02
                                </td>
                                <td>
                                    R$ 10,00
                                </td>
                                <td>
                                    R$ 20,00
                                </td>
                                <td>
                                    <img src="img/alterar.png">
                                </td>
                                <td>
                                    <img src="img/deletar.png">
                                </td>
                            </tr>
                            
                            <tr>
                                <td>
                                    1
                                </td>
                                <td>
                                    Uma besteteroro
                                </td>
                                <td>
                                    01
                                </td>
                                <td>
                                    R$ 99,00
                                </td>
                                <td>
                                    R$ 99,00
                                </td>
                                <td>
                                    <img src="img/alterar.png">
                                </td>
                                <td>
                                    <img src="img/deletar.png">
                                </td>
                            </tr>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
					<center><a href="#" class="btn btn-default btn-lg">Finalizar Checkout</a></center>
            <br>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-center">
                        Copyright 2015 - Alfa Concept
                    </p>
                </div>


        </div>
    </div>
</div>
    </div>
    <!-- Fim do container -->
       
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
