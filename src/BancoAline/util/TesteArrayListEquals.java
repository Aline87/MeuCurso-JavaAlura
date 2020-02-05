package BancoAline.util;

import java.util.ArrayList;
import java.util.LinkedList;

import BancoAline.ContaCorrente;
import BancoAline.ContaJava2;

public class TesteArrayListEquals {
	
	public static void main (String []args) {

		
	  LinkedList <ContaJava2> lista = new LinkedList<ContaJava2>();
		
		
		
        ContaJava2 cc = new ContaCorrente (22,11);
		
		lista .add (cc);
		
		
        ContaJava2 cc2 = new ContaCorrente (22,22);
		
        lista .add (cc2);
        
        
        ContaJava2 cc3 = new ContaCorrente (22,223);
		
        lista .add (cc3);
        
        ContaJava2 cc4 = new ContaCorrente (22,223);
		
        lista .add (cc4);
        
        
        boolean existe = lista.contains(cc4);
        
        for (ContaJava2 conta: lista) {
            if(conta==cc4) {
        System.out.println("Já existe "+ existe);
        
       
        System.out.println(conta);
        
        System.out.println(cc);
        
        System.out.println(cc2);
       
        System.out.println(cc3);
        }
            }
        }
}

        
	

        	
     
        
     
        
        
