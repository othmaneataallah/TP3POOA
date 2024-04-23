public class Node {
    private int i, j;
    private double v;

    public Node(int i, int j, double v) {
        this.i = i;
        this.j = j;
        this.v = v;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public double getValue() {
        return v;
    }

    public void setValue(double v) {
        this.v = v;
    }

}