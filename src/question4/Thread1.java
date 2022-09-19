package question4;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<20;i++) {
			sum+=i;
		}
		String name=Thread1.currentThread().getName();
		System.out.println("thread : "+name +" sum is: "+sum);
	}

}
