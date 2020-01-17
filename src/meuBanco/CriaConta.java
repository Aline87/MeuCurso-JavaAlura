package meuBanco;

public class CriaConta {
	public static void main(String[] args) {
		
		ContaJava primeiraContaJava = new ContaJava();
		
		primeiraContaJava.saldo = 200;
		System.out.println(primeiraContaJava.saldo);
		
		primeiraContaJava.saldo += 100;
		System.out.println(primeiraContaJava.saldo);
		
		ContaJava segundaContaJava = new ContaJava();
		segundaContaJava.saldo = 50;
		
		System.out.println("primeira conta tem" + primeiraContaJava.saldo);
		System.out.println("segunda conta tem" + segundaContaJava.saldo);
		System.out.println("primeira conta tem" + primeiraContaJava.agencia);
		System.out.println("segunda conta tem" + segundaContaJava.numero);

	}
}