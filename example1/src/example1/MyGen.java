package example1;

class MyGen1<T> {
	T obj;
	public void setvalue(T value) {
		obj  = value;
	}
	
	public T getvalue() {
		return obj;
	}
}

public class MyGen {
	public static void main(String args[]) {
		MyGen1<Integer> m = new MyGen1<Integer>();
		m.setvalue(20);
		System.out.println(m.getvalue());
	}
}