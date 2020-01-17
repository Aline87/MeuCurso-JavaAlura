package modulo3Heranca;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos Ferraz");
		g1.setCpf("Cpf:223654879");
		g1.setSalario(5000.0);

		System.out.println("Nome: Marcos Ferraz" + g1.getNome());
		System.out.println("CPF:223654879" + g1.getCpf());
		System.out.println("Meu Salario: " + g1.getSalario());

		boolean autenticou = g1.getAutentica(2222);
		System.out.println(g1.getAutentica(2222));

		System.out.println(autenticou);
		System.out.println("Valor da minha Bonificação:" + g1.getBonificacao());

	}

}
