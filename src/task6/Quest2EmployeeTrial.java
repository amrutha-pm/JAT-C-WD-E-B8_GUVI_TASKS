package task6;
public  class Quest2EmployeeTrial {

	int id,salary;
	static int percent;
	String name,firstname,lastname;
	
	
	public Quest2EmployeeTrial(int id,String firstname,String lastname,int salary)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
public int getId()
	{
return id;

	}
public String getFirstname()
{
	return firstname;
}
public String getLastname()
{
	return lastname;
}
public String getName()
{
	return (firstname +" " + lastname);
}
public int  getSalary()
{
	return salary;
}
public String toString()
{
    return "Employee ID: " + id + ", Name: " + firstname + " " + lastname  + ", salary: "+salary;
}
public int getAnnualSalary()
{
	return salary*12;
}

public int setraiseSalary(int percent)
{
	return salary*(percent)/100;
}
public int getraiseSalary() {
	return percent;
}
public int setSalary()
{
//return ((salary*percent)/100)+salary;
return(salary*10/100)+salary;
}
/*public void getSalary1() {
	System.out.println("Salary after increment");
}
*/
public int getnewAnnualSalary()
{
	return ((salary*10)+salary)*12;
}
			public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Quest2EmployeeTrial obj=new Quest2EmployeeTrial(1, "Amrutha", "Anil", 24000);
		obj.getFirstname();
		obj.getId();
		obj.getLastname();
		obj.getName();
		obj.setraiseSalary(10);	
	obj.toString();
	System.out.println("Employee details");
	System.out.println(obj.toString());
	 System.out.println("Employee salary details");
	 System.out.println("salary : "+ obj.getSalary());
	 System.out.println("Annual salary :"+obj.getAnnualSalary());
 System.out.println("Salary increment of " + percent + " percentage of salary : " + obj.setraiseSalary(10) );
	 System.out.println("Current salary after "+ percent +" increment :"+obj.setSalary());
	 System.out.println("Current annual salary after increment : "+obj.getnewAnnualSalary());
}
		
}