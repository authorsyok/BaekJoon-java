package 브루트포스;

import java.io.*;
import java.util.*;

public class _2798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int temp = 0;
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					
					if(sum <= m && temp < sum)
						temp = sum;
				}
			}
		}
		System.out.println(temp);
	}
}
