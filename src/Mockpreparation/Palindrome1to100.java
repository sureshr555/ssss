package Mockpreparation;

public class Palindrome1to100 {

	
	
	
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=1000; i++) {
			
			int n=i;
			int sum=0;
			int r=0;
			while(n>0)
			{
				r=n%10;
				sum=sum*10+r;
				n=n/10;
			}

			if(sum==i)
			{
				System.out.println(i);
			}
			
			
		}
		
	}
}
