import mypackage.Calculator;
import mypackage.advanced.ScientificCalculator;

public class CalMain{
	public static void main(String []args){
		Calculator c = new Calculator();
		ScientificCalculator s = new ScientificCalculator();
		
		int sum = c.add(7,9);
		int sub = c.subtract(9,7);
		
		double sq = s.squre(7);
		double cu = s.cube(9);
		
		System.out.println("Addition :"+sum);
		System.out.println("Substraction :"+sub);
		System.out.println("Squre :"+sq);
		System.out.println("Cube "+cu);
		}
	}
