import java.util.Scanner;

public class task2 {
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
                System.out.println(seperate(number));
                run();
        }
    }

    public static String seperate(int number) {
        StringBuilder sb = new StringBuilder();

        while(number % 2 == 0) {
            sb.append(2 + " ");
            number /= 2;
        }

        for(int i = 3; i <= Math.sqrt(number); i += 2) {
            while(number % i == 0) {
                sb.append(i + " ");
                number /= i;
            }
        }

        if(number > 2) {
            sb.append(number + " ");
        }

        return sb.toString();
    }

}
