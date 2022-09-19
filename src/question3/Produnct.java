package question3;

import java.util.concurrent.Callable;

public class Produnct implements Callable{
	
	int num;
	

	public Produnct(int num) {
		super();
		this.num = num;
	}


	@Override
	public Object call() throws Exception {
		int p=1;
		for(int i=1;i<=num;i++) {
			p*=i;
		}
		return p;
	}

}
