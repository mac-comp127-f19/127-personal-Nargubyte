package DoNDrills;

import java.util.Scanner;

public class SentinalDrills {
    public static void main(String[] args){
        int x = 0;
        while(x >= 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a positive integer (negative to quit).");
            x = scan.nextInt();
            if(x % 2 == 0){
                System.out.println("You entered an even number.");
            }
            else{
                System.out.println("You entered an odd number.");
            }
        }
    }
}
