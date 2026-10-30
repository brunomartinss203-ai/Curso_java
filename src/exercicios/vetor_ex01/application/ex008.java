package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor ? ");
        int n = sc.nextInt();
        double media;
        int soma,npares;
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero :");
            vetor[i] = sc.nextInt();
        }
        soma = 0;
        npares = 0;
        media = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                npares ++;

            }

        }




        if (npares == 0){
            System.out.println("NEHUM NUMERO PAR");
        }else {
            media = (double)soma /npares ;
        System.out.printf("Media dos pares =  %.2f" , media);
    }
    }
}


