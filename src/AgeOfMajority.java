import java.util.Scanner;

public class AgeOfMajority {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("How old are you? ");

        int age = Integer.parseInt(reader.nextLine());

        System.out.println(age);

        if (age >= 18) {
            System.out.println("\nYou have reached the age of majority.");
        } else {
            System.out.println("\nYou have not reached the age of majority.");
        }

    }
}