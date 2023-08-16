package week1.day1;

public class Mobilee {

	
	public long makeCall(long phno)
	{
		long phNum=phno;
		String mobModel="Oppo";
		float mobWt=65.6f;
		System.out.println("Mobile number           :"+phNum);
		System.out.println("Model of the mobile     :" +mobModel);
		System.out.println("Weight of the mobile    :"+mobWt);
		return phNum;
	}
	
	public void sendSms()
	{
		
		boolean isFullCharged=true;
		int mobCost=25000;
		//System.out.println("From Oppo");
		System.out.println("Is Fully Charged        :" +isFullCharged);
		System.out.println("Cost of the Mobile      :" +mobCost);
	}
	
	public static void main(String[] args) {
   
		Mobilee obj=new Mobilee();
		System.out.println("This is My Mobile:");
		obj.makeCall(9159140383l);
		obj.sendSms();
		
	}

}
