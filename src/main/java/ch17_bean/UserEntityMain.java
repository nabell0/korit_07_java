package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();

        user1.setUsername(1);
        user1.setEmail("a@test.com");
        user1.setPassword(9876);
        user1.setName("박현우");
        System.out.println(user1);

        System.out.println("Lombok을 통한 Getter 사용");
        System.out.println("username : "+user1.getUsername());
        System.out.println("email : "+ user1.getEmail());
        System.out.println("name : "+ user1.getName());
        System.out.println("비밀번호는 보안 상 제공하지 않습니다.");

        //UserEntitiyLombok
        UserEntitiyLombok user2 = new UserEntitiyLombok();
        // 정의하지 않은 setter 사용
        user2.setName("김이");
        user2.setEmail("b@test.com");
    }
}
