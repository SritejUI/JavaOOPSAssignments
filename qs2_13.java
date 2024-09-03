class Member {
	String Name;
	int Age;
	int phoneNumber;
	String Address;
	int Salary;

	void printSalary() {
		System.out.println("The salary of the employee in rupees is: " + Salary);
	}
}

class Employee extends Member {
	String Specialization;
	String Department;
}

class Manager extends Member {
	String Specialization;
	String Department;
}

public class qs2_13 {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.Name = "Neel";
		e.Age = 19;
		e.phoneNumber = 1231231231;
		e.Address = "Bangalore";
		e.Salary = 500000;

		Manager m = new Manager();
		m.Name = "Sritej";
		m.Age = 19;
		m.phoneNumber = 123456789;
		m.Address = "Hyderabad";
		m.Salary = 100000000;

		System.out.println("Details of employee: " + e.Name +"- " + e.Age + "- " + e.phoneNumber + "- " + e.Address + "- " + e.Salary);

		System.out.println("Details of employee: " + m.Name +"- " + m.Age + "- " + m.phoneNumber + "- " + m.Address + "- " + m.Salary);
	}
}