import java.util.ArrayList;

public class memory {
    public static void main(String[] args) {
        ArrayList<Exmemory> me = new ArrayList<Exmemory>();
        int a = 10; // 스택영역에 저장된다.
        Exmemory m = new Exmemory("kitty", 1); // 변수(명함)은 스택영역에 실체는 힙영역에 저장됨!
        me.add(m);
        m.strin();
        m.prin(a);
        System.out.println(me);
    }
}

class Exmemory {
    String name;
    int age;

    Exmemory(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void strin() {
        System.out.printf("%d, %s \n", age, name);
    }

    void prin(int in) {
        System.out.println(in);
    }
}