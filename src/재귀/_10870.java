package Àç±Í;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10870 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = fibo(n);
		
		System.out.println(sum);
	}
	
	public static int fibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibo(n - 2) + fibo(n - 1);
	}
}
