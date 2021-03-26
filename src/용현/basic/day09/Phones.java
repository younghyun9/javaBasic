package 용현.basic.day09;  //핸드폰 코드작성 선생님 답안



public class Phones {
    public static void main(String[] args) {
        NomalPhone n = new NomalPhone();
        n.sendCALL();

        MP3Phone m = new MP3Phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.takePic();
    }
}

interface  PhoneInterface{
    void sendCALL();
    void receiveCall();
}

interface MP3Interface{
    void playMusic();
    void playMovie();
}

interface SmartPhoneInterface{
    void takePic();
    void surfInternet();
    void playGame();
}

class NomalPhone implements  PhoneInterface{

    @Override
    public void sendCALL() {
        System.out.println(" 전화 거는중... ");
    }

    @Override
    public void receiveCall() {
        System.out.println(" 전화 받는중... ");

    }
}

class MP3Phone implements PhoneInterface, MP3Interface{

    @Override
    public void sendCALL() { }

    @Override
    public void receiveCall() { }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다. ");
    }

    @Override
    public void playMovie() {
        System.out.println("동영상을 재생합니다. ");
    }
}
// 상속 : 부모 클래스가 가진 특성과 기능을 변화없이 받음   (extends)
// 구현 : 부모클래스가 정해준 틀에 맞춰 새롭게 작성        (implements)
// 따라서, 아래처럼 짜는것은 다소 세련되지 못함

class MP3PHONE2 extends NomalPhone implements  MP3Interface {

    @Override
    public void playMusic() {

    }

    @Override
    public void playMovie() {

    }
}

class SmartPhone implements PhoneInterface, SmartPhoneInterface{

    @Override
    public void sendCALL() { }

    @Override
    public void receiveCall() { }

    @Override
    public void takePic() {
        System.out.println("사진을 찍습니다.");

    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷을 합니다. ");
    }

    @Override
    public void playGame() {
        System.out.println("게임을 합니다. ");
    }
}

// 인터페이스는  틀만가져옴!