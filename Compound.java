import java.util.*;
class Compound{
	public static void main(String []args){
		double principal = 15000,rate = 5.5,time = 3;
			
		
			double compound = principal * (Math.pow(1 + rate/100,time))-principal;
			
			System.out.println("Comound Interest = "+ compound);
	}
}