package exercicios.estacionamento.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas linha o estacionameto vai ter ?");
        int l = sc.nextInt();
        System.out.print("Quantas colunas o estacionamento vai ter ?");
        int c = sc.nextInt();
        int[][] estacionameto = new int[l][c];

        int vagasOcupadas = 0;

        for (int i = 0; i < estacionameto.length; i++) {
            for (int j = 0; j < estacionameto[i].length; j++) {
                System.out.print("Digite o valor da posição "+"["+i+"]"+"["+j+"] :");
                estacionameto[i][j] = sc.nextInt();

                if(estacionameto[i][j] == 1){
                    vagasOcupadas++;
                }


            }

        }
        System.out.println("Vagas ocupadas = "+ vagasOcupadas);
        int vagaslivres = (l * c) - vagasOcupadas;
        System.out.println("Vagas livres = "+vagaslivres);

        System.out.println("Posicoes livres :");
        for (int i = 0; i < estacionameto.length; i++) {
            for (int j = 0; j < estacionameto[i].length; j++) {
                if (estacionameto[i][j] == 0){
                    System.out.println(i+","+j);
                }

            }

        }
    }
}
