package SimpleGame;

public class SimpleGame {
    public static void main(String[] args) {
        RoleA r1 = new RoleA(1,2,3);
        RoleB r2 = new RoleB(1,2,4);
        RoleC r3 = new RoleC(1,2,5);
        System.out.println(r1.atteck());
        System.out.println(r2.atteck());
        System.out.println(r3.atteck());
        r1.doSomething();
        System.out.println(r1.atteck());
        System.out.println(r2.atteck());
        System.out.println(r3.atteck());
        r2.doOtherthing();
        System.out.println(r1.atteck());
        System.out.println(r2.atteck());
        System.out.println(r3.atteck());
    }
}
