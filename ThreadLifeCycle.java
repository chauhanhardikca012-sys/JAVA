class ThreadLifeCycle extends Thread{
	public void run(){
		try{
			System.out.println("Thread Running");
			
			Thread.sleep(2000);
			
			System.out.println("After Sleep Running ");
		}
		catch (InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Thread is Completed");
	}
	public static void main(String []args){
		ThreadLifeCycle tlc = new ThreadLifeCycle();
		
		System.out.println("Thread After Create "+tlc.getState());
		
		tlc.start();
		System.out.println("Thread After Start :"+tlc.getState());
		
		try{
			Thread.sleep(500);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Thread during Execute "+tlc.getState());
	}
}