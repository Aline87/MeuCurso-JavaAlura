package modulo3Heranca;

public class SistemaInterno {

	private int senha;
	
	public void autentica (Autenticavel fa) {
		boolean autenticou  = fa.autentica (this.senha);
		if (autenticou) {
			System.out.println("pode entrar no sistema");
			
        } else {
        	System.out.println("Não pode entrar no sistema");
        }
		
	}
}

        	
     
		
	
	
	
       

