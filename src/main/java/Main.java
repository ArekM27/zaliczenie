//Napisz program, który znajduje wspólne elementy między dwiema tablicami znakowymi: Program powinien wczytać dwie tablice liczb(!) wprowadzone przez użytkownika, Znaleźć wspólne elementy między tymi tablicami, Wyświetlić wynik.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą tablicę znaków:");
        String[] tab1 = scanner.nextLine().split("");
        System.out.println("Podaj drugą tablicę znaków:");
        String[] tab2 = scanner.nextLine().split("");
        int n = tab1.length;
        int m = tab2.length;
        int[] tab3 = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(tab1[i].equals(tab2[j])){
                    tab3[k] = Integer.parseInt(tab1[i]);
                    k++;
                }
            }
        }
        System.out.println("Wspólne elementy:");
        for(int i = 0; i < k; i++){
            System.out.print(tab3[i] + " ");
        }
    } 

}