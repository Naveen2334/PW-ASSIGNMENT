package Stack2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Question4 {
	public static ArrayList<Integer> minJump(int n,int a[]){
		Stack<Integer> s = new Stack<>();
		int minDis = Integer.MAX_VALUE, from = -1, to = -1;
		for(int i = n-1;i>=0;i--) {
			while(s.size()>0 && a[s.peek()] <= a[i]) {
				s.pop();
			}
			if(s.size() > 0 && minDis >= s.peek()-i) {
				from = i;
				to = s.peek();
				minDis = to - from;
				}
			s.push(i);
			
		}
		
		return new ArrayList<>(Arrays.asList(from,to));
		
	}


	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int a[] = new int[n];
	       for (int i = 0; i < n; i++) {
	           a[i] = sc.nextInt();
	       }
	       System.out.println(minJump(n, a));
	   }
	}
