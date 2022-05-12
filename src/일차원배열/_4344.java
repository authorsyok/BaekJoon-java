package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			double sum = 0;
			
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			double average = (sum / n);
			double count = 0;	// 평균넘는 학생 수
			
			for(int j = 0; j < n; j++) {
				if(arr[j] > average) count++;
			}
			
			System.out.printf("%.3f%%\n", (count / n) * 100);
		}
	}
}
