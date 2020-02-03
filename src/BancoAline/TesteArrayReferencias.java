package BancoAline;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		
		Object [] referencia = new Object [5];
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);

        referencia [0] =cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca (222, 331);
		 
		referencia [1] =cc2;
        
		
		//System.out.println(cc2.getNumero());
		System.out.println(referencia [1]);
		
		ContaJava2 ref = ((ContaPoupanca) referencia[1]);
		System.out.println(cc1.numero);
		System.out.println(cc2.numero);
		System.out.println(ref.agencia);
		
		
	}

}
