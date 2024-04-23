import java.util.LinkedList;

public class SparseMatrix implements SquareMatrix {

    private LinkedList<Node> list;

    public SparseMatrix() {
        this.list = new LinkedList<Node>();
    }

    public LinkedList<Node> getList() {
        return list;
    }

    @Override
    public void add(SquareMatrix m) {
        if (this.size() != m.size())
            return;
        if (m instanceof SparseMatrix) {
            SparseMatrix m2 = (SparseMatrix) m;
            for (int i = 0; i < size(); i++) {
                if (this.getList().get(i).getI() == m2.getList().get(i).getI()
                        && this.getList().get(i).getJ() == m2.getList().get(i).getJ()) {
                    this.setValue(this.getList().get(i).getI(), this.getList().get(i).getJ(),
                            this.getList().get(i).getValue() + m2.getList().get(i).getValue());
                }
            }
            return;
        }
        for (int i = 0; i < m.size(); i++) {
            for (int j = 0; j < m.size(); j++) {
                if (m.getValue(i, j) != 0) {
                    this.setValue(i, j, this.getValue(i, j) + m.getValue(i, j));
                }
            }
        }
    }

    @Override
    public double getValue(int i, int j) {
        for (Node node : list) {
            if (node.getI() == i && node.getJ() == j) {
                return node.getValue();
            }
        }
        return 0;
    }

    @Override
    public void setValue(int i, int j, double v) {
        for (Node node : list) {
            if (node.getI() == i && node.getJ() == j) {
                node.setValue(v);
                return;
            }
        }
        list.add(new Node(i, j, v));
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "SparseMatrix []";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SparseMatrix) {
            SparseMatrix m = (SparseMatrix) obj;
            if (m.size() != this.size()) {
                return false;
            }
            for (int i = 0; i < m.size(); i++) {
                for (int j = 0; j < m.size(); j++) {
                    if (m.getValue(i, j) != this.getValue(i, j)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

}
