package threadproject;

public class consumer extends Thread{
	
	producer pd;

	public consumer(producer pd) {
		super();
		this.pd = pd;
	}
	public void run()
	{
		synchronized (pd.str) {
			
			System.out.println("pd.str is locked");
			try {
				System.out.println("wait");
				pd.str.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			System.out.println("waiting is over");
			
			
		}
	}

}
