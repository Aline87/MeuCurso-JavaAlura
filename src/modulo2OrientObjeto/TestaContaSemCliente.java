package modulo2OrientObjeto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		ContaJava2 contaDaMarcela = new ContaJava2();
		
		System.out.println("Saldo disponivel em conta: " + contaDaMarcela.saldo );
		contaDaMarcela.titular= new ClienteJava();
	    contaDaMarcela.titular.nome="Nome do Cliente : Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		contaDaMarcela.titular= new ClienteJava();
		contaDaMarcela.titular.CPF="Numero do CPF:346.796.528-88";
		System.out.println(contaDaMarcela.titular.CPF);
		
		contaDaMarcela.titular= new ClienteJava();
		contaDaMarcela.titular.profissao="Profissao: Programador";
		System.out.println(contaDaMarcela.titular.profissao);
}
}
