import java.util.HashSet;
public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int target = -10;
        if (hasSubarrayWithSum(arr, target)) {
            System.out.println("Subarray with given sum exists");
        } else {
            System.out.println("No such subarray exists");
        }
    }
    static boolean hasSubarrayWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum == target) {
                return true;
            }
            if (set.contains(prefixSum - target)) {
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}

