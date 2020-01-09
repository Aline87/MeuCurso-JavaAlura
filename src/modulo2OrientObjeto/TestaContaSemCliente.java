package modulo2OrientObjeto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		
		ContaJava2 Marcela = new ContaJava2(0, 0);

		System.out.println("Saldo disponivel em conta: " + Marcela.getSaldo());
		//ClienteJava contaDaMarcela = new ClienteJava();
		
		Marcela.setTitular("Marcela");
		System.out.println("Nome do cliente " + Marcela.getTitular());

		ClienteJava contaDaMarcela = new ClienteJava();
		contaDaMarcela.setCPF("346.796.528-88");
		System.out.println("CPF: " + contaDaMarcela.getCPF());

		contaDaMarcela.setProfissao("Programador");
		System.out.println("Profissão do titular: " + contaDaMarcela.getProfissao());
	}
}
