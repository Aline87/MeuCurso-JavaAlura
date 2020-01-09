package modulo2OrientObjeto;


public class TestaBanco {
 
	public static void main(String[] args) {
		
		ClienteJava Paulo = new ClienteJava();
		Paulo.setNome("Paulo Silveira");
		Paulo.setCPF("222.222.222.22");
		Paulo.setProfissao("programador");
		
		ContaJava2 contaDoPaulo = new ContaJava2 (0, 0);
		contaDoPaulo.deposita(100); 
		
		contaDoPaulo.setTitular("Paulo"); 
		System.out.println("Cliente: " + contaDoPaulo.getTitular());
		System.out.println("Saldo: " + contaDoPaulo.getSaldo());
		System.out.println("CPF: " + Paulo.getCPF());
		System.out.println("Profissão: " + Paulo.getProfissao());
		
		
		
			
				
		
		
	}
	
	
	
	
}


