import java.util.Random;
import java.util.Scanner;

public class rpc {
    public static void main(String[] args) {
        // 게임변수
        String con = "y";
        Scanner s1 = new Scanner(System.in);
        Random rand = new Random();
        String[] botResult = { "가위", "바위", "보" };
        String[] userResult = { "가위", "바위", "보" };

        // 게임기본로직
        while (con.equals("y")) {
            System.out.println("가위는 0 바위는 1, 보는 2입니다. 내고싶은 숫자를 입력하세요.\n");
            int userChoice = s1.nextInt();
            int r1 = rand.nextInt(2);

            // 승리, 패배 확인
            if (userResult[userChoice].equals("가위")) {
                if (botResult[r1].equals("가위")) {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   비겼습니다.");
                } else if (botResult[r1].equals("바위")) {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   졌습니다.");
                } else {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   이겼습니다.");
                }
            } else if (userResult[userChoice].equals("바위")) {
                if (botResult[r1].equals("가위")) {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   이겼습니다.");
                } else if (botResult[r1].equals("바위")) {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   비겼습니다.");
                } else {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   졌습니다.");
                }
            } else if (userResult[userChoice].equals("보")) {
                if (botResult[r1].equals("가위")) {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   졌습니다.");
                } else if (botResult[r1].equals("바위")) {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   이겼습니다.");
                } else {
                    System.out.println("나: " + userResult[userChoice] + "  봇: " + botResult[r1] + "   비겼습니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            // 게임 계속실행여부 묻기
            while (true) {
                System.out.println("계속하려면 y를 그만하려면 n를 입력하세요.");
                s1.nextLine();
                con = s1.nextLine();
                if (con.equals("n")) {
                    System.out.println("다음에 또 찾아주세요!");
                    s1.close();
                    System.exit(0);
                } else if (con.equals("y")) {
                    System.out.println("계속합니다!\n\n");
                    break;
                } else {
                    System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
                }
            }
        }
    }
}