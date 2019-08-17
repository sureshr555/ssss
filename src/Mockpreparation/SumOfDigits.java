package Mockpreparation;

public class SumOfDigits {

public static void main(String[] args) {
	

	int num=1235;
int sum=0;
int r=0;

		while(num>0)
		{
			r=num%10;
			sum = sum+r;

			num=num/10;
		}
		
		
		System.out.println(sum);
	}
	
}	

