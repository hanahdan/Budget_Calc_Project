package sampleProject;

public class Department {
private String deptName;
private double budget;

public Department(String deptName){
	this.deptName=deptName;
	this.budget=50000;
	
}
private Employee[] emp=new Employee[5];
private int counter=0;

public void addEmployee(Employee obj){
	emp[counter]=obj;
	counter++;
	if(obj.getGrade()>=5){
		this.budget += 150000;
			}
	else
	{
		this.budget +=100000;
	}
}
public void describe(){
	String temp="Department name: "+this.deptName+"Budeget :"+this.budget;
	System.out.println(temp);
}

	
}
