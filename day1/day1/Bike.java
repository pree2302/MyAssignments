package week1.day1;

public class Bike {

	public void applyBreak()
	{
		System.out.println("Bike: Applied Break");
	}
	
	public void soundHorn()
	{
		System.out.println("Bike: Sound Horn");
	}
	
	public static void main(String[] args) {
		
		Car object=new Car();
		object.applyBreak();
		object.soundHorn();

		Bike object2=new Bike();
		object2.applyBreak();
		object2.soundHorn();
		
	}

}
