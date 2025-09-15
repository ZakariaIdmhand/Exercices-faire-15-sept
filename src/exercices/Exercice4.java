package exercices;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m1 = {
            {1, -1, 0},
            {0, 2, 1}
        };

        int[][] m2 = {
            {3, 1},
            {4, 2},
            {1, 0}
        };

        if (m1[0].length != m2.length) {
            System.out.println("Multiplication impossible : nombre de colonnes de m1 ≠ nombre de lignes de m2");
            return;
        }

        int lignes = m1.length;
        int colonnes = m2[0].length;
        int[][] produit = new int[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    produit[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        System.out.println("Résultat du produit m1 * m2 : ");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print(produit[i][j] + " ");
            }
            System.out.println();
        }
    }
}
