package 용현.basic.day14;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // Set
        // 객체를 중복해서 저장할 수 없고  (이걸 이용해서 로또코드를 만들거나 할수있음)
        // 저장 순서가 유지되지 않음

        HashSet<String> names = new HashSet<>();
        //Set<String> names = new HashSet<>();
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add("혜교");  // 중복데이터라 한번밖에 출력되지않음

        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println("");

        HashSet<Integer> nums = new HashSet<>(Arrays.asList(10,9,8,7,6));
        //Set<Integer> nums = new HashSet<>(Arrays.asList(10,9,8,7,6));

        for(Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");

        // banana, peach, apple  등을 set으로 저장
        HashSet<String> fruits = new HashSet<>();
        //Set<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("apple");

        // set에서 중복을 걸러내는 과정
        // 객체를 저장하기 전에 먼저 객체의 해시코드를 알아냄
        // 저장되어 있는 객체들의 해시코드를 비교해서
        // 같은 해시코드가 존재한다면 동일객체로 판단 - 저장하지 않음
        // 객체의 해시코드를 알려면 .hashcode 메서드를 사용
        for(String fruit: fruits) {
            System.out.print(fruit.hashCode() + "  ");
            // 정렬이 되지 않은 채로 출력
        }
        System.out.println("");

        // set에 저장된 요소들을 정렬하기
        // Set을 List로 변환한 후 정령

        List<String> fList = new ArrayList<>(fruits); // fList의 타입은 object이기 떄문에 앞에 <String>을 이용해서 형변환을 해야한다.
        Collections.sort(fList);
        for(String f  : fList) {
            System.out.print(f + " / ");
        }
        System.out.println("");

        // HashSet의 개별요소 출력
        // set에는 get메서드가 지원되지 않음
        // 단, contains를 이용해서 검색을 통한 개별값 출력 가능
        System.out.println(names. contains("혜교"));

        // HashSet의 개별요소 삭제
        // remove, clear 지원




    }
}
