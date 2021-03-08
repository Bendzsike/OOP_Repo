package labor2_2;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Rectangle[] rectangles = new Rectangle[10];
        for(int i = 0; i < 10; ++i){
            double width = 1 + rand.nextInt(10) * rand.nextDouble();
            double length = 1 + rand.nextInt(10) * rand.nextDouble();
            rectangles[i] = new Rectangle(width, length);
        }

        double totalArea = 0;
        for(int i = 0; i < 10; ++i){
            System.out.printf("%d.\trectangle:\n", i + 1);
            System.out.printf("\tWidth: %.2f\n\tLength: %.2f\n\tPerimeter: %.2f\n\tArea: %.2f\n", rectangles[i].getWidth(), rectangles[i].getLength(), rectangles[i].perimeter(), rectangles[i].area());
            totalArea += rectangles[i].area();
        }
        System.out.println("Total area of the generated rectangles: " + totalArea);
    }
}
