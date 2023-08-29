package week3_day1_assignmnts;

public class Automation extends AbstractClass implements Language,TestTool {

	
	public void Selenium() {
		
		System.out.println("Language:");		
	}

	public void Java() {
		System.out.println("TestTool");	
	}
	
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.Selenium();
		obj.Java();
		obj.python();
		obj.ruby();
		
	}
}
