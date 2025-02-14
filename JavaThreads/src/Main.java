
public class Main {

	public static void main(String[] args) {
		// thread = the excution of a sequence of programmed instructions
		// a single thread can only do one thing at a time
		// a multi-threaded program can run multiple threads concurrently
		// There are user threads and daemon threads
		// user threads are high-priority threads
		// daemon threads are low-priority threads
		// E.g: the main thread is a user thread
		
		
		//System.out.println(Thread.activeCount());
		//Thread.currentThread().setName("Maiin");
		//System.out.println("Current thread: " + Thread.currentThread().getName());
		
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		//System.out.println(Thread.currentThread().getPriority());
		
		//System.out.println(Thread.currentThread().isAlive());
		
		/* for (int i = 3; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
		System.out.println("Happy New Year!");
	}
	    */
		
		MyThread thread2 = new MyThread();
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		thread2.start();
		//System.out.println(thread2.isAlive());
		
		//thread2.setName("MyThread");
		//System.out.println(thread2.getName());
		//thread2.setPriority(Thread.MIN_PRIORITY);
		//System.out.println(thread2.getPriority());
		//System.out.println(Thread.activeCount());
	}
}
