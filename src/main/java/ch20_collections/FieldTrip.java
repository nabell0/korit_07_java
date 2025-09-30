package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Set<String> fieldTripSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까?");
        int number = scanner.nextInt();
         scanner.nextLine();  // 최종 작성 결과 얘는 fieldTripsList 의 맨마지막 element와 동일한 값을 가지게 됨.
        List<String> fieldTripsList = new ArrayList<>();
        for(int i = 0 ; i< number ; i++){
            System.out.print((i+1) +"번 학생의 수학 여행지를 입력하세요>>>");
            String place = scanner.nextLine();
            fieldTripsList.add(place);
        }
        System.out.println();
       for(int i = 0 ; i <fieldTripsList.size();i++ ){
           System.out.println((i+1)+"번 학생의 후보지 : " + fieldTripsList.get(i));
       }
       fieldTripSet.addAll(fieldTripsList);
        List<String> finalFieldTrips = new ArrayList<>();
        finalFieldTrips.addAll(fieldTripSet);
        Collections.sort(finalFieldTrips, Comparator.reverseOrder());
        System.out.println("수학 여행 후보지는");
        for(String elem : finalFieldTrips){
            System.out.println(elem);
        }
        System.out.println("입니다");



        /*
            1. 학생의 수를 입력 받아 해당 회수만큼 반복문을 돌릴 것.
            2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
            3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
            4. 맨 마지막 출력문은 Set-> List로 재이동하여 finalFieldTrips List에서 elment들을 추출하여 작성.
            실행 예
            몇 명의 학생이 수학 여행지를 입력하시겠습니까? 5명
            1 번 학생의 수학 여행지를 입력하세요 >>> 제주
            2 번 학생의 수학 여행지를 입력하세요 >>> 제주
            3 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            4 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            5 번 학생의 수학 여행지를 입력하세요 >>> 제주

            1 번 학생의 후보자 : 제주
            2 번 학생의 후보자 : 제주
            3 번 학생의 후보자 : 민속촌
            4 번 학생의 후보자 : 민속촌
            5 번 학생의 후보자 : 제주

            수학 여행 후보자는
            제주
            민속촌
            입니다.
         */

    }
}
