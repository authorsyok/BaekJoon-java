package 기본수학2;

import java.io.*;
import java.util.*;

public class _1978_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			
			boolean isPrime = true;
			
			if(k == 1)
				continue;
			
			for(int j = 2; j <= Math.sqrt(k); j++) {
				if(k % j == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime) 
				count++;
		}
		System.out.println(count);
	}
}
