package Example1;
import java.util.Scanner;

public class Question3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3;
        System.out.print("Enter value of point A: x1 = ");
        x1 = scanner.nextInt();
        System.out.print("Enter value of point B: x2 = ");
        x2 = scanner.nextInt();
        System.out.print("Enter value of point C: x3 = ");
        x3 = scanner.nextInt();
        System.out.print("Enter value of point A: y1 = ");
        y1 = scanner.nextInt();
        System.out.print("Enter value of point B: y2 = ");
        y2 = scanner.nextInt();
        System.out.print("Enter value of point C: y3 = ");
        y3 = scanner.nextInt();
        if ((x1-x3)/(x2-x3)==(y1-y3)/(y2-y3)) {
            System.out.println("The points lie on the one plane");
        } else {
            System.out.println("The points don't lie on the one plane");
        }
    }
}
