import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("nhap width");
        double w1 = sc.nextDouble();
        System.out.println("nhap length:");
        double l1 = sc.nextDouble();
        r1.setLength(l1);
        r1.setWidth(w1);

        System.out.println(r1.toString());

        System.out.println("nhap ti le can tang:");
        double p1 = sc.nextDouble();
        r1.resize(p1);
        System.out.println(r1.toString());

        System.out.println("tang random");
        r1.resize();
        System.out.println(r1.toString());
    }
}
