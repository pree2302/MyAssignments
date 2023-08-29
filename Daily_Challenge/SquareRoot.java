package Daily_Challenge;

public class SquareRoot {
		
		public int SqRoot(int x) {
	        
	        int number = x/2;
	        int ans = 0;
	        int l = 1;
	        
	        if(x == 1)
	            return x;
	        
	        while(l <= number)
	        {
	            int middle_val = (l + number) / 2;
	            if((long) middle_val * middle_val <= x)
	            {
	                ans = middle_val;
	                l = middle_val + 1;
	            }
	            else
	            {
	                number = middle_val - 1;
	            }
	        }
	        return ans;
	    }
		
		
		public static void main(String[] args) {
			
			SquareRoot obj=new SquareRoot();
			
			System.out.println("The Square Root of 4: " +obj.SqRoot(4));
			System.out.println("The Square Root of 8: "+obj.SqRoot(8));
		}

	}


