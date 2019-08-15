package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {

	public static void main(String[] args) {
		
				
		try (Conexao con = new Conexao()){
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		} 		
	}
}
