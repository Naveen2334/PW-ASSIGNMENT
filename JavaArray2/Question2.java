package JavaArray2;

import java.util.Iterator;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.println("Enter the value in array1");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("enter the size of 2nd array");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = sc.nextInt();
		}
		boolean check = false;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
				check = true;	
				break;
				}
			}
			if(!check)
			{
				System.out.println(arr2[i]);
			}
		}
	}

}
