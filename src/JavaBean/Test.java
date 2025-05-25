package JavaBean;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("Alvin");
        u1.setAge(18);
        u1.setHeight(180);
        u1.setSex('男');
        System.out.println(u1.getName());
        System.out.println(u1.getAge());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSex());
    }
}
