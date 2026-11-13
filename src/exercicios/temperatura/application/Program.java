package exercicios.temperatura.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas dias serão registrados ?:");
        int numdias = sc.nextInt();
        System.out.print("Quantas cidades serão monitoradas ?:");
        int numcidade = sc.nextInt();

        int[][] temperatura = new int[numcidade][numdias];
        int maiorq30 = 0;
        int maiortemp = Integer.MIN_VALUE;
        int menortemp = Integer.MAX_VALUE;


        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                System.out.print("Digite a temperatura do "+"cidade["+(i+1)+"]"+"dia["+(j+1)+"] :");
                temperatura[i][j] = sc.nextInt();



                if (temperatura[i][j] > 30){
                    maiorq30++;
                }

                if (temperatura[i][j] > maiortemp) {
                    maiortemp = temperatura[i][j];
                }
                if (temperatura[i][j] < menortemp) {
                    menortemp = temperatura[i][j];
                }


            }

        }

        System.out.println("Temperaturas acima de 30: "+maiorq30);
        System.out.println("maior temperatura :"+maiortemp);
        System.out.println("menor temperatura :"+menortemp);

    }
}
