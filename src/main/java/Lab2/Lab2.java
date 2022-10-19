package Lab2;

/*
Залікова - 0402
C5  = 2 -> C=A+B
C7  = 3 -> int
C11 = 6 -> Обчислити суму найбільших елементів в стовпцях матриці з парними номерами
           та найменших елементів в стовпцях матриці з непарними номерами
 */


public class Lab2 {
    public static void main(String[] args) {

        //crete matrix A
        int[][] A = {{1,2,3,4},
                     {9,7,6,5},
                     {3,4,1,3}};

        //crete matrix B
        int[][] B = {{9,4,3,1},
                     {2,7,3,2},
                     {1,4,6,7}};
        //checking matrices for equality              
        if(A.length == 0 || B.length == 0 || A.length != B.length || A[0].length != B[0].length){
            System.out.println("Matrices A and B have different sizes");
            return;
        }
        //check matrices for squareness
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

        //create matrix C
        int[][] C = new int[A.length][A[0].length];
        //matrix addition and matrix C printing
        System.out.println("Matrix C:");
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length;j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.printf("%5d", C[i][j]);
            }
            System.out.println();
        }
        
        //sum of the largest elements in the matrix columns with even numbers and the smallest elements in the matrix columns with odd numbers
        int sumMaxElement = 0;
        int sumMinElement = 0;

        for (int i = 0; i < C[0].length;i+=2){
            int tempMax = C[0][i+1];
            int tempMin = C[0][i];

            for(int j = 0; j < C.length;j++){
                if (tempMax < C[j][i+1]) tempMax=C[j][i+1];
                if (tempMin > C[j][i]) tempMin=C[j][i];
            }
            sumMinElement += tempMin;
            sumMaxElement += tempMax;
        }
        System.out.println("\nSum of the smallest elements of odd columns: " + sumMinElement);
        System.out.println("Sum of largest elements of even columns: " + sumMaxElement);
    }
}
