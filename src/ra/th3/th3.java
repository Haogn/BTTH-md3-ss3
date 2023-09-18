package ra.th3;

import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {
        int a ;
        int b ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập số a ");
        a = sc.nextInt();
        System.out.println("Nhập số b ");
        b = sc.nextInt();
        a = Math.abs(a) ;
        b = Math.abs(b) ;
        if (a == 0 || b == 0 ) {
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b) {
             if (a > b) {
                 a = a - b ;
                 System.out.println("a = " + a);
             } else {
                 b = b -a ;
                 System.out.println("b = " + b );
             }
        }
        System.out.println("Ước chung lớn nhất " + a );
    }
}
