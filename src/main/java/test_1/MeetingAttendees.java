package test_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MeetingAttendees {
    public static void main(String[] args) {
        Set<String> attendees = new HashSet<>();

        // TODO: "김철수", "이영희", "박지성", "김철수"를 attendees에 추가하시오.
        List<String> strList = new ArrayList<>();
        strList.add("김철수");
        strList.add("이영희");
        strList.add("박지성");
        strList.add("김철수");
        attendees.addAll(strList);
        // TODO: "박지성"이 명단에 있는지 확인하고, "박지성 참석 여부: [true/false]" 형식으로 출력하시오.
        boolean contains1 = attendees.contains("박지성");
        System.out.println("박지성 참석 여부 :" + contains1);
        // TODO: 최종 참석자 수를 "최종 참석자 수: [숫자]" 형식으로 출력하시오.
        System.out.println("최종 참석자 수 :" + attendees.size());
        System.out.println("전체 명단: " + attendees);
    }
}