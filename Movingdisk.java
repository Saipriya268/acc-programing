public class Movingdisk{
    public static void main(String[] args) {
        int n=3;
        moveDisks(n, 'A', 'C', 'B');
    }
    static void moveDisks(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        moveDisks(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveDisks(n - 1, auxiliary, destination, source);
    }
}

