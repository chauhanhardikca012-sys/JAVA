public class RunnableThread implements Runnable{
	public static void main(String []args){
		RunnableThread rn = new RunnableThread();
		Thread thread = new Thread(rn);
		
		thread.start();
			System.out.println("Out side of thread");
	}
	public void run(){
		System.out.println("Running in thread");
	}
}