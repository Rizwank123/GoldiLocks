package com.masai;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("Rizwan", 26);
		map.put("Ayaz", 25);
		map.put("Kishitija", 23);
		map.put("Ayush", 23);
		
		
		map.keySet().stream().forEach(a->System.out.println(a+"->  "+map.get(a)));
		
	}

}
