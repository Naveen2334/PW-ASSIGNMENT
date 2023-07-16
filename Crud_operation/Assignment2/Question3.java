package Assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int m1 = scn.nextInt();
	int m2 = scn.nextInt();
	int m3 = scn.nextInt();
	int total_marks = m1 + m2 + m3;
	int percentage = (total_marks / 3);
	System.out.println(total_marks);
	System.out.println(percentage + "%");
	}
	}
