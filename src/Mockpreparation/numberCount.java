package Mockpreparation;

public class numberCount {

	public static void main(String[] args) {
		
	
	int num=12345;
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
System.out.println(i);
}}
