package question4;

public class Thread3 extends Thread{
	
	
    @Override
     public void run() {
    	String name=Thread.currentThread().getName();
    	int p=1;
    	for(int i=1;i<=10;i++) {
    		p*=i;
    	}
    	System.out.println("Thread :"+ name+ " product is: "+p);
    	
    }
}
