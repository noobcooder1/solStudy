import java.util.ArrayList;

class hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        rpg3 mistery = new rpg3("???", 9999999999999d, 9999999999999d, 99999999999999d); // 정수리터럴 d, l, .0을 붙이면됨.
        rpg3 goblin = new rpg3("고블린", 10, 100, 50);
        rpg3 elf = new rpg3("엘프", 20, 200, 150);

        ArrayList<rpg3> cha = new ArrayList<rpg3>(); // 업캐스팅은 가능하지만 다운캐스팅은 불가능!

        cha.add(mistery);
        cha.add(elf);
        cha.add(goblin);

        for (rpg3 r : cha) {
            System.out.println(r);
        }

        mistery.show();
        goblin.show();
        elf.show();

        mistery.attack();
        goblin.attack();
        elf.attack();
        mistery.skill();
    }
}

class rpg {
    String name;
    double power;

    public rpg(String name, double power) {
        this.name = name;
        this.power = power;
    }

    public void show() {
        System.out.println("이름: " + this.name + " 힘: " + this.power);
    }
}

class rpg2 extends rpg {
    double hp;

    public rpg2(String name, double power, double hp) { // 부모의 생성자를 슈퍼키워드로 가져옴.
        super(name, power);
        this.hp = hp;
    }

    @Override // 오버라이딩했다는 표시다. 오버라이딩은 부모의 메서드를 자식에서 재정의하는것을 의미한다.
    public void show() {
        System.out.println("이름: " + this.name + " 힘: " + this.power + " 체력 : " + this.hp);
    }

    public void attack() {
        System.out.println(this.name + "의 공격으로 " + this.power + "만큼 피해를 가했습니다!");
    }
}

class rpg3 extends rpg2 {
    double mp;

    public rpg3(String name, double power, double hp, double mp) { // 부모의 생성자를 슈퍼키워드로 가져옴.
        super(name, power, hp);
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "이름: " + this.name +
                " 힘: " + this.power +
                " 체력 : " + this.hp +
                " 마나 : " + this.mp;
    }

    @Override
    public void show() {
        System.out.println("이름: " + this.name + " 힘: " + this.power + " 체력 : " + this.hp + " 마나 : " + this.mp);
    }

    public void skill() {
        System.out.println(this.name + "이 마나를 " + this.mp + "만큼 소모하여 스킬발동! " + this.power * 3 + "의 강력한 피해를 가했습니다!");
    }
}