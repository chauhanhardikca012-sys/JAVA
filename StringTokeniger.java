import java.util.*;
class StringTokeniger{
	public static void main(String []args){
		String sen = "Java is a language";
		
		StringTokenizer  sa = new  StringTokenizer(sen);
		
		int count = sa.countTokens();
		System.out.println("Total Word :"+count);
		
		System.out.println("All Word in Tital :");
		
			while(sa.hasMoreTokens()){
				String word = sa.nextToken();
				System.out.println(word);
			}
	}
}