package 용현.basic.day15;

import 용현.basic.sungjuk.SungJukVO;

import javax.imageio.ImageTranscoder;
import java.io.*;
import java.util.Scanner;

public class SerializeSungJuk {
    //이름,국어,영어 수학을 키보드로 입력받아
    //sungjuk.bin에 저장하는 코드를 작성하세요
    //단, 입력받은 값들은 sungJukVO에 저장한후
    // 직렬화해서 저장함

    // 입력 데이터 : 혜교 97 98 95
    // 역질렬화 후 결과 : 혜교,97,98,95,290,96.7
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 성적 데이터 입력받기
        String name= "";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("성적은? ('이름 국어 영어 수학' 순서로)");


        // 입력받은 데이터를 SungJukVO에 저장
        SungJukVO sj = new SungJukVO(name,kor,eng,mat);

        // 직렬화
        String fpath = "c:/java/sungjuk.bin";

        FileOutputStream fos = new FileOutputStream(fpath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(sj);

        //oos.writeObject(name);
        //oos.writeInt(kor);
        //oos.writeInt(eng);
        //oos.writeInt(mat);
        // 이 4줄보다 맨첫번쨰줄 sj로 한번에!

        oos.close();
        bos.close();
        fos.close();

        // 역질렬화
        FileInputStream fis = new FileInputStream(fpath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        SungJukVO sjvo = (SungJukVO) ois.readObject();

        ois.close(); bis.close(); fis.close();

        int tot = sjvo.getKor() + sjvo.getEng() + sjvo.getMat();
        double avg = (double)tot / 3;

        String fmt = "%s,%d,%d,%d,%d,%.1f\n";
        System.out.printf(fmt , sjvo.getName(), sjvo.getKor(),
                sjvo.getEng(), sjvo.getMat(), tot, avg);



    }
}

