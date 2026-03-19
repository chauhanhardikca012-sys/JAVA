import java.util.Scanner;

class Pattern_2{
	public static void main(String args[]){
		int i,j;
		System.out.print("Enter Num :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			for(i=1;i<=num;i++){
				for(j=1;j<=i;j++){
					System.out.print(j);
				}
				System.out.print("\n");
			}
	}
}