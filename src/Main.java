import parking.Parking;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Parking vehicle = new Parking();
        System.out.print("Placa: ");
        vehicle.plate = sc.nextLine();
        System.out.print("Tipo de veículo: ");
        vehicle.veihicleType = sc.nextLine();
        System.out.print("Tempo estacionado: ");
        vehicle.minutes = sc.nextInt();
        double valorfinal = vehicle.parking_calculator();
        System.out.printf("R$ %.2f%n",valorfinal);

    }
}