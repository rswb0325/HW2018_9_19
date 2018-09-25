import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int x = scn.nextInt();
        if (x%4!=0 ) System.out.println(false);
        else if (x%100==0) System.out.println(false);
        else  if (x%400==0) System.out.println(true);
        else  if (x%4==0) System.out.println(true);
        int y = scn.nextInt();
        if (y%4!=0 ) System.out.println(false);
        else if (y%100==0) System.out.println(false);
        else  if (y%400==0) System.out.println(true);
        else  if (y%4==0) System.out.println(true);
        int z =scn.nextInt();
        if (z%4!=0 ) System.out.println(false);
        else if (z%100==0) System.out.println(false);
        else  if (z%400==0) System.out.println(true);
        else  if (z%4==0) System.out.println(true);
    }
}
