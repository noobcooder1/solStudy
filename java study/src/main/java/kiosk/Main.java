package kiosk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("================= 고양이카페       ===========");
        System.out.println("============================================");
        // ctrl + shift + o(영문자). 자동 임포트.
        Product p1 = new Product("아아", 1000);
        Product p2 = new Product("뜨아", 2000);
        Product p3 = new Product(5000, "마카롱");
        Product p4 = new Product(500, "쿠키");

        Scanner sc = new Scanner(System.in);
        String cmd;
        int sum = 0;
        int ia_cnt = 0;
        int da_cnt = 0;
        int ma_cnt = 0;
        int ck_cnt = 0;

        // 문에 별명짓는 방법 -> 별명 : 별명을 적용할 문장
        loop_a: while (true) {
            System.out.print("명령:[1.음료/2.디저트/e.종료]");
            cmd = sc.next();
            switch (cmd) {
                case "1":
                    System.out.println("==================================");
                    System.out.println("============= 음료 리스트    =======");
                    System.out.println("==================================");
                    p1.info();
                    p2.info();
                    loop_b: while (true) {
                        System.out.print("명령:[1.아아/2.뜨아/x.이전메뉴]");
                        cmd = sc.next();
                        switch (cmd) {
                            case "1":
                                System.out.println("아아가 1개 선택됐습니다.");
                                sum += 1000;
                                ia_cnt += 1;
                                break;
                            case "2":
                                System.out.println("뜨아가 1개 선택됐습니다.");
                                sum += 2000;
                                da_cnt += 1;
                                break;
                            case "x":
                                break loop_b;
                        }
                    }

                    break;
                case "2":
                    System.out.println("==================================");
                    System.out.println("============= 디저트 리스트    =======");
                    System.out.println("==================================");
                    p3.info();
                    p4.info();
                    loop_c: while (true) {
                        System.out.print("명령:[1.마카롱/2.쿠키/x.이전메뉴]");
                        cmd = sc.next();
                        switch (cmd) {
                            case "1":
                                System.out.println("마카롱이 1개 선택됐습니다.");
                                sum += 5000;
                                ma_cnt += 1;
                                break;
                            case "2":
                                System.out.println("쿠키가 1개 선택됐습니다.");
                                sum += 500;
                                ck_cnt += 1;
                                break;
                            case "x":
                                break loop_c;
                        }
                    }
                    break;
                case "e":
                    break loop_a;
            }
        }
        System.out.println(
                "고르신 품목은 아아 " + ia_cnt + " 개, 뜨아 " + da_cnt + "개, 마카롱 " + ma_cnt + "개, 쿠키 " + ck_cnt + "개 입니다.");
        System.out.println("합계는" + sum + " 원 입니다.");
        System.out.println("프로그램 종료");
        sc.close();
    }

}
