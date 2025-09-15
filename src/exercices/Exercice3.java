package exercices;
import java.util.Arrays;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tableau = {2, 5, 8, 12};

        System.out.println("Tableau initial : " + Arrays.toString(tableau));
        System.out.print("Entrez l'élément à insérer : ");
        int element = scanner.nextInt();

        int[] nouveauTableau = new int[tableau.length + 1];
        int i = 0, j = 0;

        while (i < tableau.length && tableau[i] < element) {
            nouveauTableau[j++] = tableau[i++];
        }

        nouveauTableau[j++] = element;

        while (i < tableau.length) {
            nouveauTableau[j++] = tableau[i++];
        }

        System.out.println("Nouveau tableau : " + Arrays.toString(nouveauTableau));
    }
}
