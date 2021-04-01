package 용현.basic.day13.lab;

import java.util.Scanner;

public class EmployeeV1Main {
    // 사원정보를 입력받아 동적배열에 저장하고
    // 조회및 수정/삭제하는 프로그램 작성

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService empsrv = EmployeeServiceImpl.getInstance();

        String menu = "";

        while (true) {
            empsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1":
                    empsrv.newEmployee();
                    break;
                case "2":
                    empsrv.showEmployee();
                    break;
                case "3":
                    empsrv.showOneEmployee();
                    break;
                case "4":
                    empsrv.modifyEmployee();
                    break;
                case "5":
                    empsrv.removeEmployee();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다 ");
            } // 스위치
        } // 와일
//        empsrv.makeExtInfo(null);

    } // 메인
}

























//import java.util.Scanner;
//
//public class EmployeeV1main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        EmployeeService emsrv = EmployeeServiceImpl.getInstance();
//
//        String menu = "";
//        while (true) {
//            emsrv.displayMenu();
//            menu = sc.next();
//
//            switch (menu) {
//                case "1": emsrv.newEmployee();     break;
//                case "2": emsrv.showEmployee();    break;
//                case "3": emsrv.showOneEmployee(); break;
//                case "4": emsrv.plusEmployee();    break;
//                case "0": System.exit(0);   break;
//                default:  System.out.println(" 잘못 입력하셨습니다!! ");
//            }
//        }
//    }
//}