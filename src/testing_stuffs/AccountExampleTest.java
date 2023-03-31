package testing_stuffs;

import java.util.Scanner;

public class AccountExampleTest {

    public static void main (String[] args) {
        AccountExample account1 = new AccountExample("Moses", 1000.00);
        double amount;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press '1' for deposit or '2' for withdrawal: ");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.print("Enter the amount you want to deposit: ");
            amount = scanner.nextDouble();
            account1.deposit(amount);
        } else if (option == 2) {
            System.out.print("Enter the amount you want to withdraw: ");
            amount = scanner.nextDouble();
            account1.debit(amount);
        }


        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break;
            }

            System.out.println(i);
        }
    }
}
