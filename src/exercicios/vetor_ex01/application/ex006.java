package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor ?");
        int n = sc.nextInt();
        int[] vetora = new int[n];
        int[] vetorb = new int[n];
        int[] vetorc = new int[n];
        System.out.print("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            vetora[i] = sc.nextInt();
        }
        System.out.print("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vetorb[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            vetorc[i] = vetora[i] + vetorb[i];
        }
        System.out.println("Vetor Resultante : ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorc[i]);

        }


    }
}
