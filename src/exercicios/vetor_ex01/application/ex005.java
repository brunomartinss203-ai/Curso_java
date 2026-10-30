package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();
        double [] vetor= new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero :");
            vetor[i] = sc.nextDouble();
        }

        double maiornumero = vetor[0];
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] > maiornumero){
                maiornumero = vetor[i];
                posicao = i;
            }

        }

        System.out.printf("MAIOR VALOR = %.1f\n", maiornumero);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);


    }


}
