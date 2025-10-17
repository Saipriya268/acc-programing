public class Peakelement {
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&(mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid];
            }
            if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = findPeak(arr);
        System.out.println("Peak element: " + peak);
    }
}
