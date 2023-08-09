package Stack2Assignment;

import java.util.*;


public class Question3 {
   
   public static ArrayList<Integer> nextSmallerElement(int n,ArrayList<Integer> a){
	ArrayList<Integer> ans = new ArrayList<Integer>();
	Stack<Integer> s = new Stack<Integer>();
	for(int i = 0;i<n;i++) {
		ans.add(-1);
		}
	for(int i = 0 ;i<n;i++) {
		while(!s.empty() && a.get(s.peek())>=a.get(i))
			s.pop();
		if(!s.empty()) {
			ans.set(i, s.peek());
		}
		s.push(i);
	}
	
	   return ans;
	   
   }


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       ArrayList<Integer> a = new ArrayList<Integer>();
       for (int i = 0; i < n; i++) {
           a.add(sc.nextInt());
       }
       ArrayList<Integer> ans = nextSmallerElement(n, a);
       System.out.println(ans);
   }
}
