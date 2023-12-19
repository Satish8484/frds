package BasicCode;

import java.util.Scanner;

public class NoInputScan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter  1st no");//10
        int a = s.nextInt();//10 enter
        System.out.println("enter  2nd no");
        int b = s.nextInt();//20 enter

        System.out.println("enter  your name");

        s.nextLine();//enter
        String name2=s.nextLine();//satish enter
        System.out.println( "addition of two no =");




    }
}
