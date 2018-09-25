import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float cm =scn.nextFloat();
        float kg =scn.nextFloat();
        float x =cm/2.54f;
        float y =kg/0.454f;
        System.out.println(x);
        System.out.println(y);
    }
}
