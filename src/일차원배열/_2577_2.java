package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
	
		int sum = a * b * c;
		
		while(sum > 0) {
			arr[sum % 10]++;
			sum /= 10;
		}
		
		for(int i = 0; i < 10; i++) 
			System.out.println(arr[i]);
	}
}
