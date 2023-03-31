package chapter_3;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        Account account1 = new Account();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        account.setName(name);
        account1.setName("Sola");
        System.out.println("Your Account name is " + account.getName());
    }
}
