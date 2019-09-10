import java.util.Random;
import java.util.Scanner;

public class R3TestCode {
    public static void main(String[] args) {
        Random rand = new Random();
        int usrInt;
        Scanner scan =  new Scanner(System.in);

        System.out.println("Please enter a positive integer.");
        usrInt = scan.nextInt();
        int usrIntOut = rand.nextInt(usrInt + 1);

        System.out.println("Your random number is " + usrIntOut + "!");
    }
}