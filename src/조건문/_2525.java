package Á¶°Ç¹®;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2525 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = h * 60 + m + n;
		h = sum / 60;
		m = sum % 60;
		
		if(h >= 24)
			h -= 24;
		
		System.out.println(h + " " + m);
	}
}
