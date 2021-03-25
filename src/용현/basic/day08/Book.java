package 용현.basic.day08;

public class Book {
    public static void main(String[] args) {
        B sj = new B();

        sj.setBookname("누구나 알기쉬운 자바: 입문편");
        sj.setWriter("카와바 타게시");
        sj.setTranslator("하진일, 혜지원");
        sj.setDate("2014년 6월");
        sj.setPrice(25000);
        sj.setPercent(10);
        sj.setCash(10);

        System.out.println(sj.getBookname());
        System.out.println(sj.getWriter());
        System.out.println();
        System.out.println();





    }
}


class B {
    private String bookname;
    private String writer;
    private String translator;
    private String date;
    private int price;
    private double percent;
    private double cash;

    public B() {
    }

    public B(String bookname, String writer, String translator, String date, int price, double percent, double cash) {
        this.bookname = bookname;
        this.writer = writer;
        this.translator = translator;
        this.date = date;
        this.price = price;
        this.percent = percent;
        this.cash = cash;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}





