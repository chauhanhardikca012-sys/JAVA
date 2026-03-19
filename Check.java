import java.util.Scanner;

class Check{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num:");
		int num = sc.nextInt();
		
			if(num > 0){
				System.out.print("Positive");
			}else if(0 > num){
				System.out.print("Negative");
			}else{
				System.out.print("Zero");
			}
	}
}