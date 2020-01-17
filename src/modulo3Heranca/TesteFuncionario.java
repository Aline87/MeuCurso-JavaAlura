package modulo3Heranca;

public class TesteFuncionario {
 
	public static void main(String[] args) {
		Funcionario jorge = new Gerente ();
		jorge.setNome ("Nome: Jorge Hernrique dos Santos Ferraz");
		jorge.setCpf ("CPF :05027793901");
		jorge.setSalario(2600.00);
		
		
		System.out.println(jorge.getNome());
		System.out.println(jorge.getCpf());
		System.out.println(jorge.getBonificacao());
		
		
		
		
	}
} 
