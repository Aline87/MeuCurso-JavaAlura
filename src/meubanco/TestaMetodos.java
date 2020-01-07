package meubanco;

public class TestaMetodos {
	
	public static void main(String[] args) {
		
		ContaJava contadopaulo = new  ContaJava();
		contadopaulo.saldo =100;
		contadopaulo.deposita(50);{
		
		System.out.println(contadopaulo.saldo);
		boolean conseguiuRetirar = contadopaulo.saca(20);
		System.out.println(contadopaulo.saldo);	
		System.out.println(conseguiuRetirar);	
		
		ContaJava contaDaMarcela=new ContaJava();
		
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia=
		contaDaMarcela.transfere (300,contadopaulo);
		
		if (sucessoTransferencia) 
		
		{
		System.out.println("transferencia com sucesso");		
		}else
		
		{
		System.out.println("faltou dinheiro");		
		}
		System.out.println(contadopaulo.saldo);	
		System.out.println(contaDaMarcela.saldo);	
		
		
		}
	}
	
}

	

