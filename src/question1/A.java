package question1;

public class A {
	
	public synchronized  void funA(B b) {
		System.out.println("inside funA of A");
		b.fun2();
		System.out.println("out side of funA of A");
	}
	 
   public synchronized void fun1() {
	   System.out.println("inside of fun1 of A");
   }

}
