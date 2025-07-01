package Greedy;
import java.util.*;
public class MinimumNumberOfCoins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amount = sc.nextInt();
		int [] coins = new int[n];
		for(int i=0; i<n; i++) {
			coins[i] = sc.nextInt();
		}
		Arrays.sort(coins);
		int count = 0;
		for(int i=coins.length-1; i>=0; i--) {
			while(amount>=coins[i]) {
				amount -= coins[i];
				count++;
			}
		}
		System.out.println(count);
	}
}