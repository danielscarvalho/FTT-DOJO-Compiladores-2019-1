package ftt.ec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/* DOJO - Analisador Léxico - Compiladores
 * Limpar arquivo e criar tabela de lexemas
 * 
 * Aluno: 
 * Lucas Polizeli e Jonatas 
 * João Marcos e Carlos
 * Letícia e Thales
 * BARRETO E LEOZIN
 * Murilo e Murilo
 * 
 * 
 */

public class DojoLex {

	public static void main(String[] args) throws IOException {
		// TODO Criar tabela de lexemas
		
		//System.getProperty("user.dir");
		File file = new File(".....jquery-3.4.1.js"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  String full = "";
		  
		  
		  while ((st = br.readLine()) != null) {
			  
			  if(st.trim().startsWith("//")) continue;
			
			  full += st.trim();
			 
		  }
		  
		  full = full.replaceAll("/\\*.+\\*/", "");
		  
		  // TODO Salva em um arquivo irmão (fmz)
		  System.out.println(full);
	}
}
