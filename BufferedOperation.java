import java.io.*;

class BufferedOperation{
	public static void main(String []args)throws Exception{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"));
		
		bw.write("Hello, BufferedWriter Ex");
		bw.close();
		
		System.out.println("Data Writted");
		
		BufferedReader br = new BufferedReader(new FileReader("buffer.txt"));
		String line;
		
		System.out.println("\nReading ");
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();
	}
}