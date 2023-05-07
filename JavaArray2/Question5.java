package JavaArray2;

import java.util.Iterator;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		System.out.println("enter the value of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("enter the value of array1");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the value in array 2");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]= sc.nextInt();
		}
		boolean ans = true;
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]!=arr2[i])
			{
				ans=false;
				break;
			}
		}
		System.out.println(ans);
	}

}
