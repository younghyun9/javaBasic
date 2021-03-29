package 용현.basic.day10;

import 용현.basic.sungjuk.SungJukService;
import 용현.basic.sungjuk.SungJukServiceImpl;
import 용현.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
        //SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSunJuk(sj);
    }
}
