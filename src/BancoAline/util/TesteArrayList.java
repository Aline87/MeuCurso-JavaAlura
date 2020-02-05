package BancoAline.util;

import java.util.ArrayList;

import BancoAline.ContaCorrente;
import BancoAline.ContaJava2;

public class TesteArrayList {

	public static void main(String[] args) {
	
		ArrayList <ContaJava2> lista = new ArrayList<ContaJava2>();
		
		ArrayList <String > nome = new ArrayList <String>();
		
        ContaJava2 cc = new ContaCorrente (22,11);
		
		lista .add (cc);
		
		
        ContaJava2 cc2 = new ContaCorrente (22,22);
		
        lista .add (cc2);
        
        
        System.out.println("Tamanho:"+ lista.size());
        ContaJava2 ref = (ContaJava2) lista.get(0);
        System.out.println(ref.getNumero());
      
        lista.remove(0);
        
        System.out.println("Tamanho:"+ lista.size());
        
        
        
        ContaJava2 cc3 = new ContaCorrente (322,311);
		
		lista .add (cc3);
		
		
        ContaJava2 cc4 = new ContaCorrente (322,322);
		
        lista .add (cc4);
        
        for(int i=0; i < lista.size (); i ++) {
        	Object oRfe = lista.get(i);
        	System.out.println(oRfe);
        	
        	System.out.println ("**********************************");
        	
        for(ContaJava2 conta: lista) {
        	System.out.println(conta);
        	
        }
        	
        }
        
        }
        
        }
