package multithreading;
class newTable{
	synchronized public void print_table(String n){
		System.out.println("The item number is:"+n);
	}
}
class sync_with_anonymous extends table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newTable t1=new newTable();
		Thread thread1=new Thread(){
			public void run(){
				String str1="Produced";
				t1.print_table(str1);
			}
		};
		Thread thread2=new Thread(){
			public void run(){
				t1.print_table("marketed");
			}
		};
		Thread thread3=new Thread(){
			public void run(){
				t1.print_table("Consumed");
			}
		};
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
