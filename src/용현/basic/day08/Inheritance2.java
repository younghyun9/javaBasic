package 용현.basic.day08;

public class Inheritance2 {
    public static void main(String[] args) {

    }
}
class People2{
    public void speak() { };
    public void eat(){ };
    public void run(){ };
    public void sleep(){ };
}

class Student extends People2{
    public void study(){ };
}

class SutdentWoker extends People2{
    public void study(){ };
    public void work(){ };
}

class Researcher extends People2{
    public void research(){ };
}

class Professor extends People2{
    public void research(){ };
    public void teach(){ };

}
