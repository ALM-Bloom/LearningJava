
public class MyThread extends Thread{
	
	@Override
	public void run() {
		if (this.isDaemon()) {
			System.out.println("This is a Daemon Thread");
		} else {
			System.out.println("This is a User Thread");
		}
		System.out.println("This Thread is running");
	}
}
