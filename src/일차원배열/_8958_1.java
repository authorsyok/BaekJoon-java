package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int count = 0;
			
			for(int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j) == 'O')
					count++;
				else
					count = 0;
				sum += count;
			}
			
			sb.append(sum).append('\n');	
		}
		
		System.out.println(sb);
	}

}
