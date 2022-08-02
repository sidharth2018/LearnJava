package learn.multithreading;

public class Reader implements Runnable {

	Message msg;
	long t;
	public Reader(Message msg) {
		this.msg=msg;
	}
	public Reader(Message msg,long t) {
		this.msg=msg;
		this.t=t;
	}
//	@Override
//	public void run() {
//		synchronized (msg) {
//			System.out.println(Thread.currentThread().getName()+"R:inside sync");
//			while(msg.empty) {
//				System.out.println(Thread.currentThread().getName()+"R:inside if");
//				try {
//					msg.wait();
//					System.out.println(Thread.currentThread().getName()+"R:just after wait");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			msg.empty=true;
//			System.out.println(msg.message);
//			msg.notifyAll();
//		}
//
//	}
	@Override
	public void run() {
			synchronized (msg) {
				try {
					msg.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+msg.message);
				try {
					Thread.sleep(t);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}

}
