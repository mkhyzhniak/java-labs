package edu.dp.sau.mkhyzhniak.lab2;

import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final int RANDOM_MIN = -100;
    private static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розмірів матриці з перевіркою
        int rows = getValidatedInt(scanner, "Enter the number of rows (max 20): ", 20);
        int cols = getValidatedInt(scanner, "Enter the number of columns (max 20): ", 20);

        // Вибір способу заповнення матриці
        int choice = getValidatedInt(scanner, "Choose matrix input method (1 for manual, 2 for random): ", 2);
        int[][] matrix;

        if (choice == 1) {
            matrix = createMatrixManually(scanner, rows, cols);
        } else {
            matrix = createMatrixRandomly(rows, cols);
        }

        displayMatrix(matrix);
        findAndDisplayMinMax(matrix);
        calculateAndDisplayAverages(matrix);
    }

    private static int getValidatedInt(Scanner scanner, String prompt, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= 1 && value <= max) {
                    return value; // Коректне значення, повертаємо
                } else {
                    System.out.println("Invalid input. Please enter a number between " + 1 + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Очищення некоректного вводу
            }
        }
    }


    private static int[][] createMatrixManually(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    if (scanner.hasNextInt()) {
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next();
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] createMatrixRandomly(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = RANDOM_MIN + random.nextInt(RANDOM_MAX - RANDOM_MIN + 1);
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void findAndDisplayMinMax(int[][] matrix) {
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
                if (element > max) {
                    max = element;
                }
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    private static void calculateAndDisplayAverages(int[][] matrix) {
        int sum = 0;
        int count = 0;
        double product = 1.0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
                product *= element;
            }
        }

        double arithmeticMean = (double) sum / count;
        double geometricMean = (product > 0) ? Math.pow(product, 1.0 / count) : -1;

        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + (geometricMean > 0 ? geometricMean : "undefined due to non-positive values"));
    }
}
