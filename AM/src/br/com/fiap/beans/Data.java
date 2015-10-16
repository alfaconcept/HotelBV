package br.com.fiap.beans;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Data {	
	public static void main (String[] args) throws ParseException{
		String data = request.getParameter("data"); // Aqui nós pegamos a String data do formulário
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); // Definimos a máscara da data
		Date dataUsuario=sdf.parse(data); // tranformamos a string recebida em uma Data
		System.out.println(sdf.format(dataUsuario)); // Printamos a data na mascara definida
//		Timestamp dtInicial = new Timestamp(this.dtEntrada.getTime());
//		Timestamp dtFinal = new Timestamp(this.dtSaida.getTime());// obter numero de dias de estadia
	}
	
}
