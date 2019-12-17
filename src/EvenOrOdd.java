import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int evenOdd = Integer.parseInt(reader.nextLine());

        if (evenOdd % 2 != 0) {
            System.out.println("Number " + evenOdd + " is odd.");
        }
        else {
            System.out.println("Number " + evenOdd + " is even.");
        }
    }
}