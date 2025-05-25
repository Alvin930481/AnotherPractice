package SimpleGame;

public class RoleB extends Role {
    public int d;

    public RoleB(int a, int b, int d) {
        super(a, b);
        this.d = d;
    }

    @Override
    public int atteck() {
        return (super.atteck() + d) * getX();
    }

}
