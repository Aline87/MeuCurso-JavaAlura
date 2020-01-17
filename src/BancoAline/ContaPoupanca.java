package BancoAline;

public class ContaPoupanca extends ContaJava2 {
	
	public ContaPoupanca ( int agencia ,int numero) {
            super ( agencia , numero );
  
	}

	@Override
	public void deposita(double valor) {
		super.saldo+=valor;
		
	}
	
}
