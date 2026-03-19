import java.io.File;

class FilePath {
    public static void main(String[] args) {

        File fi = new File("D:\\");

        String[] list = fi.list();

		for(String name : list){
			System.out.println(name);
		}
    }
}