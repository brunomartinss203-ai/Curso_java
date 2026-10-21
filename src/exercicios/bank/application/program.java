package exercicios.bank.application;

import exercicios.bank.entities.BankAccount;

import java.util.Scanner;

public class program {
    public static  void main(String[] args){
        double initialDeposit = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number :");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder :");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String question = sc.nextLine();
        if (question.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        BankAccount account = new BankAccount(accountNumber,accountHolder,initialDeposit);

        System.out.println(account);

        System.out.print("Enter a deposist value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println(" ");

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println(" ");

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println(" ");

        System.out.println("Updated account data: ");
        System.out.println(account);






    }
}
