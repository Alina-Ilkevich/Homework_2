import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }

    }
}
