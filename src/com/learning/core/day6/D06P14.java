package com.learning.core.day6;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


	


public class D06P14 {
	public static void main(String[] args)
	{
		Map<Integer, Employee2> ht=new Hashtable<Integer,Employee2>();
		Employee2 e1=new Employee2("Daniel","Analyst","L&D");
		Employee2 e2=new Employee2("Thomas","Tester","Testing");
		Employee2 e3=new Employee2("Robert","Product Manager","Development");
		Employee2 e4=new Employee2("Grace","Tech Support","HR");
		Employee2 e5=new Employee2("Charles","QA Lead","Testing");
		Employee2 e6=new Employee2("Henry","Accountant","Finance");
		ht.put(1001, e1);
		ht.put(1002, e2);
		ht.put(1003, e3);
		ht.put(1004, e4);
		ht.put(1005, e5);
		ht.put(1006, e6);
		TreeMap<Integer,Employee2> tm=new TreeMap<>(Collections.reverseOrder());
		tm.putAll(ht);
		for(Entry<Integer,Employee2> e: tm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
