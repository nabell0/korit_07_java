package ch16_objects;

public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;

    // 기본 생성자 / AllArgsConstructor를 정의하시오.

    // getter / setter를 정의하시오.

    // showInfo()를 call1() 형식으로 정의.
    /*
        실행 예
        이름  : 안근수
        주소 : 부산광역시 연제구

        Main으로 가서 objectTes1에
        이름 안근수 주소 부산광역시 연제구를 set하고
        showInfo()를 호출.
     */

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showInfo(){
        System.out.println("이름 : "+ getName()+"\n주소 : " + getAddress());
    }

    @Override
    public String toString() {
        return "이름 : "+ name + "\n주소 : "+ address;
    }
}
