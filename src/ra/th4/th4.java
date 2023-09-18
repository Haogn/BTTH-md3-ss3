package ra.th4;

import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Chọn số để in ra màn hình hifnh tương ứng");
        int choice ;
        do {
            System.out.println("1. Hình tam giác ");
            System.out.println("2. Hình chữ nhật");
            System.out.println("3. Hình vuông");
            System.out.println("4. ❌❌❌ Thoát chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài của cạnh hình tam giác ");
                    int cd = sc.nextInt();
                    System.out.println("Kết quả sau khi chọn hình tam giác") ;
                    for ( int i = 0 ; i <= cd ; i++ ) {
                        for (int j = 0 ; j <= i ; j++) {
                            System.out.print("# ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều rộng của hình chữ nhật ");
                    int height = sc.nextInt();
                    System.out.println("Nhập chiều rộng của hình chữ nhật");
                    int width = sc.nextInt();

                    for (int i = 0; i < width ; i++) {
                        for (int j = 0; j < height ; j++) {
                            System.out.print("# ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhập độ dài của cạnh hình vuông");
                    int a = sc.nextInt();
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < a; j++) {
                            System.out.print("# ");
                        }
                        System.out.println();

                    }
                    break;
                case 4:
                    System.out.println("❌❌❌ Đã thoát khỏi chương trình");
                    break;
            }
        } while (choice != 4) ;
    }
}
