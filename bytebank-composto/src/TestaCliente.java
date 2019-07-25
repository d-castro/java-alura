
public class TestaCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta(123, 456);
		
		Cliente marcela = new Cliente();
		
		contaDaMarcela.setTitular(marcela);
		
		marcela.setNome("Marcela");
		marcela.setCpf("444.444.444-12");
		marcela.setProfissao("programadora");
		
		contaDaMarcela.setAgencia(555);
		contaDaMarcela.setNumero(85496);
		
		System.out.println(marcela.getNome());
		System.out.println(marcela.getCpf());
		System.out.println(marcela.getProfissao());
		
		System.out.println(Conta.getTotal());
	}

}
