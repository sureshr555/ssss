package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Apple  {

/*
	6)A to Z
    1 to 26
	A p  p l e 
    1 16 16 12 5
1+16+16+12+5=60
Output should be 60
*/

public static void main(String[] args) {

	char ch='*';
	int i=1;
	int sum=0;
	String name="Apple";
	System.out.println("GIVEN INPUT :"+name);
	name=name.toLowerCase();	
	Map<Character,Integer> map=new HashMap<Character, Integer>();
	Set<Entry<Character, Integer>> entrySet = map.entrySet();
	
	for(ch='a' ;ch<='z' ;ch++)
		{
		map.put(ch, i++);
		}
	
	for (Entry<Character, Integer> entry : entrySet) {
		Character key = entry.getKey();	
	for (int j = 0; j < name.length(); j++) {
	
		if(name.charAt(j)==key)
		{
			Integer value = entry.getValue();
			sum +=value;
			System.out.println(entry.getKey() +" is "+entry.getValue());
	    }}}
	System.out.println("TOTAL :"+sum);
}}