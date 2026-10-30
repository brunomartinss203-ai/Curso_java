package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        double soma,media;

        System.out.print("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        double [] vetor = new double[n];

        for (int i=0;i<n;i++){
            System.out.print("Digite um numero:");
            vetor[i] = sc.nextDouble();

        }
        soma = 0;
        for (int i = 0; i < n; i++) {
            soma+=vetor[i];

        }
        media = soma/n;

        System.out.print("VALORES = ");
        for(int i=0;i<n;i++){
            System.out.printf("%.1f ",vetor[i]);
        }
        System.out.printf("\nSOMA = %.2f\n",soma);
        System.out.printf("MEDIA = %.2f\n",media);
    }
}
