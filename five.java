package multithreading;
class abc implements Runnable{
	public void run(){
		System.out.println("Hello from Thread 1");
	}
}
class def implements Runnable{
	public void run(){
		System.out.println("Hello from Thread 2");
	}
}
class ghi implements Runnable{
	public void run(){
		System.out.println("Hello from Thread 3");
	}
}
class jkl implements Runnable{
	public void run(){
		System.out.println("Hello from Thread 4");
	}
}
class mno implements Runnable{
	public void run(){
		System.out.println("Hello from Thread 5");
	}
}
class five {
	public static void main(String[] args) {
	abc obj1=new abc();
	Thread t1=new Thread(obj1);
	def obj2=new def();
	Thread t2=new Thread(obj2);
	ghi obj3=new ghi();
	Thread t3=new Thread(obj3);
	jkl obj4=new jkl();
	Thread t4=new Thread(obj4);
	mno obj5=new mno();
	Thread t5=new Thread(obj5);
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	t4.setPriority(Thread.NORM_PRIORITY);
	t5.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t3.start();
	t5.start();
	t2.start();
	t4.start();
	try{
	t1.sleep(100);
	t2.sleep(200);
	}catch (Exception e){System.out.println(e);}
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	System.out.println(t4.isAlive());System.out.println(t5.isAlive());
}}
