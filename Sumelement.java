import java.util.Scanner;

public class Sumelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = findSum(arr, 0);

        System.out.println("Sum of all elements: " + sum);
    }
    static int findSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + findSum(arr, index + 1);
    }
}
