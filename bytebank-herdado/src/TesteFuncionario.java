
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico");
		nico.setCpf("41144444444");
		nico.setSalario(3000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getCpf());
		System.out.println(nico.getSalario());

	}

}
