
public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.deposita(1000);
		System.out.println(c1.saldo);
		
		Conta c2 = new Conta();
		c2.deposita(500);
		System.out.println(c2.saldo);
		
		c1.transfere(200, c2);
		
		System.out.println("Saldo c1: " + c1.saldo);
		System.out.println("Saldo c2: " + c2.saldo);
	}

}
