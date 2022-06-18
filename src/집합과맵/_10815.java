package ÁýÇÕ°ú¸Ê;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10815 {

	static int[] arr;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			int result = binary(Integer.parseInt(st.nextToken()));
			if(result != -1) 
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}
	}
	
	private static int binary(int temp) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		
		while(left <= right) {
			mid = (left + right) / 2;
			if(arr[mid] < temp)
				left = mid + 1;
			else if(arr[mid] > temp)
				right = mid - 1;
			else
				return mid;
		}
		return -1;
	}

}
