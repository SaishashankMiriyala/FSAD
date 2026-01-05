package emp_details;
import com.app.entity.Employee;
import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import java.util.Scanner;
public class EmployeeApp {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();

	        System.out.println("Enter Employee Name:");
	        String name = sc.nextLine();

	        System.out.println("Enter Salary:");
	        double salary = sc.nextDouble();
	        sc.nextLine();

	        System.out.println("Enter Designation:");
	        String designation = sc.nextLine();

	        Employee emp = new Employee();
	        emp.setEmpName(name);
	        emp.setSalary(salary);
	        emp.setDesignation(designation);

	        session.save(emp);
	        tx.commit();

	        // 1️⃣ Employees with salary > 50,000
	        System.out.println("\nEmployees with Salary > 50,000");
	        List<Employee> list =
	                session.createQuery(
	                        "FROM Employee WHERE salary > 50000",
	                        Employee.class).list();

	        for (Employee e : list) {
	            System.out.println(e.getEmpName() + " - " + e.getSalary());
	        }

	        // 2️⃣ Average Salary
	        Double avgSalary =
	                session.createQuery(
	                        "SELECT AVG(salary) FROM Employee",
	                        Double.class).uniqueResult();

	        System.out.println("\nAverage Salary: " + avgSalary);

	        session.close();
	        HibernateUtil.getSessionFactory().close();
	        sc.close();
	    }

}
