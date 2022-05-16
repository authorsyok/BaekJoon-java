package ����;

import java.io.*;
import java.util.*;

class _2751_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    ArrayList<Integer> list = new ArrayList<>();

    for(int i = 0; i < n; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }

    Collections.sort(list);

    for(int val : list) {
      sb.append(val).append('\n');
    }

    System.out.println(sb);
    
    
  }
}