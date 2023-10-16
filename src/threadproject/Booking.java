package threadproject;

public class Booking extends Thread{
	
	Object Train, comp;

	public Booking(Object train, Object comp)
	{
		super();
		Train = train;
		this.comp = comp;
	}
	public void run()
	{
	synchronized(Train)
	{
		System.out.println("booking train train locked");
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("waiting for comp");
		synchronized (comp) {
			System.out.println("comp is locked");
			
		}
		
		
		
	}
	

}
	
}
