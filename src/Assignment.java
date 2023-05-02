import java.util.Scanner;
public class Assignment {

    public static void main (String[] args) {
        double weightInKilograms, heightInMeters, BMI, milesDriven, costPerGallon, avgMiles, parkingFess, tollsPerDay,
                totalCostOfGasolinePerDay, costOfDrivingPerDay;
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter the following details to check your BMI: ");
        System.out.println("\nEnter your weight: ");
        weightInKilograms = input.nextDouble();

        System.out.println("Enter your height: ");
        heightInMeters = input.nextDouble();

        BMI = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + BMI);

        System.out.println("Enter the following: ");
        System.out.println("Total miles driven per day: ");
        milesDriven = input.nextDouble();

        System.out.println("Cost per gallon of gasoline: ");
        costPerGallon = input.nextDouble();

        System.out.println("Average miles per day: ");
        avgMiles = input.nextDouble();

        System.out.println("Parking fees per day: ");
        parkingFess = input.nextDouble();

        System.out.println("Tolls per day: ");
        tollsPerDay = input.nextDouble();

        totalCostOfGasolinePerDay = (milesDriven / avgMiles) * costPerGallon;
        costOfDrivingPerDay = totalCostOfGasolinePerDay + parkingFess + tollsPerDay;

        System.out.printf("Your total cost of driving per day is %.2f", costOfDrivingPerDay);

    }
}
