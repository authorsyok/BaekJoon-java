package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			boolean[] check = new boolean[26];
			boolean temp = true;
			
			for(int j = 0; j < str.length(); j++) {
				int index = str.charAt(j) - 'a';
				
				if(check[index]) {	// 이전에 사용한 문자라면
					if(str.charAt(j) != str.charAt(j - 1)) {
						temp = false;	// 같아야 하는데 달라서 false
						break;
					}
				}
				else {	//만약 이전에 사용한 문자와 같다면 true
					check[index] = true;
				}
			}
			if(temp) count++; // temp가 true일 때 count++ 해줌
		}
		System.out.println(count);
	}
}
