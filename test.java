package multithreading;
/*class tenthreads{
	synchronized void Countable(){
		int increment=0;
		increment++;
		System.out.println("count="+increment);
	}
	
}*/
class test extends Thread{
	public static void main(String args[]){
		for(int i=0;i<=9;i++){
			
			Thread t2=new Thread(){
				synchronized public void run(){
					int i;
					System.out.println();
					//t.Countable();
				}
			};
			t2.start();
		}
	}
}
