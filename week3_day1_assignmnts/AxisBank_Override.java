package week3_day1_assignmnts;

public class AxisBank_Override extends BankInfo_Override{
	
	public void deposit()
	{
		System.out.println("AxisBank Deposits");
	}

	public static void main(String[] args) {
		
		BankInfo_Override obj=new BankInfo_Override();
		obj.deposit();
		
		AxisBank_Override obj1=new AxisBank_Override();
		obj1.deposit();
	}
}
