import java.io.*;

class CopyFile {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("main.txt");
        FileWriter fw = new FileWriter("copy.txt");

        int ch;

        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("File Copied");
    }
}