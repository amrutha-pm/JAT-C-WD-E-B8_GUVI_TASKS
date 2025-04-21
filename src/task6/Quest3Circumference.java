package task6;

public class Quest3Circumference {

//Circumference of a circle 
	//c=2*pi*r

	 double pi= 3.14;
	 static double circumference;
	 double r=100;


	public Quest3Circumference()                     //Default constructor                                    
	{
     System.out.println("Default constructor");
    // System.out.println("Circumference :"+circumference);
	}

	
	public Quest3Circumference(double r, double pi)   //Parameterized constructor
	{		
		
		this.pi = pi;
		this.r = r;
		System.out.println("Parameterized constructor");

	}
	public void calculate2()
	 {
		//double r=20;
		 circumference = 2*pi*r;
		 System.out.println("Circumference of the circle : "+ circumference);
	 }
/*	public void calculate3()
	 {
		//double r=20;
		 circumference = 2*pi*r;
		 System.out.println("Circumference of the circle : "+ circumference);
	 }*/
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Circumference of the circle");
		Quest3Circumference obj = new Quest3Circumference();
	obj.calculate2();
    
	
	
	Quest3Circumference obj1 = new Quest3Circumference(3.14,4);
	   obj1.calculate2();
	
    
	}
	}

