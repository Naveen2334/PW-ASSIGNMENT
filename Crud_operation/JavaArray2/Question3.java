package JavaArray2;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		System.out.println("enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("enter the kth value:");
		 int k = sc.nextInt();
		 System.out.println("the value at kth index ::"+arr[k-1]);
	}

}
