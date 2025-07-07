package inheritance;

public class Question5_TestEmployee{
	public static void main(String[] args) {
		
		Employee newEmployee = new Employee("Sai Venkata Chandran",100000,"2026","123456");
		System.out.println(
				"Employee Name: " + newEmployee.getName() + "\nSalary: " + newEmployee.getSalary() + "\nJoining Year: " + newEmployee.getJoiningYear() + "\nInsurance No: " + newEmployee.getInsuranceNo()
				);
	}

}
