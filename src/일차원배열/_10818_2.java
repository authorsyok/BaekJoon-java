package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = - 1000001;
		int min = 1000001;
		
		// StringTokenizer에 token이 있으면 true, 없으면 false.
		while(st.hasMoreTokens()) {
			int numbers = Integer.parseInt(st.nextToken());
			if(numbers > max) 
				max = numbers;
			if(numbers < min)
				min = numbers;
		}
		
		System.out.println(min + " " + max);
	}
}
