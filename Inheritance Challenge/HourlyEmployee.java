public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Hourly Employee {Name: " + name + ", Birth Date: " + birthDate + ", End Date: " + endDate + ", Employee ID: " + employeeId + ", Hire Date: " + hireDate + ", Hourly Pay Rate: " +  hourlyPayRate + "}";
    }
    
    public double getDoublePay() {
        return hourlyPayRate;
    }
}