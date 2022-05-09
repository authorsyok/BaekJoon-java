package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > max) {
				max = value;
				index = i + 1;
			}
		}
		sb.append(max).append("\n");
		sb.append(index);
		
		System.out.println(sb);
	}
}
