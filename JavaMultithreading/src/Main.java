
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// multithreading = Process of executing multiple threads simultaneously
		// 					Ex. Running multiple applications at the same time
		//                  Helps maximize CPU utilization
		//                  Threads are independent they don't affect the performance of other threads
		//                  Each thread runs in a separate stack memory space
		//                  An exception in one thread will not affect other threads
		
		// Ways to create threads:
		// 1. Extend the Thread class
		MyThread thread1 = new MyThread();
		
		// or
		
		// 2. Implement the Runnable Interface and pass it to the Thread constructor
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		//thread1.setDaemon(true);
		//thread2.setDaemon(true);
		
		thread1.start();
		//thread1.join(3000); //calling thread will wait for the thread1 to finish for 3 seconds
		thread2.start();
		
		System.out.println(1 / 0);
		
	}

}
