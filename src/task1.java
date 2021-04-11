import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("ready");

        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch(input) {
            case "exit":
                return;
            default:
                int number = Integer.parseInt(input);
                System.out.println(isNarcissistic(number));
                run();
        }
    }

    public static boolean isNarcissistic(int input) {
        int val = 0;
        LinkedList<Integer> numberStack = new LinkedList<Integer>();
        int number = input;

        while(number > 0) {
            numberStack.push(number%10);
            number = number / 10;
        }
        int length = numberStack.size();
        while(!numberStack.isEmpty()) {
            int i = numberStack.pop();
            val += pow(i, length);
        }

        if(input == val) {
            return true;
        }
        return false;
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
