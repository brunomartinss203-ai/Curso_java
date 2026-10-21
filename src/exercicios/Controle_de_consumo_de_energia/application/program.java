package exercicios.Controle_de_consumo_de_energia.application;

import exercicios.Controle_de_consumo_de_energia.entities.EnergyConsumption;

import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== CONSUMO DE ENERGIA =====");
        System.out.print("Aparelho: ");
        String devicename = sc.nextLine();
        System.out.print("Potência (w): ");
        double powerWatts = sc.nextDouble();
        System.out.print("Horas por dia: ");
        double hoursPerday = sc.nextDouble();
        System.out.print("Dias utilizados: ");
        int daysUsed = sc.nextInt();

        EnergyConsumption  energyConsumption = new EnergyConsumption(devicename,powerWatts,hoursPerday,daysUsed);

        if(energyConsumption.fieldsValidation()){
            System.out.println(energyConsumption);
        }



    }
}
