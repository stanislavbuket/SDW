package lab1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int[][] A = new int[rows][cols];
        Random random = new Random();

        int totalSum = 0;
        int elementsCount = rows * cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = random.nextInt(100);
                totalSum += A[i][j];
            }
        }

        System.out.println("\nMatrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSums of matrix elements by rows:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += A[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        double average = (double) totalSum / elementsCount;
        System.out.println("\nArithmetic mean: " + average);
    }
}
