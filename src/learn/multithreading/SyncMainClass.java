package learn.multithreading;

public class SyncMainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Message m = new Message();
		Writer w1 = new Writer(m);
		Reader r1 = new Reader(m,2000);
		Reader r2 = new Reader(m,0);
		Thread tw1 = new Thread(w1,"Writer1");
		Thread tr1 = new Thread(r1,"Reader1");
		Thread tr2 = new Thread(r1,"Reader2");
		tr1.start();
		
		tr2.start();
		Thread.sleep(2000);
		tw1.start();

	}

}
