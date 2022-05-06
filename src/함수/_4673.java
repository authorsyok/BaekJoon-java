package ÇÔ¼ö;

public class _4673 {
	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		boolean[] check = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
}
