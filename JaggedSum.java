import java.util.*;

class JaggedSum{
	public static void main(String[] args){
	int arr[][] = {
		{4,10,6},{66,9,12,10},{12,54,87,96}
	}; 
	
	int i,j,sum = 0;
		for(i=0;i<=arr.length-1;i++){
			for(j=0;j<=arr[i].length-1;j++){
				sum = sum + arr[i][j];
			}
		}
		System.out.print("Sum of Jagged Array : "+ sum);
	 }
}
