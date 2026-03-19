import java.util.*;

class MaxRecursion{
	public static int max(int arr[]){
		int m = 0;
		int i;
			for(i=0;i<=arr.length	-1;i++){
				if(m<arr[i]){
					m = arr[i];
				}
			}
			return m;
	}
	public static void main(String[] args){
		int arr[] = {10,60,75,5,65,98,23,54,23,19};
		int c = max(arr);
		System.out.print("Max Of Array : "+c);
	}
}