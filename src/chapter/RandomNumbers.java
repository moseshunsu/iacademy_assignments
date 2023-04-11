package chapter;

import java.security.SecureRandom;

public class RandomNumbers {

    public static StringBuilder accountNumber() {
        SecureRandom random = new SecureRandom();
        StringBuilder accNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int accountNumber = random.nextInt(10);
            accNumber.append(accountNumber);
        }
        return accNumber;
    }


    public static void main(String[] args) {
        System.out.println(accountNumber());
    }
}
