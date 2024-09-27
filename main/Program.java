package excecoes.exercicioexception.main;

import java.util.Scanner;

import excecoes.exercicioexception.modelentities.Account;
import excecoes.exercicioexception.modelentities.exceptions.BusinessException;

public class Program {
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("ENTER ACCOUNT DATA:");
        System.out.print("Account number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.next();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account ac = new Account(number, holder, initialBalance, withdrawLimit);

        try{
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        ac.withdraw(amount);
        System.out.print("new balance: " + ac.getBalance());
        }
        catch(BusinessException e){
            System.out.print(e.getMessage());
        }
        
    
        sc.close();
    }
}
