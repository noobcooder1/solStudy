package board;

public class func {
    public static void main(String[] args) {

    }

    // 문자열출력
    public static void sys(String a) {
        System.out.println(a);
    }

    // 글의 번호 출력
    public static void syi(int a) {
        System.out.println("\n" + a + "번째 글");
    }

    // 배열출력용함수
    public static void sya(String[] a) {
        // 배열을 예쁘게 출력하려면 Arrays.toString() 사용!
        // System.out.println(Arrays.toString(a));
        for (String s : a) {
            System.out.println(s);
        }
    }
}
