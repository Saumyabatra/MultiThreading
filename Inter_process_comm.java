package multithreading;
class Customer{
	int Amount=10000;
	public synchronized void withdraw(int amount){
		System.out.println("Going to withdraw");
		if(Amount<amount){
			System.out.println("Insufficient Balance in the account");
			try{wait();}catch(Exception e){
				
			};
			Amount=amount;
			System.out.println("Withdraw completed");
		}
	}
	public synchronized void deposit(int amount){
		System.out.println("Going to deposit");
		Amount+=amount;
		System.out.println("Amount depostied");
		notify();
	}
}
public class Inter_process_comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c=new Customer();
		Thread t1=new Thread(){
			public void run(){
			c.withdraw(150000);}
		};
		t1.start();
		
		Thread t2=new Thread(){
			public void run(){
				c.deposit(10000);
			}
		};
		t2.start();
		

	}

}
