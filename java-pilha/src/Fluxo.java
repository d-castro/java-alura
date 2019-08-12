public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }catch(Exception ex) {
        	System.out.println("Exception");
        	String msg = ex.getMessage();
        	ex.printStackTrace();
        			
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        
        metodo2();
       
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);

            throw new MinhaExcecao("deu muito errado");
        
        }
        System.out.println("Fim do metodo2");        
    }
}