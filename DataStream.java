import java.io.*;

class DataStream {
    public static void main(String[] args) {

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("datastream.txt"));

            dos.writeInt(79);
            dos.writeDouble(9.7);
            dos.writeUTF("Java File");

            dos.close();

            System.out.println("Data Written Successfully");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}