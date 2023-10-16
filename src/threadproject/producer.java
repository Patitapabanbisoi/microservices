package threadproject;

public class producer extends Thread{
	
	String str;

	public producer(String str) {
		super();
		this.str = str;
	}
	
	public void run()
	{
		synchronized(str)
		{
			System.out.println("str is synchronized");
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
			}
			
			System.out.println("notify");
			str.notify();
		}
		
	}
	
	
	

}
