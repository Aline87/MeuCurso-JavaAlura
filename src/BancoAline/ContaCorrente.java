package BancoAline;

public class ContaCorrente extends ContaJava2 implements Tributavel {

	 private static final Object Super = null;
	public ContaCorrente( int agencia, int numero){
		 super(agencia,numero );
		 
	 }
	 @Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor +0.2;
		super.saca(valorASacar);
	}
	@Override
	public void deposita(double valor) {
		super.saldo +=valor;
		
}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
		
}
 
	public String toString() {
    	return"ContaCorrente:" + super.toString();
   }
}




	

