package JavaArray2;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array::");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr1[] = new int[n];
		System.out.println("enter the array::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				arr1[idx] = arr[i];
				idx++;
			}

		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr[i] < 0) {
				arr1[idx] = arr[i];
				idx++;
			}
		}
		System.out.println("The result:::::");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
