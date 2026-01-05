package emp_details;
import javax.persistence.*;
public class Employee {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int empId;

	    private String empName;
	    private double salary;
	    private String designation;

	    // getters and setters
	    public int getEmpId() { return empId; }
	    public void setEmpId(int empId) { this.empId = empId; }

	    public String getEmpName() { return empName; }
	    public void setEmpName(String empName) { this.empName = empName; }

	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }

	    public String getDesignation() { return designation; }
	    public void setDesignation(String designation) { this.designation = designation; }

}
