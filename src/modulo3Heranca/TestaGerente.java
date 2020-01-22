package modulo3Heranca;

public class TestaGerente {
	public static void main(String[] args) {
		
		Autenticavel gerente = new Gerente();
		
		Gerente g1 = new Gerente ();
		g1.setNome ("Marcos Ferraz");
		g1.setCpf("22356489787");
		g1.setSalario(5000.0);
		
		System.out.println("-----------------");
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());
		
		
	}

}
