package example1;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> p = new Pair<Integer, String>();
		p.setKey(1);
		p.setValue("Suraj");
		System.out.print(p.getKey() + p.getValue());
	}

}
