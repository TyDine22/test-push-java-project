public class FullTimeEmployee extends Employee{
    private double salary;

    public FullTimeEmployee (int employeeId, String employeeName, String employeePhone, double salary) {
        super(employeeId, employeeName, employeePhone);
        this.salary = salary;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }
    @Override
    public double calculateSalary () {
        return this.salary;
    }
}
