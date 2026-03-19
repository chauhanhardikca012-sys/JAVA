class ThrowDivide{
	static void divide(int a,int b) throws ArithmeticException{
		int ans = a / b;
		System.out.println("Ans :"+ans);
	}
	public static void main(String []args){
		try{
			divide(10,0);
		}catch(ArithmeticException e){
			System.out.println("Can not divide by 0");
		}
	}
}