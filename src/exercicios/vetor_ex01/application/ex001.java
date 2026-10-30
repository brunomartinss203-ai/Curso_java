package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int [] vect = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("Digite um numero:");
            vect[i] = sc.nextInt();

        }
        System.out.print("NUMEROS NEGATIVOS:");
        for (int i = 0; i<n;i++){
           if (vect[i] < 0){
               System.out.printf("%d\n",vect[i]);
           }
        }
    }
}
