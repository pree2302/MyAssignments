package week3_day1_assignmnts;

public class Students_MethodOverload {
	
	public void getStudentInfo(int id)
	
	{
		System.out.println("Id:" +id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		
		System.out.println("Name:" +name);
	}
	
	public void getStudentInfo(long phno, String email)
	{
		System.out.println("Email ID:" +email);
		System.out.println("Phone Number:" +phno);
		
	}

	public static void main(String[] args) {
		
		Students_MethodOverload obj=new Students_MethodOverload();
		obj.getStudentInfo(513);
		obj.getStudentInfo(513,"Preethi R");
		obj.getStudentInfo(9790065822l, "pree2302@gmail.com");
		
	}
}
