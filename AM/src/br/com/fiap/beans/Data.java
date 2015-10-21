package br.com.fiap.beans;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {	
	public static void main (String[] args) throws ParseException{
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy"); // Definimos a máscara da data
		Date dtInicial=df.parse("31/05/1995"); // tranformamos a string recebida do formulario em uma Data
		Date dtFinal = df.parse("05/06/1995"); // tranformamos a string recebida do formulario em uma Data
		Timestamp dtInicial2 = new Timestamp(dtInicial.getTime()); // tranformamos a Data em timestamp 
		Timestamp dtFinal2 = new Timestamp(dtFinal.getTime()); // tranformamos a Data em timestamp
		
		// Subtraimos os timestamps e realizamos o calculo para converter o valor para dias
		long qtdDias = (dtFinal2.getTime() - dtInicial2.getTime()) / ((1000*60*60*24));
		
		System.out.println(qtdDias);
	}
	
}
