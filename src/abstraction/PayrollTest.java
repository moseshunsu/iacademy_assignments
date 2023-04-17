package abstraction;

public class PayrollTest {

    public static void main(String[] args) {
        CommissionEmployee ridoh = new CommissionEmployee("RIdoh", "Lawal",
                "1234567", 500, 0.5);
        System.out.println(ridoh);
        System.out.println(ridoh.earnings());

        CommissionEmployee ridohCommission = new BasePlusCommissionEmployee (ridoh.getFirstName(),
                ridoh.getLastName(), ridoh.getSocialSecurityNumber(), ridoh.getGrossSales(),
                ridoh.getCommissionRate(), 2000);
        System.out.println(ridohCommission);


//        Employee[] employees = new Employee[4];
//        employees[0] = ridoh;

//        for (Employee employee: employees) {
//            if (employee instanceof BasePlusCommissionEmployee) {
//                BasePlusCommissionEmployee cure
//            }
//        }
    }

}
