package testes;

import java.util.Arrays;

import dominio.Estagiario;

public class StringTeste {

	public static void main(String[] args) {
	
		
	}
	
	private void case05() {
		String nome = "elberth lins costa de moraes";
		
		System.out.println(nome.replace("e", "a"));
		System.out.println(nome.replaceAll("e", "s"));		
		System.out.println(nome.replaceFirst("e", "b"));
	
		String[] nomes = nome.split(" ");
		
		System.out.println(Arrays.asList(nomes));
	}

	private void case04() {
		
		String nome = "  Elberth lins moraes  ";
		
		System.out.println(nome.trim());
		
		System.out.println(nome.toLowerCase().startsWith("elb"));		
		System.out.println(nome.endsWith("mor"));
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		System.out.println(posInicial);
		System.out.println(posFinal);
		
		System.out.println(nome.substring(posInicial, posFinal).trim());
		
		String meuNome = " elberth";
		String meuSobrenome = " moraes ";
		
		System.out.println(meuNome.concat(meuSobrenome).trim());
	}
	
	private void case03() {

		String nome = "Elberth Moraes";
		System.out.println(nome);
		
		String nomeUp = nome.toUpperCase();
		System.out.println(nomeUp);
		
		String nomeDown = nome.toLowerCase();
		System.out.println(nomeDown);
		
		if(nomeUp.equalsIgnoreCase(nomeDown)) {
			System.out.println("=");
		}else {
			System.out.println("!=");
		}
		
		String oElberth = "elbertho";
		String aElberth = "elbertha";
		
		System.out.println(aElberth.compareTo(oElberth));
	}
	
	private void case02() {
		String[] texto = new String[4];
		Estagiario[] estags = new Estagiario[2];
		
		char[] java = {'J','a','v','a','-','D','e','v','e','l','o','p','e','r'};
		
		texto[0] = new String();
		texto[1] = new String("elberth moraes");
		texto[2] = new String(java);
		texto[3] = new String(java, 5, 9);

		String nome = texto[1];
		
		System.out.println(nome.equals(texto[1]) ? "iguais" : "diferentes");
		
		System.out.println(nome);
		System.out.println(texto[1]);
		System.out.println(nome.charAt(6));		
	}
	private void case01() {
		//foreach
//		for(String txt : texto) {
//			System.out.println("- " + txt);
//		}
		//for
//		for(int i = 0; i < texto.length; i++) {
//			System.out.println("- " + texto[i]);
//		}
		
		//while
//		int i = 0;
//		while(i < texto.length) {
//			System.out.println("- " + texto[i]);
//			i++;
//		}
		
		//dowhile
//		int i = 0;
//		do {
//			System.out.println("- " + texto[i]);
//			i++;
//		} while (i < texto.length);
		
	}
}
