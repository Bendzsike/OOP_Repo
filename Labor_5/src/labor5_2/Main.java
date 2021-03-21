package labor5_2;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        m1.fillRandom(1, 10);
        System.out.println("First Matrix:");
        m1.printMatrix();
        System.out.println();

        Matrix m2 = new Matrix(2, 3);
        m2.fillRandom(1, 10);
        System.out.println("Second Matrix:");
        m2.printMatrix();
        System.out.println();

        System.out.println("Sum of first and second matrix:");
        Matrix result1 = Matrix.add(m1, m2);
        result1.printMatrix();
        System.out.println();

        Matrix m3 = new Matrix(3, 3);
        m3.fillRandom(1, 10);
        System.out.println("Third Matrix:");
        m3.printMatrix();
        System.out.println();

        System.out.println("Multiplication of first and third matrix:");
        Matrix result2 = Matrix.multiply(m1, m3);
        result2.printMatrix();

        System.out.println("Transpose of the first matrix:");
        Matrix result3 = Matrix.transpose(m1);
        result3.printMatrix();

        System.out.println("Transpose of the second matrix:");
        Matrix result4 = Matrix.transpose(m2);
        result4.printMatrix();
    }
}
