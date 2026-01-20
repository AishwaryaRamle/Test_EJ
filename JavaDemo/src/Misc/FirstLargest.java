package Misc;

import java.util.Scanner;

public class FirstLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*    int largest = arr[0];       //first element in array arr[0]

      for (int i = 1; i < n; i++) {      
            if (arr[i] > largest) {      //second element in array i.e. arr[i]=1
                largest = arr[i];
            }
        } */
        
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest element in the array is: " + largest);
    }
}