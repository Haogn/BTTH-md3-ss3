package ra.th1;

import java.util.Scanner;

public class th1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập vào 1 số nguyên bất kỳ");
        int number = sc.nextInt();
        boolean check = true ;
        if (number <= 1) {
            check = false ;
        } else {
            int i = 2 ;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0 ) {
                    check = false ;
                    break;
                }
                i++ ;
            }
        }
        if (check) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }

    }

}
