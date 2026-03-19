import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileReadWrite{
	public static void main(String []args){
		try{
			FileWriter fw = new FileWriter("Hello.txt");
			fw.write("Hello This is java FileWriter");
			fw.close();
			System.out.println("Data Written Successfull");
			
			FileReader fr = new FileReader("Hello.txt");
			int ch;
			System.out.println("Reading ");
			
				while((ch = fr.read()) != -1){
					System.out.print((char)	ch);
				}
			fr.close();
		}catch(IOException e){
			System.out.println("Error :"+e.getMessage());
		}
	}
}