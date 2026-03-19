import java.util.*;

class Max_three{
    public static void main(String args[]) {
      
		int a [] = {10,56,19,56,3,41,65,98,56,32};
		int i,j,temp;
		
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Max1 : " + a[9]);
        System.out.println("Max2 : " + a[8]);
        System.out.println("Max3 : " + a[7]);
    }
}
