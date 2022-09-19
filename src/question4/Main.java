package question4;

public class Main {
	
	public static void main(String[] args) {
		
		Thread1 dhoni=new Thread1();
		Thread2 kohali=new Thread2();
		Thread3 rohit=new Thread3();
		
		dhoni.setName("DHoni");
		kohali.setName("kohali");
		rohit.setName("rohit");
		
		dhoni.setPriority(10);
		rohit.setPriority(8);
		kohali.setPriority(1);
		
		
		
		dhoni.start();
		rohit.start();
		kohali.start();
		
	}

}
