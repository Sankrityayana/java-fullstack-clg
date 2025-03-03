package expt2;

import java.util.*;

public class Temp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(new Student(1, "Shiva", 10000.00f, "cse", 1, 1, 18));
		s1.add(new Student(2, "Venky", 15000.00f, "ise", 1, 2, 20));
		s1.add(new Student(3, "Jesus", 17000.00f, "ece", 1, 1, 19));
		s1.add(new Student(3, "Alla", 12000.00f, "eee", 1, 1, 19));
		s1.add(new Student(3, "Budha", 11000.00f, "mech", 1, 1, 21));
		
		System.out.println("Sorting by Name");
		System.out.println("____________________");
		Collections.sort(s1, new NameComparator());
		Iterator<Student> itr = s1.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st);
		}
		
		System.out.println("Sorting by Age");
		System.out.println("____________________");
		Collections.sort(s1, new AgeComparator());
		itr = s1.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st);
		}
		
		System.out.println("Sorting by Fees");
		System.out.println("____________________");
		Collections.sort(s1, new FeesComparator());
		itr = s1.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st);
		}
	}	

}
