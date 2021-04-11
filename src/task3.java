import java.util.Scanner;

public class task3 {
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
                System.out.println(isPrime(number));
                run();
        }
    }

    public static boolean isPrime(int number) {
        if(number < 2) return false;
        if(number == 2 || number == 3) return true;
        if(number%2 == 0 || number%3 == 0) return false;
        long sqrt = (long)Math.sqrt(number)+1;
        for(long i = 6L; i <= sqrt; i += 6) {
            if(number%(i-1) == 0 || number%(i+1) == 0) return false;
        }
        return true;
    }

}
