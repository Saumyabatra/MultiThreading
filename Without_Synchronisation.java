package multithreading;
class table
{ static synchronized public void run_table(int n)
	{
		for(int i=0;i<=5;i++){
			System.out.println(n*i);
		}
	try{
		Thread.sleep(10000);}
	catch(Exception e){
		System.out.println(e);
	}
	
}
}
class test1 extends Thread{
		table t;
		test1(table t) {
			this.t=t;
		}
		public void run(){
			t.run_table(5);
		}
		
}
class test2 extends Thread{
	table t;
	test2(table t) {
		this.t=t;
	}
	public void run(){
		t.run_table(10);
	}
	
}
public class Without_Synchronisation {
	public static void main(String args[]){
		table tab=new table();
		test1 t1=new test1(tab);
		t1.start();
		test2 t2=new test2(tab);
		t2.start();
	}}

