final class MathConstant{
	public static final double PI = 3.14159265359;
		
	public static void display(){
		System.out.println("Value of PI :"+PI);
	}
}
class FinalClass{
	public static void main(String []args){
		System.out.println("Access PI Direct :"+MathConstant.PI);
		
		MathConstant.display();
	}
}