package com.Collection.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }

	}

}
