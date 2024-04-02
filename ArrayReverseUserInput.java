package assinment;
import java.util.Scanner;
public class ArrayReverseUserInput {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Reverse the array using swapping
	        for (int i = 0; i < n / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[n - i - 1];
	            arr[n - i - 1] = temp;
	        }

	        System.out.println("Reversed array is:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i]);
	        }
	    }
	}


