package labor5_2;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        m1.fillRandom(1, 10);
        m1.printMatrix();
        System.out.println();

        Matrix m2 = new Matrix(2, 3);
        m2.fillRandom(1, 10);
        m2.printMatrix();
        System.out.println();

        Matrix m3 = Matrix.add(m1, m2);
        m3.printMatrix();
        System.out.println();

        Matrix m4 = new Matrix(3, 3);
        m1.fillRandom(1, 10);
        m2.printMatrix();
        System.out.println();

        Matrix m5 = Matrix.multiply(m1, m4);
        m5.printMatrix();
    }
}
