class WrapperClass{
	public static void main(String []args){
		int a = 7;
		Integer Int = a;
		
		double b = 7.99;
		Double Dob = b;

		char c = 'H';
		Character Char = c;

			System.out.println("AutoBoxing");
			System.out.println("Interger "+Int);
			System.out.println("Double "+Dob);
			System.out.println("Character "+Char);
			
		Integer d = 9;
		int num = d;
		
		Double e = 9.77;
		double num1= e;
		
		Character f = 'R';
		char char1= f;
		
			System.out.println("\nUnboxing");
			System.out.println("int "+num);
			System.out.println("double "+num1);
			System.out.println("char "+char1);
			
		String strInt = "79";
		int parsedInt = Integer.parseInt(strInt);

		String strDouble = "77.99";
		double parsedDouble = Double.parseDouble(strDouble);

		String strCharacter = "C";
		char parsedChar = strCharacter.charAt(0);
				
			System.out.println("\nParsing From String");	
			System.out.println("Parsed int "+parsedInt);
			System.out.println("Parsed double "+parsedDouble);
			System.out.println("Parsed char "+parsedChar);
	}
}