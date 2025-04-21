package task6;

public class Employee {
static int id;
int salary;
String firstname;
String Lastname;
static String name;
	
	public Employee(int id,String firstname,String Lastname,int salary)
	{
		Employee.id=id;
		this.firstname=firstname;
		this.Lastname=Lastname;
		//this.name=name;
		this.salary=salary;
		System.out.println("Employee details");
		System.out.println();
		System.out.println("Employee id  : " + Employee.id);
		System.out.println("Firstname: " +this.firstname);
		System.out.println("Lastname : " + this.Lastname);
		System.out.println("Name : " + ( this.firstname +" " + this.Lastname));
		System.out.println("Employee salary :: " +this.salary);
	}
	public void raiseSalary(int percent) {
		System.out.println();
		System.out.println("salary increment percent : " + percent);
		System.out.println("new salary : "+(percent * salary));
		System.out.println("Annual salary : : " +(salary*12));
	}
	public String toString()
	{
		return "EmployeeQuest2"+"[Id="+id+","+"name=" +firstname+" "+Lastname+","+ "salary="+salary+"]";

		//System.out.println("Employee[" id= " + id ,"name= " +firstname+ " " + Lastname +,salary=?]");
		//return Lastname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee(1,"Amrutha","pm",20000);
		obj.raiseSalary(10);
		obj.toString();
		System.out.println("Employee details ");
		System.out.println(obj.toString());

	}

}
