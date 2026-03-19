import java.util.Arrays;

public class BubbleSort{
	public static void main(String []args){
		String[] arr = {"pineapple","grapes","orange","apple","banana"};
		bubbleSort(arr);
		System.out.println("Sorted Array :"+Arrays.toString(arr));
	}	
		
	public static void bubbleSort(String []args){
		int n = arr.length;
			for(int i = 0;i< n-1;i++){
				for(int j = 0;j< n-i-1;i++){
					if(arr[j].compareTo(arr[j+1])>0){
						String temp  = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
			}
		
		}	
	}
}