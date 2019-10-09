import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name

        System.out.println("Hi, " + name);

            System.out.print("How old are you: ");
            int age = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

            System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you!");
        }
    }
