package br.com.fiap.beans;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {	
	public static void main (String[] args) throws ParseException{
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd"); // Definimos a m�scara da data
		Date dtInicial=df.parse("1995-05-31"); // tranformamos a string recebida do formulario em uma Data
		Date dtFinal = df.parse("1995-06-05"); // tranformamos a string recebida do formulario em uma Data
		Timestamp dtInicial2 = new Timestamp(dtInicial.getTime()); // tranformamos a Data em timestamp 
		Timestamp dtFinal2 = new Timestamp(dtFinal.getTime()); // tranformamos a Data em timestamp
		
		// Subtraimos os timestamps e realizamos o calculo para converter o valor para dias
		long qtdDias = (dtFinal2.getTime() - dtInicial2.getTime()) / ((1000*60*60*24));
		
		System.out.println(qtdDias);
	}
	
}
