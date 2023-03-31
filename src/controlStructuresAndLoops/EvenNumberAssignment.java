package controlStructuresAndLoops;

public class EvenNumberAssignment {
    public static void evenNumbers() {
        String evenNumbers = "";
        for(int numberCounter = 0; numberCounter <= 100; numberCounter += 2) {
                evenNumbers += numberCounter + " ";
        }
        System.out.printf("Even Numbers are as follows:%n%s%n", evenNumbers);
    }

    public static void oddNumbers() {
        String oddNumbers = "";
        for (int numberCounter = 1; numberCounter <= 100; numberCounter += 2) {
                oddNumbers += numberCounter + " ";
        }
        System.out.printf("%nOdd Numbers are as follows:%n%s%n", oddNumbers);
    }

    public static void main(String[] args) {
            evenNumbers();
            oddNumbers();
    }
}
