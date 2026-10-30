package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,nmenores;
        double alturatotal,alturamedia,percentualmenores;
        System.out.print("Quantas pessoas serao digitadas ? ");
        n = sc.nextInt();
        sc.nextLine();
        String [] nomes = new String[n];
        int [] idades = new int[n];
        double [] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n",i+1);
            System.out.print("Nome :");
            nomes[i] = sc.next();
            System.out.print("Idade :");
            idades[i] = sc.nextInt();
            System.out.print("altura :");
            alturas[i] = sc.nextDouble();

        }
        nmenores = 0;
        alturatotal=0;
        for (int i = 0; i< n; i++) {
            if (idades[i] <= 16){
               int  idade = idades[i];
               nmenores++;

            }
            alturatotal+=alturas[i];
        }
        alturamedia = alturatotal / n;
        percentualmenores = ((double)nmenores / n)* 100.0;

        System.out.printf("\nAltura media = %.2f\n ",alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentualmenores);
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16){
                System.out.printf("%s\n",nomes[i]);
            }

        }




    }
}
