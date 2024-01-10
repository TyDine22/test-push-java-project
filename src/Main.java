public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(01, "John Doe", "012345678",5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(02, "Jane Doe", "098765432", 5.0, 100.0);

        System.out.println("Full-Time Employee:");
        System.out.println("ID: " + fullTimeEmployee.getEmployeeId());
        System.out.println("Name: " + fullTimeEmployee.getEmployeeName());
        System.out.println("Phone: " + fullTimeEmployee.getEmployeePhone());
        System.out.println("Salary: $" + fullTimeEmployee.calculateSalary());
        System.out.println();

        System.out.println("Part-Time Employee: ");
        System.out.println("ID: " + partTimeEmployee.getEmployeeId());
        System.out.println("Name: " + partTimeEmployee.getEmployeeName());
        System.out.println("Phone: " + partTimeEmployee.getEmployeePhone());
        System.out.println("Salary: $" + partTimeEmployee.calculateSalary());
        System.out.println();
    }
}