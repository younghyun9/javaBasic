package 용현.basic.day10;

public class StarCraft2 {
    public static void main(String[] args) {
        // 1) SCV s = new SCV();
        // 2) SCV s = new SCV("SCV", 60, 5, 2.81, 50, 0);   // 2번째방법
                                                // SCV 유닛을 만들때마다 초기값을 지정하는것은 다소 번거로움
                                                // 즉, 동일한 속성을 가진 유닛을 만들때마다 매개변수를 통해 객체를
                                                // 만드는것은 비효율적임
                                                // 이런경우, 생성자내에서 초기값을 지정하는 것이 나음
        SCV s = new SCV();
        System.out.println( "SCV의 체력: " +s.hp);
        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();
        System.out.println("marine의 공격력: "+ m.power);
        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();
        System.out.println( "firebat의 체력: " +f.hp);
        f.attack();
        f.move();
        f.specialAbility();

    }
}


abstract class Unit {                   //클래스앞에 추상화 메서드 정의
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;
    protected int mineral;
    protected int gas;

    public Unit() {
    }

//    public Unit(String name, int hp, int power, double mvspd, int mineral, int gas) {
//        this.name = name;
//        this.hp = hp;
//        this.power = power;
//        this.mvspd = mvspd;
//        this.mineral = mineral;
//        this.gas = gas;
//    }

    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();   // 대충 윤곽만 잡아두고 (추상화) 자식클래스에서 구체화 {} 대신 ; 넣어서 추상화
          // public 생략가능!
}

//class SCV extends  Unit implements UnitAction{}

//class SCV extends  Unit implements UnitAction{}

//class SCV extends  Unit implements UnitAction{}        // 이부분 복습!

// 추상클래스에서 정의했던 추상메서드를
// 독립적인 코드로 분리함


interface  UnitAction{
    abstract public void attack();
    void move();                      // abstract public 생략가능
    void specialAbility();
}

class SCV extends Unit{          // 처음에 빨간줄 그어진이유 >> 밑에 능력들을 추상화 하라고!

    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 줍니다. \n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtspabty = "대상을 수리하는 중입니다. \n";

    public SCV(){
        name = "건설로봇";
        hp = 60;
        power = 5;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;

    }


    @Override           // 매서드 정의
    public void attack() {
        //System.out.println("융합절단기를 이용해서 대상에 " + power + " 의 피해를 주고있습니다. ");
        System.out.printf("융합절단기을 이용해서 대상에 %d의 피해를 주고있습니다",power);
        System.out.println("");
        // sout("융합절단기를 이용해서...")
        // 추상메서드를 이용해서 부모클래스에 정의된 attack 메서드를 유닛에 맞게 재정의함

    }

    @Override
    public void move() {
        System.out.println("지정한 위치로 2.81 속도로 이동중입니다. ");

    }

    @Override
    public void specialAbility() {
        System.out.println("대상을 수리중입니다. ");

    }
}

class Marine extends Unit{

    final String fmtattack = "가우스소총을 이용해서 대상에 %d의 피해를 줍니다. \n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%% 상승, 공격속도도 33%% 상승합니다. \n";  //"" 안에 % 가 잘 출력되려면 %%를 두개 써야함!

    public Marine() {
        name = "해병";
        hp = 40;
        power =30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;

    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);

    }
}

class Firebat extends Unit{

    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 줍니다. \n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%% 증가, 공격속도도 33%% 증가합니다. \n";

    public Firebat() {
        name = "화염 방사병";
        hp = 50;
        power = 8 * 2;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);

    }
}

// 선생님 자료 참조