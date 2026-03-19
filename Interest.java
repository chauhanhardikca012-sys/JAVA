import java.util.Scanner;

class Interest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter Principle Amount:");
			double prin = sc.nextDouble();
			
			System.out.print("Enter Rate of Interest :");
			double rate = sc.nextDouble();
			
			System.out.print("Enter Time period of year :");
			double time = sc.nextDouble();
			
			double interest = (prin * rate * time)/100;
			
			System.out.print("Simple Interest :" + interest );
	}
}