import java.util.Arrays;

class Solution {
    public double find_median(int[] v) {
        int n = v.length;
        int first = 0, last = n - 1;

        Arrays.sort(v);
        int mid = (first + last) / 2;

        if (n % 2 == 0) {
            return (v[mid] + v[mid + 1]) / 2.0; // Use double for the median
        } else {
            return v[mid];
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input_values = {1, 3, 5, 7, 9,11};
        double median = solution.find_median(input_values);
        System.out.println("Median of " + Arrays.toString(input_values) + " is " + median);
    }
}
