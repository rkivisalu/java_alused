import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("How old is your bestfriend: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("together you are: " + (number+number1));
    }
}
