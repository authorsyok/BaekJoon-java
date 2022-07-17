package �׸���˰���;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		int[] arr = new int[n];
	
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		max++;	//upperbound ���� +1 ����
		
		long min = 0;
		long mid = 0;
		
		while(min < max) {
			mid = (min + max) / 2;
			
			long count = 0;
			
			for(int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			
			if(count < n) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
		
	}
}




