package employeeHierarchy;

public class CommissionEmployee extends Employee {
    private String bvn;
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, String bvn,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.bvn = bvn;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                super.toString() +
                "bvn='" + bvn + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
