package studio3;

import java.util.Scanner;

public class Eratosthenes {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Yo what is the max number in the range?");
	int n = in.nextInt();
	boolean p[]= new boolean[n+1];
	
	
	for(int i = 0; i<=n; i++) {
		p[i] = true;
	}
	for (int i = 2; i < n; i++) {
		for (int j = i^2; j < n; j+=i) {
			 p[j] = false;
		}
	}
	for(int i = 2;i<n;i++) {
		if (p[i] == true) {
			System.out.println(i);
		}
	}

	}
	
}


