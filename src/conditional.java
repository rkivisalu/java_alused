import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Tell me a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("the number u entered is > " + (number-1) + " and < " + (number+1));


        int first = 1;
        int second = 3;

        boolean isLesser = first < second;

        if (isLesser) {
            System.out.println(first + " is less than " + second + "!");
        }
        }
}
