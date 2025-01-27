package example1;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter an interger Numbers:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name = sc.next();
		System.out.println(n);
		System.out.println(name);
		sc.close();
	}
}
