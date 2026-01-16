import java.util.ArrayList;
import java.util.Collections;

public class prac {
    // main 메서드 - 프로그램 실행 시작점!
    public static void main(String[] args) {
        ArrayList<String> Cats = new ArrayList<>();
        Cat navi = new Cat("navi", 10);
        Cat nana = new Cat(); // 기본 생성자 호출 -> "생명의 탄생!" 출력
        Collections.addAll(Cats, "navi", "nana");

        // 객체 정보 출력
        navi.show();
        nana.show();
    }
}

class Cat {
    String name;
    int age;

    // 매개변수가 있는 생성자
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 기본 생성자 (매개변수 없음)
    public Cat() {
        this.name = "이름 없음";
        this.age = 0;
        System.out.println("생명의 탄생!");
    }

    // 정보 출력 메서드
    public void show() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

// 인덱스가 필요할때는 일반 포문을 사용한다. 그리고 배열이나 리스트형식을 포이치문으로 사용할때는 타입을 맞춰야함!
class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("고양이");
        animals.add("개");
        animals.add("토끼");

        for (int i = 0; i < animals.size(); i = i + 1) {
            System.out.println(animals.get(i));
        }

        // 향상된 for문(for-each라고도 함)
        for (String x : animals) {
            System.out.println(x);
        }

        int a[] = { 1, 2, 3 };
        for (int n : a) {
            System.out.println(n);
        }

        Cat cat1 = new Cat("키티", 5);
        Cat cat2 = new Cat("괭이", 4);
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        for (Cat x : cats) {
            System.out.println("고양이이름:" + x.name);
            System.out.println("고양이나이:" + x.age);
        }
    }
}