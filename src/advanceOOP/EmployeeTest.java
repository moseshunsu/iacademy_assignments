package advanceOOP;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate = new Date(2, 5, 1983);
        Date hireDate = new Date();
        hireDate.setDay(31);
        hireDate.setMonth(9);
        hireDate.setYear(2023);
        Date weddingDate = new Date(3, 5, 2016);
        Employee sarah = new Employee("Sarah", "Adelola", "554545444444", Gender.FEMALE,
                birthDate, hireDate,weddingDate);

        sarah.displayEmployeeInfo();
    }
}
