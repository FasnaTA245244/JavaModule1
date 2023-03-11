package userdefinedobject;
import java.util.HashSet;
import java.util.Iterator;

 

public class TestEmpHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> empSet = new HashSet<Employee>();
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Resarch",40000);
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000);
		Employee emp3 = new Employee("Jaison Doe","Male",28,103,"Sales",15000);
		Employee emp4 = new Employee("Jones Doe","Male",23,104,"Resarch",40000);
		Employee emp5 = new Employee("John Doe","Male",24,101,"Resarch",40000D);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet.size());
		
		
		

	}

}
