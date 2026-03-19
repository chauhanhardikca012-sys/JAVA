import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
		
		System.out.print("Enter String :");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		st =  st.toLowerCase();
		
		boolean isstring = true;
			
		int left = 0;
		int right = st.length() - 1;
		
		while(left < right){
			if(st.charAt(left) != st.charAt(right)){
				isstring = false;
				break;
			}
			left ++;
			right --;
		}
		if(isstring){
			System.out.print("This string is Palindrome");
		}else{
			System.out.print("This string is not Palindrome");
		}
	}
}