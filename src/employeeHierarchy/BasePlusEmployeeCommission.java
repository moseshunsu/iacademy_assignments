package employeeHierarchy;

public class BasePlusEmployeeCommission extends CommissionEmployee {
    private double baseSalary;

    public BasePlusEmployeeCommission (String firstName, String lastName, String socialSecurityNumber,
                                       String bvn, double grossSales, double commissionRate,
                                       double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, bvn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return baseSalary + (super.earnings());
    }

    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", bvn='" + super.getBvn() + '\'' +
                ", grossSales=" + super.getGrossSales() +
                ", commissionRate=" + super.getCommissionRate() +
                ", baseSalary=" + getBaseSalary() +
                ", earnings=" + earnings() +
                '}';
    }
}
