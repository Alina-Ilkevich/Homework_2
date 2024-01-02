import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int a = scan.nextInt();
        if (a > 0) {
            int b = 0;
            int c = 0;
            while (b < a) {
                b++;
                c = c + b;
            }
            System.out.print("Сумма чисел равна " + c);}
        else {
                System.out.println("Вы ввели неподходящее число!");
            }
        }
    }
