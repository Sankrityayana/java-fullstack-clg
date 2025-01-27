package expt1;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int fees;
	
	public Student(int id, String name, int fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	
	public String toString() {
		return id + "       " + name + "   " + fees + "\n";
	}
}
