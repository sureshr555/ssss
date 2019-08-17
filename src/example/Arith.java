package example;

import java.util.Scanner;

public class Arith  {

	
	public static void main(String[] args) {
		
		
		Scanner Sc=new Scanner(System.in);
	
		System.out.println("Enter the num1 ");
		int num1=Sc.nextInt();
		System.out.println("Enter the num2 ");	
		int num2=Sc.nextInt();
		
		Add a=new Add(num1,num2);
		Divi d=new Divi(num1,num2);
		Sub s=new Sub(num1,num2);
		
	}
	
}
