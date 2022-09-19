package question2;

public class CalculateThread extends Thread{
	
	int total=1;
	
	@Override
	public  void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total*=i;
			}
			this.notify();
		}
		
		
	
	}
	
	

}
