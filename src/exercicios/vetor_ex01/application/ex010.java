package exercicios.vetor_ex01.application;

import java.util.Objects;
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados?");
        int n = sc.nextInt();
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        String[] reprovados = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            if (nota1[i] + nota2[i] < 6.0){
                reprovados[i] = nome[i];
            }
        }
        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < n; i++) {
            if (!Objects.equals(nome[i], reprovados[i])){
                System.out.println(nome[i]);
            }
        }

    }
}
