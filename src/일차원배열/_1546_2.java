package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = -1;
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			int val = Integer.parseInt(st.nextToken());
			
			if(val > max)
				max = val;
			
			sum += val;
		}
		System.out.println(((sum / max) * 100) / n);
	}
}
