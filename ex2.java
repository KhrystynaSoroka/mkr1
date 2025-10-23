import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть кількість рядків: ");
        int rows = scan.nextInt();

        System.out.print("Введіть кількість стовпців: ");
        int cols = scan.nextInt();

        int[][] array = new int[rows][cols];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Елемент [" + i + "][" + j + "] = ");
                array[i][j] = scan.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j]>0) {
                    sum+=array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Сума: "+sum);
    }
}
