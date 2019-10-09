import java.util.Scanner;

public class grades {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("testi tulemus(0-100): ");
        int tulemus = Integer.parseInt(reader.nextLine());
        if (tulemus < 50 && tulemus >=0) {
            System.out.println("hinne on 2");
        }
        else if(tulemus <= 75 && tulemus > 50){
            System.out.println("hinne on 3");
        }
        else if(tulemus <= 90 && tulemus > 75){
            System.out.println("hinne on 4");
        }
        else if(tulemus > 90 && tulemus <=100){
            System.out.println("hinne on 5");
        }
        else{
            System.out.println("sisestage number vahemikus 0-100");
        }
    }
}
