import java.util.*;

class SortString{
	public static void main(String []args){
		String[] strings = {"grape0","orange","banana","apple"};
			Arrays.sort(strings);
				System.out.println("Sorted String :");
					for(String s :strings){
						System.out.println(s);
					}
	}
}