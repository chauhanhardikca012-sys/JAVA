import java.util.*;

class SumRecursion{
	public static int sum(int arr[]){
		int s = 0;
		int i;
		
			for(i=0;i<=arr.length-1;i++){
				s = s + arr[i];
			}
			return s;
	}
	public static void main(String[] args){
		int arr[] = {1,5,6,9,7,8,9,5,6,10};
		int c = sum(arr);
		System.out.print("Sum Of Array : "+ c);
	}
}