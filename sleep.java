package multithreading;

public class sleep extends Thread{
	public void run()
	{
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		sleep t1=new sleep();
		try {
			Thread.sleep(500);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
	}

