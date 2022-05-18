package 기본수학2;

import java.io.*;
import java.util.*;

public class _1978_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			boolean isPrime = true;
			
			int k = Integer.parseInt(st.nextToken());
			
			if(k == 1)
				continue;
			
			for(int i = 2; i <= Math.sqrt(k); i++) {
				if(k % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
				count++;
		}

		System.out.println(count);
	}
}
