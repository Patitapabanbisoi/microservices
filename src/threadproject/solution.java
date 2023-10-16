package threadproject;

public class solution {

	public static void main(String[] args) {
		
		
		Object train = new Object();
		Object comp=new Object();
		Booking book=new Booking(train, comp);
		cancelTicket ct=new cancelTicket(train, comp);
		
		Thread t1=new Thread(book);
		Thread t2=new Thread(ct);
		
		t1.start();
		t2.start();
		
	}

}
