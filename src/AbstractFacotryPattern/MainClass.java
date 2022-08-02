package AbstractFacotryPattern;

interface Frame{
	
	void frameType();
}

interface Latch{
	void latchType();
}

interface window{
	Frame constructFrame();
	Latch fixLatch();
}

class WoodFrame implements Frame{

	@Override
	public void frameType() {
		System.out.println("Wooden Frame");
		
	}
	
}

class MetalFrame implements Frame{

	@Override
	public void frameType() {
		System.out.println("Metal Frame");
		
	}
	
}

class MetalLatch implements Latch{

	@Override
	public void latchType() {
		System.out.println("Metal Latch");
		
	}
	
}
class ElectronicLatch implements Latch{

	@Override
	public void latchType() {
		System.out.println("Elecrotnic Latch");
		
	}
	
}

class WoodMetalWindow implements window{

	@Override
	public Frame constructFrame() {
		// TODO Auto-generated method stub
		return new WoodFrame();
	}

	@Override
	public Latch fixLatch() {
		// TODO Auto-generated method stub
		return new MetalLatch();
	}
	
}

class ElctronicWindow implements window{

	@Override
	public Frame constructFrame() {
		// TODO Auto-generated method stub
		return new MetalFrame();
	}

	@Override
	public Latch fixLatch() {
		// TODO Auto-generated method stub
		return new ElectronicLatch();
	}
	
}

public class MainClass {

}
