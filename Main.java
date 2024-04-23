public class Main {
    public static void main(String[] args) {
        SparseMatrix sparseMatrix = new SparseMatrix();
        System.out.println(sparseMatrix);
        sparseMatrix.setValue(0, 0, 2);
        sparseMatrix.setValue(1, 1, 3);
        sparseMatrix.setValue(2, 2, 4);
        sparseMatrix.setValue(0, 1, 6);
        System.out.println(sparseMatrix);
    }
}
