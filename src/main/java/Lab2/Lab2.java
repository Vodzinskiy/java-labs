package Lab2;

/*
Залікова - 0402
C5  = 2 -> C=A+B
C7  = 3 -> int
C11 = 6 -> Обчислити суму найбільших елементів в стовпцях матриці з парними номерами
           та найменших елементів в стовпцях матриці з непарними номерами
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {

        final int[][] A = {{1, 7, 1, 8},
                           {1, 7, 3, 8},
                           {3, 4, 1, 9}};

        final int[][] B = {{1, 7, 1, 8},
                           {1, 7, 1, 8},
                           {1, 7, 6, 9}};

        if (A.length == 0 || B.length == 0 || A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Matrices A and B have different sizes");
            return;
        }

        for (int[] ints : A) {
            if (A[0].length != ints.length) {
                System.out.println("Matrix A isn't rectangular");
                return;
            }
            if (B[0].length != ints.length) {
                System.out.println("Matrix B isn't rectangular");
                return;
            }
        }

        int[][] C = new int[A.length][A[0].length];

        System.out.println("Matrix C:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.printf("%5d", C[i][j]);
            }
            System.out.println();
        }

        int sumMaxElement = 0;
        int sumMinElement = 0;

        for (int i = 1; i < C[0].length; i += 2) {
            int tempMax = C[0][i];
            ArrayList<Integer> tempList = new ArrayList<>();
            tempList.add(C[0][i]);
            for (int j = 1; j < C.length; j++) {
                tempList.add(C[j][i]);
                if (tempMax < C[j][i]) {
                    tempMax = C[j][i];
                }
            }

            if (Collections.frequency(tempList, tempMax) >= 2) {
                tempMax = 0;
            }
            sumMaxElement += tempMax;
        }


        for (int i = 0; i < C[0].length; i += 2) {
            int tempMin = C[0][i];
            ArrayList<Integer> tempList = new ArrayList<>();
            tempList.add(C[0][i]);
            for (int j = 1; j < C.length; j++) {
                tempList.add(C[j][i]);
                if (tempMin > C[j][i]) {
                    tempMin = C[j][i];
                }
            }

            if (Collections.frequency(tempList, tempMin) >= 2) {
                tempMin = 0;
            }
            sumMinElement += tempMin;
        }

        System.out.println("\nSum of the smallest elements of odd columns: " + sumMinElement);
        System.out.println("Sum of largest elements of even columns: " + sumMaxElement);
    }
}
