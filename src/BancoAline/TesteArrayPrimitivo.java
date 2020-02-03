package BancoAline;

public class TesteArrayPrimitivo {
	public static void main(String[] args) {
		
        int [] idades = new int [5];
        
       idades [0] =29;
       idades [1] =19;
       idades [2] =39;
       idades [3] =49;
       idades [4] =59;
        
       int idade4 = idades[3];
        
        System.out.println(idade4);
        System.out.println(idades.length);
        
        for(int i=0; i <idades.length; i++) {
        	idades[i]=i *i;
        	
        	System.out.println(idades[i]);
        	
        }
		
		
		
		
		
	}

}
