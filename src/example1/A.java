package example1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
	

		
		String name="sdsd";
		
	
	char[] charArray = name.toCharArray();
	
	
	Map<Character, Integer> map=new HashMap<Character, Integer> ();
	
	
	
	for(char c:charArray)
	{
	
		if(map.containsKey(c))
		{
			
			Integer integer = map.get(c);
			
			
			map.put(c, integer+1);
			
		}else{
			
			map.put(c, 1);
			
		}
	
		
		
		
	}
	
	System.out.println(map);
	}}
		
		
		
		
		
		
	/*	String num="12345";
		
		
		
		
		char[] charArray = num.toCharArray();
		
		
		
		String names=charArray.toString();
		
		
		String names1=String.valueOf(charArray);
		
		
	System.out.println(num.length());
	*/
	
	//String to int
	
	
	/*
		int number=Integer.parseInt(num);
		int number1=1;
		
	
		System.out.println(number+number1);
		
		*/
		
		
		
		
		
		
		
		
		

/*		
		QUESTION 8.4
--------------
Input  = 5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101
Output = 5-35-2a,venkatesh nivas,Aruppukottai 


int lowercase=0;
		int uppercase=0;
		String name="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		
		
String replaceAll = name.replaceAll("pincode[-][1-9]"," ");
		
		
		
		System.out.println(replaceAll);
	}}
*/