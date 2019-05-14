//Creation of thread using Thread class
package multithreading;
public class method1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hello from method1 where i="+i);
		}
		try{Thread.sleep(500);}
		catch (InterruptedException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
			method1 t1=new method1();
			t1.start();
			t1.getName();
			t1.getId();
			t1.getPriority();
			
			
			method1 t2=new method1();
			t2.start();
		
	}

}
