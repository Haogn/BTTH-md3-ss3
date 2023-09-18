package ra.th2;

import java.util.Scanner;

public class th2 {
    public static void main(String[] args) {
        double money  ; // tiền gửi
        int month;  // tháng gửi
        double  interestRate ; // tỉ lệ lãi xuất
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập số tiền bạn muốn gửi");
        money = sc.nextDouble();
        System.out.println("Nhấp số tháng bạn muốn gửi tiền ");
        month = sc.nextInt();
        System.out.println("nhập lãi suất hàng năm theo tỷ lệ phần trăm");
        interestRate = sc.nextDouble();

        // tiền lãi
        double totalInterestRate = 0 ;
        for (int i = 0; i < month ; i++) {
            totalInterestRate += money * (interestRate/100)/12 * month;
        }
        System.out.println("Kết quả tiền gửi sau" + month + "tháng là " + totalInterestRate);
    }
}
