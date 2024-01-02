import java.util.Scanner;
 class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите температуру на улице: ");
        int t = scan.nextInt();
        if (t > -5){
            System.out.println("Warm");
        }
        else if ((t <= -5) && (t > -20)) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }

    }
}
