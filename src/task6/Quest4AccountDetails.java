package task6;

public class Quest4AccountDetails {
int balance=5000;
int withdrwalAmonut=1000;
int DepositAmount=2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Account details using Default constructor");
		System.out.println();
		Quest4AccountDetails obj = new Quest4AccountDetails();
	    
		obj.methodForDeposit();
		obj.methodForWithdrawl();
		obj.methodForCheckBalance();
		obj.methodForDeposit2();   // //Did this extra method for practice only
		
		System.out.println();
		System.out.println("Account details using Parameterized constructor");
		System.out.println();
		Quest4AccountDetails obj2 = new Quest4AccountDetails(200,1000,10000);
		obj2.methodForDeposit();
		obj2.methodForWithdrawl();
		obj2.methodForCheckBalance();
		obj2.methodForDeposit2();
	}

	
	public Quest4AccountDetails() {    //Default constructor
		System.out.println("Current balance is :"+ balance);
	}
	public Quest4AccountDetails(int withdrwalAmonut,int DepositAmount,int balance) { 	//Parameterized constructor
		
		this.withdrwalAmonut = withdrwalAmonut;
		this.DepositAmount=DepositAmount;
		this.balance=balance;
		System.out.println("Current balance is :"+ balance);
	//	System.out.println("Withdraw amount : " +withdrwalAmonut);
	}
	public void methodForWithdrawl()
	{
		System.out.println("Withdrawal amount : " +withdrwalAmonut);
		balance = balance-withdrwalAmonut;
		System.out.println("Balance after withdrawal: "+(balance));
	}
	public void methodForDeposit()
	{
		System.out.println("Deposit amount : " +DepositAmount);
		balance = ((balance+DepositAmount));
		System.out.println("Balance after deposit :"+(balance));
		
	}
	public void methodForDeposit2()  //Did this extra method for practice only
	{
		int DepositAmount = 200;
		System.out.println("Deposit amount : " +DepositAmount);
		balance = ((balance+DepositAmount));
		System.out.println("Balance after deposit :"+(balance));
		
	}
	public void methodForCheckBalance()
	{
		
		System.out.println("Current balance after transactions : "+balance);
	}
}
