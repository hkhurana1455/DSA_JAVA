import java.util.*;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort by start time

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If merged list is empty OR no overlap, add the interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else { // Merge intervals by updating the end time
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals))); 
    }
}

