package Mockpreparation;

public class PalindromeNumber {
public static void main(String[] args) {
	


	int num=121;
	int reverse=num;
	int r=0;
	int sum=0;
	int i=0;
	
	while(num>0)
	{
		
	r=num%10;
	sum=sum*10+r;
	num=num/10;
	i++;
	}
	System.out.println(sum);
	
if(reverse == i)
{
	System.out.println("palindrome");
	
}else{
	System.out.println("not palindrome");
}
}}


