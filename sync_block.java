package multithreading;
class newTableau{
	public void print_table(int n){
		synchronized(this){
		for(int i=0;i<=5;i++){
			System.out.println(n*i);
		}
	}
}
}
public class sync_block {
	public static void main(String args[]){
	newTableau t1=new newTableau();
	Thread thread3=new Thread(){
		public void run(){
			t1.print_table(4);
		}
	};
	Thread thread4=new Thread(){
		public void run(){
			t1.print_table(5);
		}
	};
	thread3.start();
	thread4.start();
}}
