import java.util.*;

public class homework2 {
    public static void main(String[] args) {
        var month = new HashMap<>();
        month.put(1, "January");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8,"August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");

        for (int i=0; i<=1000; i++) {
            System.out.printf("請輸入1~12? ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number>=1 && number<=12) {
                System.out.printf("第%d個月的英文單字為 ", number);
                System.out.println(month.get(number));
                break;
            }else {
                System.out.println("範圍錯誤!");
            }    
        }
    }
}
