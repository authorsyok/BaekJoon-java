package ¹®ÀÚ¿­;

import java.io.IOException;

public class _5622_2 {

	public static void main(String[] args) throws IOException {

		int value;
		int count = 0;
		
		while(true) {
			value = System.in.read();
			
			if(value == '\n')
				break;
			
			if(value < 68) count += 3;
			else if(value < 71) count += 4;
			else if(value < 74) count += 5;
			else if(value < 77) count += 6;
			else if(value < 80) count += 7;
			else if(value < 84) count += 8;
			else if(value < 87) count += 9;
			else if(value < 91) count += 10;
		}
		
		System.out.println(count);
	}
}
