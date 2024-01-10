public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private double totalHour;

    public PartTimeEmployee (int employeeId, String employeeName, String employeePhone, double hourlyRate, double totalHour) {
        super(employeeId, employeeName, employeePhone);
        this.hourlyRate = hourlyRate;
        this.totalHour = totalHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    @Override
    public double calculateSalary() {
        return this.totalHour * this.hourlyRate;
    }
}
