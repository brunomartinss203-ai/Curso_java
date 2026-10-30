package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,numeropares;
        System.out.print("QUantos numero voce vai digitar ?");
        n = sc.nextInt();
        int numeros [] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero ");
            numeros[i] = sc.nextInt();
        }


        System.out.print("NUMEROS PARES");

        numeropares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] %2 == 0){
                System.out.printf(" %d ",numeros[i]);
                numeropares++;

        }
    }
        System.out.printf("\n\nQuantidade de pares = %d\n" ,numeropares);
}
}
