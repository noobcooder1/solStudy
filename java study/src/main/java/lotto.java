import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class lotto {
    public static void main(String[] args) {
        lottoselect lottoo = new lottoselect();
        lottoo.selectLotto();
        lottoo.choice();
        lottoo.rankcompare();
    }
}

class lottoselect {
    // 기본 로또변수
    Random rand = new Random();
    Scanner s1 = new Scanner(System.in);
    ArrayList<Integer> lottos = new ArrayList<>();
    ArrayList<Integer> i_lotto = new ArrayList<>();
    int i_lotto1, i_lotto2, i_lotto3, i_lotto4, i_lotto5, i_lotto6, i_bonuslotto;
    int lotto1, lotto2, lotto3, lotto4, lotto5, lotto6, bonuslotto;

    // 랜덤로또시작
    public void selectLotto() {
        lotto1 = rand.nextInt(45) + 1;
        lottos.add(lotto1);
        lotto2 = rand.nextInt(45) + 1;
        lottos.add(lotto2);
        lotto3 = rand.nextInt(45) + 1;
        lottos.add(lotto3);
        lotto4 = rand.nextInt(45) + 1;
        lottos.add(lotto4);
        lotto5 = rand.nextInt(45) + 1;
        lottos.add(lotto5);
        lotto6 = rand.nextInt(45) + 1;
        lottos.add(lotto6);
        bonuslotto = rand.nextInt(45) + 1;
    }

    // 로또의 번호를 사용자에게입력받음
    public void choice() {
        System.out.println("첫 번째 로또번호를 선택하세요.");
        i_lotto1 = s1.nextInt();
        i_lotto.add(i_lotto1);
        System.out.println("두 번째 로또번호를 선택하세요.");
        i_lotto2 = s1.nextInt();
        i_lotto.add(i_lotto2);
        System.out.println("세 번째 로또번호를 선택하세요.");
        i_lotto3 = s1.nextInt();
        i_lotto.add(i_lotto3);
        System.out.println("네 번째 로또번호를 선택하세요.");
        i_lotto4 = s1.nextInt();
        i_lotto.add(i_lotto4);
        System.out.println("다섯 번째 로또번호를 선택하세요.");
        i_lotto5 = s1.nextInt();
        i_lotto.add(i_lotto5);
        System.out.println("여섯 번째 로또번호를 선택하세요.");
        i_lotto6 = s1.nextInt();
        i_lotto.add(i_lotto6);
        System.out.println("보너스 로또번호를 선택하세요.");
        i_bonuslotto = s1.nextInt();
    }

    // 로또의 값을정하고 등수를 매김
    public void rankcompare() {
        // ★ 비교용 복사본 하나만 만들면 됨!
        ArrayList<Integer> matchedNumbers = new ArrayList<>(i_lotto); // 비교용 복사본
        matchedNumbers.retainAll(lottos); // 복사본만 변경됨, i_lotto는 그대로!

        System.out.println("내 선택번호 " + i_lotto + "\n당첨번호 " + lottos);
        System.out.println("일치하는 번호: " + matchedNumbers + " (" + matchedNumbers.size() + "개 일치)");
        if (matchedNumbers.size() < 3) {
            System.out.println("아쉽게도 순위에 들지 못했습니다.");
        } else if (matchedNumbers.size() == 3) {
            System.out.println("5등입니다. 상금은 50000원입니다.");
        } else if (matchedNumbers.size() == 4) {
            System.out.println("4등입니다. 상금은 500000원입니다.");
        } else if (matchedNumbers.size() == 5 && i_bonuslotto == bonuslotto) {
            System.out.println("2등입니다. 상금은 50000000원입니다.");
        } else if (matchedNumbers.size() == 5) {
            System.out.println("3등입니다. 상금은 15000000원입니다.");
        } else if (matchedNumbers.size() == 6) {
            System.out.println("1등입니다. 상금은 150000000원입니다.");
        }
    }
}
