package ���ڿ�;

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
				
				if(check[index]) {	// ������ ����� ���ڶ��
					if(str.charAt(j) != str.charAt(j - 1)) {
						temp = false;	// ���ƾ� �ϴµ� �޶� false
						break;
					}
				}
				else {	//���� ������ ����� ���ڿ� ���ٸ� true
					check[index] = true;
				}
			}
			if(temp) count++; // temp�� true�� �� count++ ����
		}
		System.out.println(count);
	}
}
