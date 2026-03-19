import java.util.Scanner;
class Convert{
	public static void main(String args[]){
		System.out.print("Enter Dollar :");
		Scanner sc = new Scanner(System.in);
		int doll = sc.nextInt();
		
			System.out.print("Current Dollar Price :");
			int curr = sc.nextInt();
			
			doll = doll * curr;
			System.out.print("Rupee "+ doll);
	}
}