package Q3;

import java.util.Scanner;

public class SingletonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            if (input.equals("Yes")) {
                System.out.println(SingletonAssignment3.getInstance());
            } else {
                System.out.println("No instance is requested");
            }
        }
    }
}
