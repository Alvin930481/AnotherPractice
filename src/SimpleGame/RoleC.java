package SimpleGame;

public class RoleC extends Role {
    public int e;

    public RoleC(int a, int b, int e) {
        super(a, b);
        this.e = e;
    }

    @Override
    public int atteck() {
        return (super.atteck() + e) * getX();
    }

}
