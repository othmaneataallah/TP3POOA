interface SquareMatrix {
    int size();

    double getValue(int i, int j);

    void setValue(int i, int j, double v);

    void add(SquareMatrix m);
}