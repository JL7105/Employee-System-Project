public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = Employee.employeeNo++;
    }

    @Override
    public String toString() {
        return("Employee {Employee ID = " + employeeId + ", Hire Date = " + hireDate + "} " + super.toString());
    }
}
  