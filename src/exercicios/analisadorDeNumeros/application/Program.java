package exercicios.analisadorDeNumeros.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos numeros deseja digitar ? :");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int zeros = 0;
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero "+(i+1)+":");
            numeros[i] = sc.nextInt();

            if (numeros[i] < 0){
                negativos++;
            }
            else if (numeros[i] > 0){
                positivos++;
            }
            else if (numeros[i] == 0 ){
                zeros++;
            }
        }
        System.out.println("Resultado :");
        System.out.println("positivos :"+positivos);
        System.out.println("negativos :"+negativos);
        System.out.println("zeros :"+zeros);

    }
}
