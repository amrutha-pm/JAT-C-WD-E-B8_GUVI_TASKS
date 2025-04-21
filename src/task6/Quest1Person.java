package task6;

public class Quest1Person 
{
	private String name;
	private int age;
	
	
public void setName(String name)
{
	this.name = name;
}
public void getName() 
{
	//return name;
	System.out.println("Name is : " + this.name);

}
public void setAge(int age)
{
	this.age =age;
}
public void getAge() 
{
	//return age;
System.out.println("Age is : " + this.age);
	
}}
/* class Quest1EncapSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quest1Person obj = new Quest1Person();
		obj.setName("Amrutha");
		obj.setAge(30);
		//System.out.println("Name is :" + obj.getName());
		//System.out.println("Age is :" + obj.getAge());
obj.getName();
obj.getAge();
	}

}*/
