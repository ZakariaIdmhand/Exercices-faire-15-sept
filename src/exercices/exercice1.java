package exercices;

import java.util.Iterator;

public class exercice1 {

	public static void main(String[] args) {
		int[] tableau = {2, 5, -1, 7, 4, 3};
      int[] pairs = new int[tableau.length];    
      int[] impairs = new int[tableau.length];  

      int Pair = 0;    
      int Impair = 0;  
      
      for (int x : tableau) {
    	    if (x % 2 == 0) {
    	        pairs[Pair] = x;   
    	        Pair++;            
    	    } else {
    	        impairs[Impair] = x; 
    	       Impair++;            
    	    }
      } 
      System.out.print("Éléments pairs : ");
      for (int i = 0; i < Pair; i++) {
          System.out.print(pairs[i] +" ");
      }
      System.out.println(); // new line

      System.out.print("Éléments impairs : ");
      for (int i = 0; i < Impair; i++) {
          System.out.print(impairs[i] + " ");
      }
     
	}
	
	
}

      
      
      
      
     
