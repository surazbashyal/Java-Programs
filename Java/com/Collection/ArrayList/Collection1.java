package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

	public class Collection1{
		public static void main(String[] args) {
			
			Collection s1=new Collection(1, "Suraj");
			Collection s2=new Collection(2, "Suraj");
			Collection s3=new Collection(3, "Suraj");
			Collection s4=new Collection(4, "Suraj");
			List<Collection>students=new ArrayList<Collection>();
			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add(s4);
			/* Iterator itr=students.iterator();
			while(itr.hasNext())
			{
				Collection s=(Collection) itr.next();
				System.out.println(s.name+s.roll);
		}*/
			
			for(Collection s:students)
			{
				System.out.println(s.roll);
				System.out.println(s.name);
			}
				
	}
	}

