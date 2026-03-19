import java.util.*;
class RandomClass{
	public static void main(String []args){
		Random ra = new Random();
		
			int randomInt = ra.nextInt(50);
			
			float randomFloat = ra.nextFloat();
			
			
			boolean randomBool = ra.nextBoolean();
			
			System.out.println("Random Integer :"+randomInt);
			System.out.println("Random Float :"+randomFloat);
			System.out.println("Random Boolean :"+randomBool);
			
			int square = randomInt * randomInt;
			System.out.println("Random Interger Square :"+square);
			
			if(randomBool){
				System.out.println("True ...");
			}else{
				System.out.println("False ....");
			}
			
			float result = randomFloat * 9;
			System.out.println("Random Float Multiply by * 9 :"+result);
	}
}