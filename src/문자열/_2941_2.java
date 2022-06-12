package ¹®ÀÚ¿­;

import java.io.*;
import java.util.*;

public class _2941_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String input = br.readLine();
		
		for(int i = 0; i < str.length; i++) {
			if(input.contains(str[i]))
				input = input.replace(str[i], "?");
		}
		
		System.out.println(input.length());
	}
}
