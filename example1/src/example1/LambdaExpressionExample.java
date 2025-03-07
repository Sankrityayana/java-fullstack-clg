package example1;

@FunctionalInterface
interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		
		//with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing" + width);
		};
		d2.draw();
	}

}
