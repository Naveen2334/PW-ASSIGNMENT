package Assignment3;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int x = sc.nextInt();
		System.out.println((((x+8)/3)%5)*5);
		
	}

}
