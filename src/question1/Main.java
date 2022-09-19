package question1;

public class Main {
	
	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		
		ThreadA t1=new ThreadA(a, b);
		ThreadB t2=new ThreadB(a, b);
		t1.start();
		t2.start();
	}

}
