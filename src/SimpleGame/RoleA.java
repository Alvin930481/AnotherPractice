package SimpleGame;

public class RoleA extends Role {

    public int c;

    public RoleA(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int atteck() {
        return (super.atteck() + c) * getX();
    }


}
