package lab2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        runTask1();
        runTask2();
    }

    private static void runTask1() {
        System.out.println("\n--- Task 1 ---");
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = 1000 + random.nextInt(9000);
            String s = Integer.toString(number);
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            if (sum < 10) {
                System.out.println("Number: " + s + " (Sum: " + sum + ")");
            }
        }
    }

    private static void runTask2() {
        System.out.println("\n--- Task 2 ---");
        String text = "The park is spectacular. A grape is a purple fruit. The cap is on the map. Papa bought a plane.";
        char target = 'p';
        char replaceFrom = 'a';
        char replaceTo = 'o';

        System.out.println("Input parameters:");
        System.out.println("Target: " + target);
        System.out.println("Replace: " + replaceFrom + " -> " + replaceTo);
        System.out.println("\nOriginal text:\n" + text);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            sb.append(current);

            if (Character.toLowerCase(current) == target && i + 1 < text.length()) {
                char next = text.charAt(i + 1);
                if (Character.toLowerCase(next) == replaceFrom) {
                    char replacement = Character.isUpperCase(next) ? Character.toUpperCase(replaceTo) : replaceTo;
                    sb.append(replacement);
                    i++;
                }
            }
        }

        System.out.println("\nModified text:\n" + sb);
    }
}
