package application;
import java.util.Scanner;
import entities.Rectangle;

public class Main {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            Rectangle rectangle = new Rectangle();

            System.out.println("Enter the width and height of the rectangle: ");
            rectangle.width = input.nextDouble();
            rectangle.height = input.nextDouble();

            System.out.println(rectangle);
        }

}