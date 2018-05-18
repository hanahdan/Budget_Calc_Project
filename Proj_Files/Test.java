package sampleProject;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee alex=new Employee("Alex",6);
		Employee linda=new Employee("Linda",7);
		Employee john=new Employee("John",3);
		Employee sara=new Employee("Sara",7);
		Employee james=new Employee("James",4);
		
		Department sales=new Department("Sales");
		Department it=new Department("IT");
		
		sales.addEmployee(alex);
		sales.addEmployee(linda);
		sales.addEmployee(john);
		
		it.addEmployee(sara);
		it.addEmployee(james);
		
		//Department dept= new Department();
		
		sales.describe();
		it.describe();

	}

}
