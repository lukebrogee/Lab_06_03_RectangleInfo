import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        double width = 0;
        double length = 0;
        double diagonal = 0;
        double area = 0;
        double perimeter = 0;


        System.out.println("What are the rectangles Length and Width");
        System.out.print("Width: ");
        width = in.nextDouble();
        System.out.println("");
        System.out.print("Length: ");
        length = in.nextDouble();
        System.out.println();

        area = length * width;
        perimeter = length * 2 + width * 2;
        diagonal = Math.sqrt(Math.exp(length) + Math.exp(width));

        System.out.printf("Area of Rectangle: %.2f%n", area);
        System.out.println("");
        System.out.printf("Perimeter of Rectangle: %.2f%n", perimeter);
        System.out.println("");
        System.out.printf("Diagonal of Rectangle: %.2f%n", diagonal);



    }
}
