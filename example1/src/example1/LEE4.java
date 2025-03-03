package example1;

interface Sayable {
	public String say(String name);
}

public class LEE4 {
	public static void main(String[] args) {
		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Suraj"));
		
		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Raghu"));
	}
	
}
