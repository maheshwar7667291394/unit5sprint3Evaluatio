package question2;

public class Main {
	
	public static void main(String[] args) {
		
		CalculateThread t1=new CalculateThread();
		synchronized (t1) {
			try {
				t1.start();
				t1.wait();
			} catch (Exception e) {
				
			}
		}
		
		System.out.println(t1.total);
	}

}
