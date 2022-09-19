package question4;

public class Thread2 extends Thread{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("thread : "+name+" print number");
		 for(int i=1;i<=10;i++) {
			 System.out.println(i);
		 }
	}
	
	

}
