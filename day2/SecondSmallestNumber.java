package week1.day2;

public class SecondSmallestNumber {
	


	public static void main(String[] args) {
		  int arr[] = { 23,45,67,32,89,22 };
	        int n = arr.length;
	        int second_smallest = Integer.MAX_VALUE;
	        int smallest = 22;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < second_smallest
	                && arr[i] > smallest) {
	                second_smallest = arr[i];
	            }
	        }
	        System.out.println("second smallest element is: "
	                           + second_smallest);
	    }

	}


