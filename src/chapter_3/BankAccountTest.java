package chapter_3;

import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Pelumi Sorry", 1200.00);
        System.out.printf("Congrats! Your account name is %s\nYour Balance is %.2f\n", bankAccount.getAccountName(),
                bankAccount.getAccountBalance());

        Scanner scanner = new Scanner(System.in);
        String name;
        double balance;
        System.out.println("\nEnter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter initial balance: ");
        balance = scanner.nextDouble();

        BankAccount bankAccount1 = new BankAccount(name, balance);
        System.out.printf("Congrats! Your account name is %s\nYour Balance is %.2f\n", bankAccount1.getAccountName(),
                bankAccount1.getAccountBalance());

        // deposit and debit
        System.out.println("How much money do you want to deposit: ");
        double depositAmount = scanner.nextDouble();
        bankAccount1.deposit(depositAmount);
        System.out.printf("""
                Congrats! Your account name is %s
                You've deposited %.2f into your account and your Balance is %.2f
                """, bankAccount1.getAccountName(), depositAmount, bankAccount1.getAccountBalance());

        System.out.println("How much do you want to withdraw? ");
        double debitAmount = scanner.nextDouble();
        bankAccount1.debit(debitAmount);
        System.out.printf("""
                Congrats! Your account name is %s.
                You've withdrawn %.2f and your Balance is %.2f.
                """, bankAccount1.getAccountName(), debitAmount, bankAccount1.getAccountBalance());
    }
}
