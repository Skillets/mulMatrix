
package JmpratchiosLab1;
/*
Joshua Pratchios
9/14/2020
Test: Tests the QuickSort and mulMatrix Classes
*/
public class Test {
    public static void main(String args[] ) {
        int[] quicksortTest = new int[10]; // empty one-dimensional array
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];
     
        int[][] matrix3 = new int[3][2];
        int[][] matrix4 = new int[2][3];
                
        QuickSort quickSort = new QuickSort(); //QuickSort class for testing
        mulMatrix matrixes = new mulMatrix();
       
        /*------------------------------------------------------
        Quicksort Test:
        -Randomizes the given array with values from 0-9.
        -Prints Out the Randomized Array
        -Using Quicksort, sorts the array
        -Prints Out the Newly sorted array
        ------------------------------------------------------*/
        
        quickSort.randomize(quicksortTest);
        System.out.println("Randomized Array: ");
        quickSort.printArray(quicksortTest);
        quickSort.sort(quicksortTest, 0, quicksortTest.length - 1);
        System.out.println("Quicksorted Array: ");
        quickSort.printArray(quicksortTest);
        System.out.println();
        
        /*------------------------------------------------------
        mulMatrix Test 1: 
        -Given 2 Matrixes of equal size. 
        -Prints out each randomized Matrix.
        -Calculates the product.
        -Prints out the product.
        ------------------------------------------------------*/
        
        matrixes.randomMatrix(matrix1);
        matrixes.randomMatrix(matrix2);
        
        System.out.println("Test 1: ");
        
        System.out.println("First Matrix: ");
        matrixes.printMatrix(matrix1);

        System.out.println("Second Matrix: ");
        matrixes.printMatrix(matrix2);
        
        System.out.println("Product of the Two Matrixes: ");
        matrixes.calcProduct(matrix1,matrix2);

        /*------------------------------------------------------
        mulMatrix Test 2: 
        -Given 2 incompatible Matrixes, attempts to calculate the product
        -Prints out each randomized two-dimensional array
        -attempts to calculate the product
        -returns an error
        ------------------------------------------------------*/
        
        matrixes.randomMatrix(matrix1);
        matrixes.randomMatrix(matrix3);
        
        System.out.println("Test 2: ");
        
        System.out.println("First Matrix: ");
        matrixes.printMatrix(matrix1);
        
        System.out.println("Second Matrix: ");
        matrixes.printMatrix(matrix3);
        
        matrixes.calcProduct(matrix1,matrix3);
          
        /*------------------------------------------------------
        mulMatrix Test 3: 
        -Given 2 compatible matrixes of differing size, calculate the product 
        -Prints out each randomized Matrix.
        -Calculates the product.
        -Prints out the product.
        ------------------------------------------------------*/
        
        matrixes.randomMatrix(matrix3);
        matrixes.randomMatrix(matrix4);
        
        System.out.println("Test 3: ");
        
        System.out.println("First Matrix: ");
        matrixes.printMatrix(matrix3);
        
        System.out.println("Second Matrix: ");
        matrixes.printMatrix(matrix4);
        
        System.out.println("Product of the Two Matrixes: ");
        matrixes.calcProduct(matrix3,matrix4);
        
        
        
        
        
    }
}
