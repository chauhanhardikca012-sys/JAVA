import java.util.Scanner;
class Vowel{
	public static void main(String []args){
		
		System.out.print("Enter The Char :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextCharAt(0);
		
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
				System.out.print("This is Vowel");
			}else{
				System.out.print("This is Not Vowel");
			}
	}
}