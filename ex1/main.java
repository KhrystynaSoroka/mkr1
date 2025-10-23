import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть основу паралелограма: ");
        double a = scan.nextDouble();
        System.out.print("Введіть висоту паралелограма: ");
        double h = scan.nextDouble();
        Shape parallelogram = new Parallelogram(a, h);
        System.out.println("Площа паралелограма = " + parallelogram.getArea());
        System.out.print("Введіть першу основу трапеції: ");
        double a1 = scan.nextDouble();
        System.out.print("Введіть другу основу трапеції: ");
        double b1 = scan.nextDouble();
        System.out.print("Введіть висоту трапеції: ");
        double h1 = scan.nextDouble();
        Shape trapezium = new Trapezium(a1, b1, h1);
        System.out.println("Площа трапеції = " + trapezium.getArea());

    }
}
