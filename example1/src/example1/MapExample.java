package example1;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		for(Map.Entry<Integer, String> m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());

	}

}