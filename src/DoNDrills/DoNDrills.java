package DoNDrills;

import java.util.List;

public class DoNDrills {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        List<Integer> numbers = List.of(1, 2, 4, 8, 16, 32, 64, 128, 256);
        for (int i : numbers) {
            System.out.println(i);
        }
        List<Integer> numbers2 = List.of(0, 1, 3, 7, 15, 31, 63, 127, 255);
        for (int i : numbers2) {
            System.out.println(i);
        }
        for (double i = 1; i < 50; i += 2){
            System.out.println(Math.sqrt(i));
        }
    }
}