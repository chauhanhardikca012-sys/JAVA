class StringClass{
	public static void main(String []args){
		String str1 = "Hello";
		String str2 = "World";
		
		String result = str1 +" "+ str2;
		System.out.println("Concatenation :"+result);
		
		System.out.println("Lenght of String1 :"+str1.length());
		
		String str3 = "hello";
		System.out.println("Using Equals :"+str1.equals(str3));
		
		String senta = "Java Programming";
		System.out.println("Contains Programming :"+senta.contains("Programming"));
		
		System.out.println("UpperCase :"+str1.toUpperCase());
		System.out.println("LowerCase :"+str2.toLowerCase());
	}
} 