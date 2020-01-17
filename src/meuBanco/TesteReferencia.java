package meuBanco;

public class TesteReferencia {
	public static void main(String[] args) {

		ContaJava primeiraContaJava = new ContaJava();

		primeiraContaJava.saldo = 300;
		System.out.println("saldo da primeira conta" + primeiraContaJava.saldo);

		ContaJava segundaContaJava = primeiraContaJava;
		System.out.println("saldo da segunda conta" + segundaContaJava.saldo);

		segundaContaJava.saldo += 100;
		System.out.println("saldo da segunda conta" + segundaContaJava.saldo);

	}

}
