package week3_day1_assignmnts;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("Desktop Size from sub Class");
	}
	
	public static void main(String[] args) {
		
		Computer obj=new Computer();
		obj.computerModel();
		
		Desktop obj1=new Desktop();
		obj1.desktopSize();
	}
}
