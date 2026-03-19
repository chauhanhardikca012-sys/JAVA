import java.util.Scanner;

class Finally{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("Enter First Number :");
			int a = sc.nextInt();
			
			System.out.println("Enter Second Number :");
			int b = sc.nextInt();
			
			int ans = a / b;
			System.out.println("Division :"+ans);
			
		}
		catch(ArithmeticException e){
			System.out.println("Can not divide by 0");
		}
		finally{
			System.out.println("Finally Executed");
		}
	}
}