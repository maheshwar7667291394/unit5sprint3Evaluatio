package question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Produnct[] product= {
				new Produnct(2),
				new Produnct(3),
				new Produnct(4),
				new Produnct(5),
				new Produnct(6),
				new Produnct(5),
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(Produnct item: product) {
			Future f=service.submit(item);
			System.out.println(f.get());
		}
		service.shutdown();

		
	}

}
