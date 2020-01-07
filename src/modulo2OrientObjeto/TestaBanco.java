package modulo2OrientObjeto;


public class TestaBanco {
 
	public static void main(String[] args) {
		ClienteJava Paulo = new ClienteJava();
		Paulo.nome = "Paulo Silveira";
		Paulo.CPF = "222.222.222.22";
		Paulo.profissao = "programador";
		
		ContaJava2 contaDoPaulo = new ContaJava2 ();
		contaDoPaulo.deposita(100); 
		
		contaDoPaulo.titular = Paulo; 
		System.out.println("Cliente: " + contaDoPaulo.titular.nome);
		System.out.println("CPF: " + contaDoPaulo.titular.CPF);
		System.out.println("Profissão: " + contaDoPaulo.titular.profissao);
		
		
			
				
		
		
	}
	
	
	
	
}


