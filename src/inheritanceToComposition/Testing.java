package inheritanceToComposition;

public class Testing {

    private CommissionEmployee info;
    private double wage;
    private double hours;

    public Testing(CommissionEmployee info, double wage, double hours) {
//        this.info = info;
        this.wage = wage;
        this.hours = hours;
    }

    public CommissionEmployee getInfo() {
        return info;
    }

    public void setInfo(CommissionEmployee info) {
        this.info = info;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double earnings() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "Testing{" +
                "info=" + info +
                ", wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {
        CommissionEmployee tobi = new CommissionEmployee("Tobi", "Omo-Ade", "123456789",
                1234, 0.5);
        Testing tobiTest = new Testing(tobi, 500000, 10);
        System.out.println(tobi.getFirstName());
        System.out.println(tobiTest.getInfo());

    }
}
