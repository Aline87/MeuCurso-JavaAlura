package modulo2OrientObjeto;


public class ContaJava2 {
	
double saldo =100 ;
int agencia;
int numero;
ClienteJava titular;




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
      public boolean transfere (double valor,ContaJava2 destino) {
    	  if(this.saldo>= valor) {
    		  this.saldo-=valor; 
    		  destino.deposita (valor);
    		  return true;
    	  }
      return false;
      
      }
} 
