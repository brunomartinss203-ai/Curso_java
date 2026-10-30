package exercicios.vetor_ex01.application;

import java.util.Scanner;

public class ex009 {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar ?");
        int n = sc.nextInt();
        int maisvelho = 0;
        String nomemaisvelho = "";
        String[] nome = new String[n];
        int[] idade = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n",i+1);
            System.out.print("Nome:");
            nome[i] = sc.next();
            System.out.print("Idade:");
            idade[i] = sc.nextInt();
            if (idade[i] > maisvelho){
                maisvelho=idade[i];
                nomemaisvelho = nome[i];
        }
        }

        System.out.print("PESSOA MAIS VELHA : " + nomemaisvelho);

    }
}
