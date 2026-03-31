import java.util.Arrays;
import java.util.Scanner;

class InnerMaXactivity implements Comparable<InnerMaXactivity>{

    int start,end;
    InnerMaXactivity(int start,int end){
        this.end = end;
        this.start =  start;


    }
    @Override
    public int compareTo(InnerMaXactivity o) {
        // TODO Auto-generated method stub
        return this.end-o.end;
    }


    
}
public class MaXactivity {


    static int maXactivity(InnerMaXactivity[] innerMaXactivities){
        Arrays.sort(innerMaXactivities);
        int count =1;
        int prevEnd =  innerMaXactivities[0].end;
        for(int i = 0;i<innerMaXactivities.length;i++){
            if(innerMaXactivities[i].start>=prevEnd){
                count++;
                prevEnd = innerMaXactivities[i].end;
            }
        }
        return count;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of activities: ");
        int n = scanner.nextInt();
 
        InnerMaXactivity[] activities = new InnerMaXactivity[n];
        System.out.println("\nEnter the start and end day of each activity:\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Activity " + (i + 1) + ": ");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            activities[i] = new InnerMaXactivity(start, end);
        }
 
        int maxCount = maXactivity(activities);
        System.out.println("\nThe maximum number of activities that can be performed is: " + maxCount);
 
        scanner.close();
    }


    
}