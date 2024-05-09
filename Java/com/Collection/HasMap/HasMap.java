package com.Collection.HasMap;

import java.util.HashMap;

public class HasMap {
public static void main(String[] args) {
	HashMap <String,Integer> map=new HashMap<>();
	map.put("Suraj",11);
	map.put("Sonu", 10);
	System.out.println("Size of map: "+map.size());
	System.out.println("Elements of map"+map);
	if(map.containsKey("Suraj"))
	{
   Integer a = map.get("Suraj");
	System.out.println("value for key"
            + " \"Suraj\" is:- " + a);
}
}
}