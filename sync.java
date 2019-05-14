package multithreading;

class t1 {
	public void table(int k){
		for(int i=1;i<=10;i++){
		System.out.println(i*k);
	
		}
}}
class sync1 extends Thread{
	public void run(){
		t1 table1=new t1();
		table1.table(5);
	}
}
class sync2 extends Thread{
	
	public void run(){
		t1 table2=new t1();
		table2.table(10);
	}}
class sync extends Thread{
	public static void main(String args[]){
		//sync1 y=new sync1();
		Thread t=new Thread();
		t.start();
		//sync2 y1=new sync2();
		Thread t0=new Thread();
		t0.start();
	}
}
