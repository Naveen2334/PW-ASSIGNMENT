package Stack2Assignment;

import java.util.Scanner;
import java.util.Stack;

public class Question1 {
	public static String largestNumber(int n,int a[],int k)
	{
		Stack<Integer> s = new Stack<>();
		for(int i =0;i<n;i++) {
			while(n-i>k&&s.size()>0&&s.peek()<a[i])
			{
				s.pop();
				k++;
			}
			s.push(a[i]);
			k--;
		}
		StringBuffer ans = new StringBuffer();
		for(int i=0;i<s.size();i++)
		{
			ans.append(Integer.toString(s.get(i)));
		}
		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the array");
		for(int i= 0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.println(largestNumber(n, a, n));
		}
	}

}
