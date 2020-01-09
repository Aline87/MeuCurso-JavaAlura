package modulo2OrientObjeto;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		
		ContaJava2 contaPatricia = new ContaJava2(0, 0);
		contaPatricia.deposita(100);
		System.out.println(contaPatricia.saca(101));

		contaPatricia.saca(101);
		System.out.println(contaPatricia.getSaldo());

	}
}
