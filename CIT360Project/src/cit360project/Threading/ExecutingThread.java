package Threading;

import java.util.concurrent.*;

class SimpleThread extends Thread {
	ExecutorService service = null;
    public SimpleThread(String str, ExecutorService exec) {
        super(str);
        service = exec;
    }
    public void run() {
    	System.out.println("Start " + getName());
		service.execute(() -> System.out.println("begin with Executor " + getName()));
		service.execute(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " " + getName());
				try {
					sleep((int)(Math.random() * 1000));
				} catch (InterruptedException e) {}
			}
		 });
		service.execute(() -> System.out.println("end  with Executor" + getName()));
    	System.out.println("END " + getName());
    }
}

public class ExecutingThread{
    public static void main (String[] args) {
    	ExecutorService exec = Executors.newSingleThreadExecutor();
    	System.out.println("Create Threads");
        SimpleThread byu = new SimpleThread("BYU",exec);
        SimpleThread idaho = new SimpleThread("Idaho",exec);
        byu.start();
        idaho.start();
        try {
			byu.join();
			idaho.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			exec.shutdown();
			System.out.println("Shutdown Executor");
		}
    	System.out.println("DONE Threads");
        
    }
}