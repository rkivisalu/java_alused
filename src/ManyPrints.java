import java.util.Scanner;

public class ManyPrints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many? ");
        int number = Integer.parseInt(reader.nextLine());
        int counter = 1;
        while (counter <= number) {
            printText();
            counter++;
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}