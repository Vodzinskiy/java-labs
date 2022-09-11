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

        if(A.length == 0 || B.length ==0){
            System.out.println("Matrix is empty!");
            return;
        }

        //check whether the matrix A is rectangular
        for (int[] ints : A) {
            if (A[0].length != ints.length) {
                System.out.println("Matrix A isn't rectangular");
                return;
            }
        }

        //check whether the matrix B is rectangular
        for (int[] ints : B) {
            if (B[0].length != ints.length) {
                System.out.println("Matrix B isn't rectangular");
                return;
            }
        }

        if (A.length == B.length && A[0].length == B[0].length){
            //create matrix C
            int[][] C = new int[A.length][A[0].length];
            System.out.println("Matrix C:");
            for (int i = 0; i < A.length; i++){
                for (int j = 0; j < A[0].length;j++) {
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.printf("%5d", C[i][j]);
                }
                System.out.println();
            }

            int sumMaxElement = 0;
            int sumMinElement = 0;

            //finding the smallest elements in the odd columns of the matrix
            for(int i = 0;i<C[0].length;i+=2){
                int temp = C[0][i];
                for(int j = 0; j < C.length;j++){
                    if (temp > C[j][i]) temp=C[j][i];
                }
                sumMinElement += temp;
            }
            System.out.println("\nSum of the smallest elements of odd columns: " + sumMinElement);


            if (C[0].length>=2){
                //finding the largest elements in even columns of the matrix
                for(int i = 1;i<C[0].length;i+=2){
                    int temp = C[0][i];
                    for(int j = 0; j < C.length;j++){
                        if (temp < C[j][i]) temp=C[j][i];
                    }
                    sumMaxElement += temp;
                }
                System.out.println("Sum of largest elements of even columns: " + sumMaxElement);
            } else {System.out.println("Matrix hasn`t even columns");}

        } else {
            System.out.println("Matrices A and B have different sizes");
        }
    }
}
