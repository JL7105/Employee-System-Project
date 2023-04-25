public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "Salaired Employee {Name: " + name + ", Birth Date: " + birthDate + ", End Date: " + endDate + ", Hire Date: " + hireDate + ", Employee ID: " +  employeeId + ", Annual Salary: " + annualSalary + ", Retired Status: " + isRetired + "}";
    }
    
    protected void retire() {
        System.out.println("Salaried Employee Retited");
    }
}