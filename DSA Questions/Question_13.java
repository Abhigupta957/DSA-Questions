import java.util.Arrays;

public class Question_13 {
    public static void main(String[] args) {
        int[][] intervals = {
            {1,3},{2,6},{8,10},{15,18}
        };
        // sort intervals  on starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                //  interval overlap
                end = Math.max(end, intervals[i][1]);
            } 
            else {
                //  for merged interval
                System.out.println("[" + start + "," + end + "]");
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        System.out.println("[" + start + "," + end + "]");
    }
}
