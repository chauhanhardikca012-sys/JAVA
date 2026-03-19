class Fact{
	public static void main(String[] args){
		int  fact = 1, num = 6;
		
			for(int i = 1;i<=num; i++){
				fact *=i;
			}
			System.out.print("Factorial is : " + fact);
	}
	
}