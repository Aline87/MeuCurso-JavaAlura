package BancoAline;

public class TestaGuardadorDeContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador= new GuardadorDeContas();
		
		ContaJava2 cc = new ContaCorrente (22,11);
		
		guardador .adiciona (cc);
		
		
       ContaJava2 cc2 = new ContaCorrente (22,22);
		
        guardador .adiciona (cc2);
		
		
        int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		ContaJava2 ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		System.out.println(ref.getAgencia());
		
	}

}
