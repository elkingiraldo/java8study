package co.learn.java8.elkin;

@FunctionalInterface
public interface TestInterface {

	// Only ONE method because of @FunctionalInterface
	public void add();
	
	// We can have default methods
	default String sayHi() {
		return "Hi";
	}
	
	default String sayBye() {
		return "Bye!";
	}
	
	// We can have static method also!
	static boolean isTrue() {
		return true;
	}
	
	static boolean isFalse() {
		return false;
	}
	
}
