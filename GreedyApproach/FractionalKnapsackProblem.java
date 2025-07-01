package Greedy;
import java.util.*;
public class FractionalKnapsackProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int[][] items = new int[n][2];     
        for (int i = 0; i < n; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }
        Arrays.sort(items, (a, b) -> Double.compare((double)b[0]/b[1], (double)a[0]/a[1]));
        double value = 0.0;
        for (int[] item : items) {
            if (capacity >= item[1]) {
                capacity -= item[1];
                value += item[0];
            } else {
                value += item[0] * ((double) capacity / item[1]);
                break;
            }
        }
        System.out.printf("Maximum value: %.2f\n", value);
    }
}