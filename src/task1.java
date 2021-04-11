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
        double val = 0;
        LinkedList<Integer> numberStack = new LinkedList<Integer>();
        int number = input;

        while(number > 0) {
            numberStack.push(number%10);
            number = number / 10;
        }
        while(!numberStack.isEmpty()) {
            int i = numberStack.pop();
            val += Math.pow(i, 3);
        }

        if(input == (int)val) {
            return true;
        }
        return false;
    }
}
