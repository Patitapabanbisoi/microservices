package threadproject;

public class PdSolution {

	public static void main(String[] args) {
		
		
		producer pd=new producer("new area");
		consumer cm=new consumer(pd);
		Thread o1=new Thread(pd);
		Thread o2=new Thread(cm);
		
		
		o2.start();
		o1.start();
		

	}

}
