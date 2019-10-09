import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("tell me a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int even = number % 2;
        if (even == 0) {
            System.out.print(number + " is even");
        } else {
            System.out.print(number + " is odd");
        }
    }
}
