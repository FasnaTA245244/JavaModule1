package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address resAdd = new Address("31", "Mannath", "Worli", "Mumbai",400048);
		Address commAdd = new Address("32","Antela","Bandra","Mumbai",400032);
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Resarch",40000,resAdd,commAdd);
		System.out.println(emp1);
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000,resAdd,commAdd);
		System.out.println(emp2);
		Employee emp3 = new Employee("Jaison Doe","Male",28,103,"Sales",15000,resAdd,commAdd);
		System.out.println(emp3);
		Employee emp4 = new Employee("Jones Doe","Male",23,104,"Resarch",40000,resAdd,commAdd);
		System.out.println(emp4);
		Employee emp5 = new Employee("John Doe","Male",24,101,"Resarch",40000,resAdd,commAdd);
		System.out.println(emp5);
		
		
		if(emp1.equals(emp5))                     //  || emp1 == emp5)
		{
			System.out.println("The objects are same");
		}
		else
		{
			System.out.println("The objects are not same");
		}

	}

}
