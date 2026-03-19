import java.util.Scanner;

class Throw{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("Enter Number :");
			int num = sc.nextInt();
			
			if(num < 0){
				throw new ArithmeticException("Not allowed Negative Numbers");
			}
			double ans = Math.sqrt(num);
			System.out.println("Squre Root :"+ans);
		}
		catch(ArithmeticException e){
			System.out.println("Error :"+e.getMessage());
		}
	}
}