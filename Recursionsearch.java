import java.util.Scanner;
public class Recursionsearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index " + result);
        sc.close();

    }
    static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; 
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, low, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, high, target);
        }
    }  
}

