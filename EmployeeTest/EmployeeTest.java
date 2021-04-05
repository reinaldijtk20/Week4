import java.time.*;


public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		for(Employee e: staff){
			e.raiseSalary(5);
		}
		
		for(Employee e: staff){
			System.out.println(e.toString());
		}
	}
}

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDate;
		
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, day);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}


	public void raiseSalary(double byPercent){
		double  raise = salary * byPercent/100;
		salary += raise;
	}


	@Override
	public String toString() {
		return "name=" + this.getName() + ",salary=" + this.getSalary() + ",hireDay="
				+ this.getHireDate();
	}
	
	
}
