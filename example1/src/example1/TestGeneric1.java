package example1;

class MyGen2<k, v> {
	private k key;
	private v value;
	
	public void setvalue(k key, v value) {
		this.key = key;
		this.value = value;
	}
	
	public v getvalue() {
		return value;
	}
}

public class TestGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGen2<Integer, String> m = new MyGen2<Integer, String>();
		m.setvalue(1, "hi");
		m.setvalue(2, "null");
		System.out.println(m.getvalue());

	}

}
