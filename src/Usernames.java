import java.util.Scanner;

public class Usernames {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if (username.equals("Alex") && password.equals("mightyducks")) {
            System.out.println("\nYou are logged into the system!");
        } else if (username.equals("Emily") && password.equals("cat")){
            System.out.println("\nYou are logged into the system!!");
        } else {
            System.out.println("\nYour username or password was invalid.");
        }
    }
}