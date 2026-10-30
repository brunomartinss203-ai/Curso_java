package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor ?");
        int n = sc.nextInt();

        double media = 0;
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero :");
            vetor[i] = sc.nextDouble();
        }
        double s = 0;
        for (int i = 0; i < n; i++) {
            s += vetor[i];
        }
        media = s/n;



        System.out.println("Media do vetor =  " + media);
        System.out.println ("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }

        }


    }
}
