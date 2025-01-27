package expt1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("D:\\sampletext.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			Student s = (Student)in.readObject();
			System.out.println(s);
			in.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
