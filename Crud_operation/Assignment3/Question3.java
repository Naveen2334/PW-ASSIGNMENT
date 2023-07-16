package Assignment3;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the ");
		int x= sc.nextInt();
		int sum = 0;
		while(x>0)
		{
			
		sum += x%10;
		x/=10;
		}
		System.out.println("the sum :::"+sum);
	}

}
