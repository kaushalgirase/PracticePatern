package assinment;

import java.util.Arrays;
import java.util.Scanner;
public class FindElementUsingSort {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        Arrays.sort(arr);

	        System.out.println("Second Largest element is " + arr[n - 2]);
	        System.out.println("Second Smallest element is " + arr[1]);
	    }

}
