import coffeShop.coffeOrder;

import java.util.Scanner;

public class program {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        coffeOrder coffeorder = new coffeOrder();
        System.out.print("Name of customer: ");
        coffeorder.customerName = sc.nextLine();
        System.out.print("Size of coffe: ");
        coffeorder.size = sc.nextLine();
        System.out.print("Quantity: ");
        coffeorder.quantity = sc.nextInt();
        sc.nextLine();
        System.out.print("Add vegetable milk ? (S/N): ");
        String vgtbmilk = sc.nextLine();
        if(vgtbmilk.equalsIgnoreCase("S")){
            coffeorder.vegetableMilk = true;
        } else if (vgtbmilk.equalsIgnoreCase("N")) {
            coffeorder.vegetableMilk = false;

        }
        System.out.print(coffeorder);
    }
}
