package pattern.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonCreator singleton1 = SingletonCreator.getInstance();
		SingletonCreator singleton2 = SingletonCreator.getInstance();
		
		System.out.println(singleton1==singleton2);
		System.out.println(singleton1);
		System.out.println(singleton2);
	}

}
