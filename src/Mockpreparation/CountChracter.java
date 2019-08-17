package Mockpreparation;

import java.util.HashMap;
import java.util.Map;

public class CountChracter {

	public static void main(String[] args) {
		
	
	String name="suresh";
	
	
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	
	char[] charArray = name.toCharArray();

for (char c : charArray) {
	
	
	if(map.containsKey(c))
	{
		Integer integer = map.get(c);
map.put(c,integer+1);
	}else{
		
		map.put(c,1);
}

	}

System.out.println(map);
}
	
}
