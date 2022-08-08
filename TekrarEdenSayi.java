/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tekraredensayi;

/**
 *
 * @author Samsung
 */
public class TekrarEdenSayi {

    /**
     * @param args the command line arguments
     */
    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] liste = {2, 5, 6, 1, 2, 4, 6, 4, 6, 6, 2, 8, 8};
        int[] liste2 = new int[liste.length];
        int baslangic = 0;

        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste.length; j++) {
                if ((i != j) && (liste[i] == liste[j])) {
                    if (!isFind(liste2, liste[i])) {
                        liste2[baslangic++] = liste[i];
                        break;

                    }

                }
            }
        }

        for (int k : liste2) {
            if ((k != 0) && (k % 2 == 0)) {
                System.out.println(k);
            }
        }
    }

}
