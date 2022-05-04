package ¹Ýº¹¹®;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		int num = n;
		
		while(true) {
			n = ((n % 10) * 10) + ((n / 10 + n % 10) % 10);
			count++;
			
			if(num == n) {
				break;
			}
		}
		System.out.println(count);
	}
}
