package learn.multithreading;

public class Writer implements Runnable {
	
	Message msg;
	
	public Writer(Message msg) {
		this.msg=msg;
	}

	@Override
	public void run() {
		synchronized (msg) {
			msg.message="Writers Message";
			msg.notifyAll();
		}
		
	}

//	@Override
//	public void run() {
//		synchronized (msg) {
//			System.out.println(Thread.currentThread().getName()+"W:inside sync");
//			while(!msg.empty) {
//				System.out.println(Thread.currentThread().getName()+"W:inside if");
//				try {
//					msg.wait();
//					System.out.println(Thread.currentThread().getName()+"W:just after wait");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println(Thread.currentThread().getName()+"Writes message");
//			msg.message="Writers message";
//			msg.empty=false;
//			msg.notifyAll();
//		}
//
//	}

}
