package 용현.basic.day09;

public class Overriding {
    public static void main(String[] args) {
        // 메서드 재정의 override
        // 객체지향 3대 개념 중 다형성에 해당
        // 상속관계에 있는 상위클래스의 메서드를 하위클래스에서 같은이름의 메서드를 다시 작성하는 것을 의미
        // 즉, 상속받은 메서드를 재정의해서 사용하는것을 의미

        Cat c = new Cat();
        System.out.println( "고양이는: " + c.cry());

        Dog d = new Dog();
        System.out.println( "강아지는: " + d.cry());

    }
}

class Animal{
    public String eat() { return "동물이 먹습니다"; }
    public String cry() { return "동물이 웁니다"; }
}

class Cat extends Animal {
    @Override                         //컨트롤 스페이스로 불러옴
    public String cry() {
        return "야옹~ 야옹~";
    }
}

class Dog extends Animal{
    public String cry(){
        return "멍! 멍!";
    }
}