package threadproject;

public class cancelTicket extends Thread{
	
	Object Train, comp;

	public cancelTicket(Object train, Object comp) {
		super();
		Train = train;
		this.comp = comp;
	}
	
	public void run()
	{
		synchronized (Train) {
			
			System.out.println("comp is locked");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("waiting for train");
			synchronized (comp) {
				System.out.println("train is synchronised");
				
			}
			
		}
	}

}
