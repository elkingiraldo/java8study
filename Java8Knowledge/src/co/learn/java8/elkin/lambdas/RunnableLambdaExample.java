package co.learn.java8.elkin.lambdas;

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		
		// Before
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1");
			}
		};
		new Thread(t1).start();
		
		// Before ++
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread 4");
			}
		}).start();

		// Java 8
		Runnable t2 = () -> {System.out.println("Thread 2");};
		new Thread(t2).start();
		
		Runnable t3 = () -> {System.out.println("Thread 3");
			System.out.println("Thread 3.1");
		};
		new Thread(t3).start();
		
		// Java 8 ++
		new Thread(() -> System.out.println("Thread 5")).start();
		
		new Thread(() -> { // multiple lines of code we need {}
			System.out.println("Thread 6");
			System.out.println("Thread 6.1");
		}).start();
		
	}

}
