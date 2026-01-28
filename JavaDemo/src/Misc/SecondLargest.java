package Misc;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {10, 35, 50, 23, 50, 5}; // Example array

	        if (arr.length < 2) {
	            System.out.println("Array must have at least two elements.");
	            return;
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest; // update second largest
	                largest = num;           // update largest
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;     // update second largest only if it's not equal to largest
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found (all elements might be equal).");
	        } else {
	            System.out.println("Second largest element is: " + secondLargest);
	        }
	}

}
