package abstraction_polymorphism_interface;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;


    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage,
                          double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if (wage < 0) {
            throw new IllegalArgumentException("Wage should not be negative");
        }
        if (hours < 0) {
            throw new IllegalArgumentException("Hours worked must be greater than or equal to 0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage should not be negative");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours worked must be greater than or equal to 0");
        }
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }

//    @Override
//    public double earnings() {
//        if( hours <= 40) {
//            return getWage() * getHours();
//        }
//        return (getWage() * 40) + ((getHours() - 40) * getWage() * 1.5);
//    }

    @Override
    public double getPaymentAmount() {
        if( hours <= 40) {
            return getWage() * getHours();
        }
        return (getWage() * 40) + ((getHours() - 40) * getWage() * 1.5);
    }
}
