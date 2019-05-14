package multithreading;
//using runnable interface
public class Method2 implements Runnable {
	public void run()
	{
		try{Thread.sleep(500);}
		catch (InterruptedException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		Method2 obj=new Method2();
		Thread obj1=new Thread(obj);
		obj1.start();
		obj1.run();
		Method2 obj2=new Method2();
		Thread obj3=new Thread(obj2);
		obj3.start();
		obj3.run();
}}
