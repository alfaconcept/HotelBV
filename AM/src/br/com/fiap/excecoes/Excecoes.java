package br.com.fiap.excecoes;

public class Excecoes extends Exception {
	
	public Excecoes(Exception e){
		if(e.getClass().toString().equals("class java.lang.ArithmeticException")){
			System.out.println("Existe um zero no divisor");
		}else if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("Número Invalido");
			e.printStackTrace();
		}else{
			System.out.println("Falha Desconhecida");
			e.printStackTrace();
		}
	}
	
	public Excecoes(){
		System.out.println("Existe uma falha");
	}
	
	public Excecoes(String erro){
		System.out.println(erro);	
	}
	
}
