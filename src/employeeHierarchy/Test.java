package employeeHierarchy;

public class Test {
    public static void main(String[] args) {

        CommissionEmployee ridoh = new CommissionEmployee("Ridoh", "Lawal", "123456789",
                    "500", 500, 0.5);
            System.out.println(ridoh.getLastName());
            System.out.println(ridoh.getGrossSales());
            System.out.println(ridoh.getCommissionRate());


        HourlyEmployee moses = new HourlyEmployee("Moses", "Hunsu", "2222",
                100, 23);
        System.out.println(moses);
            
    }
}
