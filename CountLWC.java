import java.io.*;

class CountLWC {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);

        int l = 0, w = 0, c = 0;
        String line;

        while ((line = br.readLine()) != null) {
            l++;                         
            c = c + line.length();       
            w = w + line.split(" ").length; 
        }

        System.out.println("Lines : " + l);
        System.out.println("Words : " + w);
        System.out.println("Characters : " + c);

        br.close();
        fr.close();
    }
}