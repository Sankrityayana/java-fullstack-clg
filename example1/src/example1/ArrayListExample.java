package example1;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num = new TreeSet<Integer>();
		num.add(53);
		num.add(23);
		num.add(72);
		num.add(16);
		num.add(22);
		num.add(22);
		
		for(Integer n:num)
			System.out.println(n);
	}

}
