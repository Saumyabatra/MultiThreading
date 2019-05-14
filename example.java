package multithreading;
import java.util.*;
class example extends Thread { 

	  public example (String s) { 
	    super(s); 
	  }

	  public void run() { 
	    System.out.println("Run: "+ getName()); 
	  } 
	}


	 class TestThread {
	  public static void main (String arg[]) { 

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please input the number of Threads you want to create: ");
	    int n = sc.nextInt();
	    System.out.println("You selected " + n + " Threads");

	    for (int x=0; x<n; x++)
	    {
	        example temp= new example("Thread #" + x);
	        temp.start();
	        System.out.println("Started Thread:" + x);
	    }
	}
	}