import java.util.Scanner;

public class Contador{
    public static void main(String[] args) throws Exception {
        	Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			terminal.close();
		
		try {
			String resultado = contarNumeros(parametroUm, parametroDois);
				System.out.println(resultado);
			
		    
		}catch (ParametrosInvalidosException e) {
				System.out.println("O Segundo Parametro deve ser maior que o Primeiro");
			
		}
		
	}
	
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		static String contarNumeros(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
			
			if (primeiroNumero > segundoNumero) {
			  throw new ParametrosInvalidosException();
			}  
			
			
			int total = segundoNumero - primeiroNumero;
			for (int i = 1; i <= total; i++){
				System.out.println("Imprimindo número " + i);
				
			}
				return("");
			
			
		}	    
				
		
	
			

}

    

