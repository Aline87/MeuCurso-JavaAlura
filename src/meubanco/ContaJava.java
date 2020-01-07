package meubanco;

    public class ContaJava {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
	
	
	public void deposita ( double valor) {
	saldo = saldo + valor;
	this.saldo = this.saldo + valor;
	
	
	}
	public boolean saca (double valor) {
	if(this.saldo>= valor) {
		this.saldo -= valor;
		return true; 
	}   else {
		return false; 
	}
	}
          public boolean transfere (double valor,ContaJava destino) {
        	  if(this.saldo>= valor) {
        		  this.saldo-=valor; 
        		  destino.deposita (valor);
        		  return true;
        	  }
          return false;
          
          }
          
} 
