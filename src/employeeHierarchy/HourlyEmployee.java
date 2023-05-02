package employeeHierarchy;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber, double hours,
                           double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = setHours(hours);
        this.wage = setWage(wage);
    }

    public double getHours() {
        return hours;
    }

    public double setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException ("Hours should be between 0 and 168 hours");
        } else  this.hours = hours;

        return hours;
    }

    public double getWage() {
        return wage;
    }

    public double setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative");
        } else this.wage = wage;
        return wage;
    }

    public double earnings() {
        return hours * wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                "hours=" + hours +
                ", wage=" + wage +
                '}';
    }
}
