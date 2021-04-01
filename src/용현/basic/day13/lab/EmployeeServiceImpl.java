package 용현.basic.day13.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{

    // 멤버 변수 선언
    List<EmployeeVO> empdata = new ArrayList<>();
    EmployeeVO emp = null;

    // 단일 상수 선언

    static final String[] JOBID = {"FI_MGR", "AC_MGR","SA_MAN", "IT_PROG", "ST_CLERK"};   // 일단 5개만  // JOBID 가대문자가 맞는지 선생님 학인!
    static int MINSAL = 2000;
    static int MAXSAL = 40000;
    static int MAXDEPT = 270;
    static int MAXMGRID = 206;


    // 싱글톤 블럭 시작

    private static EmployeeService empsrv = null;
    private EmployeeServiceImpl() {

    }



    public static EmployeeService getInstance() {
        if (empsrv == null) empsrv = new EmployeeServiceImpl();
        return empsrv;
    }
    // 싱글톤 블럭 끝   (여기가 맞는지 확인! 선생님 깃허브에서)

    // 화면에 프로그램 메뉴 출력
    @Override
    public void displayMenu() {
        String displaymenu =
                        "----------------------    \n" +
                        "    사원 관리 프로그램     \n" +
                        "----------------------     \n" +
                        "  1. 사원 정보 입력        \n" +
                        "  2. 사원 정보 조회        \n " +
                        " 3. 사원 정보 상세조회     \n " +
                        " 4. 사원 정보 수정         \n " +
                        " 5. 사원 정보 삭제         \n " +
                        " 0. 프로그램 종료          \n " +
                        "----------------------     \n" +
                        " 작업을 선택하세요 :" ;

        System.out.println(displaymenu);

    }

    // 새로운 사원정보를 입력받음
    @Override
    public void newEmployee() {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("사번은?");
            String empno = sc.next();
            System.out.print("이름은?");
            String fname = sc.next();
            System.out.print("성은?");
            String lname = sc.next();
            System.out.print("이메일은?");
            String email = sc.next();
            System.out.print("전화번호는?");
            String phone = sc.next();
            System.out.print("입사일은?");
            String hdate = sc.next();

            EmployeeVO emp = new EmployeeVO(empno,fname,lname,email,phone,hdate);
            // 사원 추가정보를 생성해서 사원정보로 저장
            empsrv.makeExtInfo(emp);

            empdata.add(emp);

        } catch (Exception ex){
            System.out.println("잘못입력하셨습니다! ");
        }

    }

    // 사원 기본정보(사번,이름,성,이메일,전화번호,입사일) 등을
    // 리스트형태로 출력함
    @Override
    public void showEmployee() {
        String fmt = " %s %s %s %s %s %s \n";
        for(EmployeeVO emp:empdata){
            System.out.printf(fmt, emp.getEmpno(), emp.getFname(), emp.getLname(), emp.getEmail()
            , emp.getPhone(), emp.getHdate());
        }

    }

    @Override
    public void showOneEmployee() {
        String fmt = " %s %s %s %s %s %s\n"  +
                     " %s %s %s %s %s \n ";
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원번호는?");
        String empno = sc.next();

        EmployeeVO emp = null;
        for(EmployeeVO e : empdata) {
            // 찾는 데이터가 동적배열에 존재한다면
            // emp 변수에 저장하고 반복문을 종료함
            if( e.getEmpno().equals(empno) ) {
                emp = e;
                break;

            }
        }

        System.out.printf(fmt, emp.getEmpno(), emp.getFname(),
                emp.getLname(), emp.getEmail(), emp.getPhone(),
                emp.getHdate(), emp.getJobid(), emp.getSal(),
                emp.getComm(), emp.getMgrid(), emp.getDeptid() );

    }

    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    @Override
    public void makeExtInfo(EmployeeVO emp) {
        Random rnd = new Random();
        int key = rnd.nextInt(JOBID.length);
        String jobid = JOBID[key];

        int sal = rnd.nextInt(MAXSAL) + MINSAL;
        int mgrid = rnd.nextInt(MAXMGRID) + 100;
        int deptid = (rnd.nextInt(MAXDEPT) % 100 ) * 10 ;

        DecimalFormat df = new DecimalFormat();  // (#.##) 로 표시되어있었는데 선생님 자료 확인
        double comm = Double.parseDouble(
                df.format( rnd.nextDouble() / 2));

        System.out.println(jobid);
        System.out.println(sal);
        System.out.println(mgrid);
        System.out.println(deptid);
        System.out.println(comm);

        emp.setJobid(jobid);
        emp.setSal(sal);
        emp.setComm(comm);
        emp.setMgrid(mgrid + "");
        emp.setDeptid(deptid + "");




    }

}
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class EmployeeServiceImpl implements EmployeeService {
//
//    List<EmployeeVO> emdata = new ArrayList<>();
//    EmployeeVO em = null;
//
//    private static EmployeeService emsrv = null;
//
//    private EmployeeServiceImpl() {
//
//    }
//
//    public static EmployeeService getInstance() {
//        if (emsrv == null) emsrv = new EmployeeServiceImpl();
//        return emsrv;
//    }
//            @Override
//            public void displayMenu() {
//                String displaymenu =
//                        "----------------------  \n" +
//                                "     EmployeeService     \n" +
//                                "----------------------  \n" +
//                                "  1. 직원 데이터 입력   \n" +
//                                "  2. 직원 데이터 조회   \n " +
//                                " 3. 직원 데이터 상세 조회\n " +
//                                " 4. 직원 데이터 추가 생성 \n " +
//                                " 0. 프로그램 종료       \n " +
//                                "----------------------  \n" +
//                                " 작업을 선택하세요 :";
//
//                System.out.println(displaymenu);
//            }
//
//    @Override
//    public void newEmployee() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("사원 번호는? ");
//        int empno = sc.nextInt();
//        System.out.print("성은?");
//        String fname = sc.next();
//        System.out.print("이름은? ");
//        String lname = sc.next();
//        System.out.print("이메일은? ");
//        String email = sc.next();
//        System.out.print("핸드폰 번호는? ");
//        String phone = sc.next();
//        System.out.print("입사일은? ");
//        String hdate = sc.next();
//        EmployeeVO em = new EmployeeVO(empno, fname, lname, email, phone, hdate);
//        emdata.add(em);
//
//    }
//
//    @Override
//    public void showEmployee() {
//        String fmt = "사번:%d, 성:%s, 이름:%s, 이메일:%s, 전화번호:%s, 입사일:%s \n";
//        int pos = 0 ;
//        for(EmployeeVO em : emdata){
//            System.out.printf(fmt, pos, em.getEmpno(), em.getFname(),em.getLname(),em.getEmail(),em.getPhone(),em.getHdate()); ++pos;
//        }
//
//    }
//
//    @Override
//    public void showOneEmployee() {
//
//    }
//
//    @Override
//    public void plusEmployee() {
//
//    }
//
//
//}  // class


