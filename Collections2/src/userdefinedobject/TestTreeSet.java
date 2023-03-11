package userdefinedobject;
import java.util.TreeSet;
import java.util.Iterator;

 

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> empTreeSet = new TreeSet<Employee>();
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Resarch",40000);
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000);
		Employee emp3 = new Employee("Jaison Doe","Male",28,103,"Sales",15000);
		Employee emp4 = new Employee("Jones Doe","Male",23,104,"Resarch",40000);
		Employee emp5 = new Employee("John Doe","Male",24,101,"Resarch",40000D);
		
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		System.out.println(empTreeSet);
		
		
		

	}

}
