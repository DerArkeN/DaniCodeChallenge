import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("ready");

        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();

        switch(input1) {
            case "exit":
                return;
            default:
                String input2 = scanner.nextLine();

                int number1 = Integer.parseInt(input1);
                int number2 = Integer.parseInt(input2);
                System.out.println(pow(number1, number2));
                run();
        }
    }

    public static long pow(int x, int y) {
        int result = 1;
        while (y > 0) {
            if ((y & 1) == 0) {
                x *= x;
                y >>>= 1;
            } else {
                result *= x;
                y--;
            }
        }
        return result;
    }
}
