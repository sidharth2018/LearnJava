package learn.multithreading;

public class ConcurrentStringProcessor implements Runnable {

	StringListClass slc;
	public ConcurrentStringProcessor(StringListClass slc) {
		
		this.slc = slc;
		
	}
	@Override
	public void run() {
		
		String s = slc.removeString();
		for(int i = 0;i<s.length();i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s+":"+s.charAt(i));
		}

	}

}
