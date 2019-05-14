package multithreading;

class ten extends Thread{
	static int n=1,a=1;
	static synchronized void incr(){
		
		System.out.println("Thread"+a+++"="+n++);
	}
	 public void run(){  
	   incr();
	 }  
	 public static void main(String args[]){  
	  for(int i=1;i<=10;i++){
		  //System.out.println(new Thread());
		  ten n=new ten();
		  n.run();
	  }
	 }  
	}  