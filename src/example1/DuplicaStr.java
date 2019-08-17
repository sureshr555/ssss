package example1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicaStr {

	
	
	
	public static void main(String[] args) {
	
		
		String name="name is suresh suresh";
		
		String[] split = name.split(" ");
		Map<String , Integer> map=new HashMap<String, Integer>();
		
	for (String string : split) {
	
		if(map.containsKey(string))
		{
			
			Integer integer = map.get(string);
			map.put(string, integer+1);
		}else{
			map.put(string, 1);
		}
	
	}	System.out.println(map);
	
	
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	
	
	
	System.out.println(entrySet);
}}
