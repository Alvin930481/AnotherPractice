package SimpleGame;

public class Role {
    public int a;
    public int b;
    private static int x = 1;

    public Role(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int atteck() {
        return a + b;
    }

    public void doSomething() {
        x = 2;
    }

    public void doOtherthing() {
        x = 1;
    }

    public int getX() {
        return x;
    }
}
