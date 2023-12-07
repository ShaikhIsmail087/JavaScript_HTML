package com.logic.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;import java.util.Map;

public class CollectionFrameworkPractice {
	
	public static void main(String[] args) {
		//starting with collections framework
		//list
		ArrayList<String> list=new ArrayList<>();
		list.add("Science");
		list.add("commerce");
		list.add("Arts");
		list.add("Arts");
		System.out.println("without iterating:"+list);
		Iterator<String> i=list.iterator();
		System.out.println("With iterating:");
		while(i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
		}
		
		//set
		HashSet<String> set=new HashSet<>();
		set.add("Red");
		set.add("Yellow");
		set.add("Green");
		set.add("Red");
		System.out.println("without iterating:"+set);
		Iterator<String> itr=set.iterator();
		System.out.println("with iterating:");
		while(itr.hasNext())
		{
			String st=itr.next();
			System.out.println(st);
		}
		
		//map
		HashMap<Integer, String> map=new HashMap<>();
		map.put(101, "Java");
		map.put(102, "Python");
		map.put(103, "PHP");
		map.put(104, "Ruby");
		System.out.println("without iterating:"+map);
		System.out.println("with iterating using forEach:");
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

}
