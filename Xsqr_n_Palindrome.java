import java.io.*;
import java.util.*;

class TestClass {
  public static void main(String[] args) {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int t = Integer.parseInt(br.readLine());
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for (int i = 0;i < t;i++) {
      TreeMap<Character, Integer> tm = new TreeMap<>();
      String str = s.next();
      for (int j = 0;j < str.length();j++) {
        char c = str.charAt(j);
        if (tm.get(c) != null)
          tm.put(c, tm.get(c)+1);
        else
          tm.put(c, 1);
      }
      int count = 0;
      for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
        if (entry.getValue() % 2 == 1)
          count++;
      }
      if (count == 0)
        System.out.println(count);
      else
        System.out.println(count-1);
    }

  }

}
