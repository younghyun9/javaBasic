package 용현.basic.day08;

public class Person {
    public static void main(String[] args) {
        P sj = new P();

        sj.setName("이름");
        sj.setGender("성별");
        sj.setAge(20);
        sj.setHeight(180);
        sj.setWeight(75);

        System.out.println(sj.getName());
        System.out.println(sj.getGender());
        System.out.println(sj.getAge());
        System.out.println(sj.getHeight());
        System.out.println(sj.getWeight());



    }
}
class P {
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    public P() {
    }

    public P(String name, String gender, int age, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
