package userdefinedobject;
import java.util.ArrayList;
import java.util.Iterator;

 

public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Resarch",40000);
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000);
		Employee emp3 = new Employee("Jaison Doe","Male",28,103,"Sales",15000);
		Employee emp4 = new Employee("Jones Doe","Male",23,104,"Resarch",40000);
		Employee emp5 = new Employee("John Doe","Male",24,101,"Resarch",40000D);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		
		
		

	}

}
