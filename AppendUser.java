import java.io.*;
import java.util.Scanner;

class AppendUser{
	public static void main(String []args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("data.txt",true);
		
		System.out.print("Enter Data :");
		String text = sc.nextLine();
		
		fw.write(text + "\n");
		
		fw.close();
		System.out.println("Data  Append");
	}
}
	 
