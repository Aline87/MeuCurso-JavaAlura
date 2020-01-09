package modulo2OrientObjeto;

public class TestaGetESet {

	public static void main(String[] args) {
		
		ContaJava2 contaPatricia = new ContaJava2(1337, 24226);
		contaPatricia.setNumero(1377);
		System.out.println("Numero da conta da Patricia é :" + contaPatricia.getNumero());
		System.out.println("Numero da Agencia da Patricia é :" + contaPatricia.getAgencia());

		ClienteJava Patricia = new ClienteJava();
		Patricia.setNome("Patricia Ferraz");
		

		contaPatricia.setTitular("Patricia");
		System.out.println("O nome completo do cliente é :" + contaPatricia.getTitular());

		Patricia.setProfissao("Programadora");
		System.out.println("A profissao do cliente é: " + Patricia.getProfissao());

	}
}
