package expt1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student s1 = new Student(300, "Suraj", 200);
			File f = new File("D:\\sampletext.txt");
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.flush();
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Success");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
