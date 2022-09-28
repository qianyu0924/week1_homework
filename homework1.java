import java.util.*;
import java.security.SecureRandom;

public class homework1 {
    public static void main(String[] args) {
        var tset = new TreeSet<>();
        SecureRandom random = new SecureRandom();
        int i=1;
        while (tset.size()<10) {
            int number = 1+random.nextInt(100);
            if (tset.contains(number)) {
                continue;
            }else {
                System.out.printf("第%d個號碼: %d\n", i, number);
                tset.add(number);
                i++;
            }
        }
        System.out.printf("物件內元素個數為: %d\n", tset.size());
        System.out.printf("物件內元素的內容: %s\n", tset);
        System.out.printf("第一個元素內容為: %s\n", tset.first());
        System.out.printf("最後一個元素內容: %s\n", tset.last());
        System.out.printf("內容介於30~70者: %s\n", tset.subSet(30, 70));
    }        
}
