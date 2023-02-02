import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
                System.out.println("Type Name :");
                String a = scn.next();
                System.out.println("Type age");
                int b = scn.nextInt();
                System.out.println("Your name is " + a + " "+ "Your age is " + b);

// 1. a= b= good, a= b!= ok, a!= b!= no good
                if (a.equals("Sergey") && b<=40) {
                    System.out.println("good");
                } else if (a.equals("Sergey") || b <= 40) {
                    System.out.println("ok");
                } else {
                    System.out.println(" no good");
                }




            }
}
