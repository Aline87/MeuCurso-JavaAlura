package BancoAline; 

public abstract class ContaJava2 {

	protected double saldo = 100;
	private int agencia;
	private int numero;
	private String titular;
    private  static int total; 
    
   
    
   public ContaJava2(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	    this.saldo =100; 
		total++; 
		System.out.println("o total de contas é " + total);

	}

	public abstract void deposita(double valor);
		

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere (double valor, ContaJava2 destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;

	}
	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;

		}
		this.agencia = agencia;

	}
	public static int getTotal() {
		return total;

	}

	public void setTotal(ClienteJava titular) {
		return;
	}
}
