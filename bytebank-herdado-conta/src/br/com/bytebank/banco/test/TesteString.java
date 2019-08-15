package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);

		System.out.println(nome);
		
//		String nome = "Mario";
//		String outro = new String ("Alura");
//		
//		char c = nome.charAt(3);
//		System.out.println(c);
//		
//		int pos = nome.indexOf("rio");
//		System.out.println(pos);
//		
//		String sub = nome.substring(2);
//		System.out.println(sub);
//		
//		for ( int i = 0 ; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
//		String novo = nome.toUpperCase();
		
//		String novo = nome.toLowerCase();
		
//		String novo = outro.replace("A", "a");
		
//		System.out.println(novo);
		

	}

}
