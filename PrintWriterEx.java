import java.io.PrintWriter;
import java.io.IOException;

class PrintWriterEx {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("file.txt");

            pw.println("Name : Hardik");
            pw.println("Age : 19");
            pw.println("City : Surendranagar");

            pw.close();

            System.out.println("Data Written");
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}	