import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("tell me a number");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("tell me a second number");
        int number2 = Integer.parseInt(reader.nextLine());
        if (number > number2) {
            System.out.println(number + " is > " + number2);
        } else {
            System.out.println(number2 + " > " + number);
        }
    }
}
