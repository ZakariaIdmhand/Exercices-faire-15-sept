package exercices;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class exercice2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez la taille du tableau: ");
	        int n = sc.nextInt();
	        int[] t = new int[n];

	        System.out.println("Entrez " + n + " entiers (séparés par des espaces):");
	        for (int i = 0; i < n; i++) {
	            t[i] = sc.nextInt();
	        }

	        Map<Integer, Integer> counts = new LinkedHashMap<>();
	        for (int x : t) {
	            counts.put(x, counts.getOrDefault(x, 0) + 1);
	        }

	        for (Map.Entry<Integer, Integer> e : counts.entrySet()) {
	            System.out.println(e.getKey() + " apparaît " + e.getValue() + " fois");
	        }

	        sc.close();{
	    
			}

	}

}
