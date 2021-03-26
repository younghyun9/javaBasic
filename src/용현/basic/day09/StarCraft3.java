package 용현.basic.day09;

public class StarCraft3 {
    public static void main(String[] args) {

    }
}

interface Unit2Interface {
    void attack();
    void move();

}

interface SCVInterface{
    void repair();
}

interface MarrineInterface{
    void stim();
}

interface FirebatInterface{
    void stim();
}

interface  medicInterface{
    void heal();
}

class Unit2 implements Unit2Interface {



    @Override
    public void attack() {
        System.out.println(" 공격합니다. ");
    }

    @Override
    public void move() {
        System.out.println(" 이동합니다.");

    }
}

