import java.util.Scanner;
class Power{
	public static void main(String []args){
		Scanner sc =  new Scanner(System.in);
		
			System.out.print("Enter Base :");
			int base = sc.nextInt();
			System.out.print("Enter Exponent :");
			int exponent = sc.nextInt();
			
			long result= 1;
				while(exponent != 0){
					result = result * base;
					--exponent;
				}
			System.out.println("Result :"+result);
	}
}