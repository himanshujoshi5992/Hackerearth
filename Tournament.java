import java.util.*;

class TestClass {
    public static void main(String[] args) {
        TreeMap<String,Integer> hm = new TreeMap<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str1 = "";
        String str2 = "";

        for (int i = 0;i < n;i++) {
            str1 = s.next();
            str2 = s.next();
            if (hm.get(str1) != null)
                hm.put(str1,hm.get(str1)+1);
            else
                hm.put(str1,1);

            if (hm.get(str2) != null)
                hm.put(str2,hm.get(str2)+1);
            else
                hm.put(str2,1);
        }
        int max = 0;
        int count = 0;
        String str = "";
        for (Map.Entry<String,Integer> entry : hm.entrySet()) {

            //System.out.println("Key: "+entry.getKey() + " Value: "+entry.getValue());
            if (entry.getValue() > max) {
                max = entry.getValue();
                count = 0;
            }
            if (entry.getValue() == max) {
                count++;
            }


        }
        System.out.println(count);
        for (Map.Entry<String,Integer> entry : hm.entrySet()) {

            //System.out.println("Key: "+entry.getKey() + " Value: "+entry.getValue());
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());

            }

        }

    }
}
