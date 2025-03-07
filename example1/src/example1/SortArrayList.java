package example1;

import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a list of fruits
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		//Sorting the list
		Collections.sort(list1);
		
		//Traversing list through for-each loop
		for(String fruit:list1)
			System.out.println(fruit);
		
		System.out.println(list1.indexOf("Apple"));
		System.out.println(list1.indexOf("Grapes"
				+ ""
				+ ""));
		System.out.println("Sorting numbers...");
		
		//Creating a list of numbers
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		
		//Sorting the list
		Collections.sort(list2);
		
		//Traversing list through for-each loop
		for(Integer num:list2)
			System.out.println(num);
	}

}
