public class EvenNumbers {
    public static void main(String[] args) {
        int number = 2;

        while (number < 101) {
            System.out.println(number);
            number = number + 2;  // number++ means the same as number = number + 1
        }
    }
}