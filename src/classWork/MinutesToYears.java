package classWork;

public class MinutesToYears {

    public static void minutesToYears(double min) {

        int minInYears = 60 * 24 * 365;

        long years = (long) (min / minInYears);

        int days = (int) (min / 1440) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

    }

    public static void main(String[] args) {
        minutesToYears(1440);
        minutesToYears(5000);
        minutesToYears(123456789);
    }

}
