
package JmpratchiosLab1;

import java.util.Random;
/*
* Joshua Pratchios
* 9/14/2020
* MulMatrix 
* Given 2 matrixes, fills them with random values 0-9. 
* Calculates the product of both Matrixes
* Prints out the product
*/
public class mulMatrix {
    
    /*
    randomMatrix -> Fill a two dimensional array with random values.
    @param matrix -> the given empty matrix
    */
    
    void randomMatrix(int[][] matrix) {
        Random rand = new Random(); //Random object for filling the matrix
        int row = matrix.length; // number of arrows in matrix
        int col = matrix[0].length; //number of columns in matrix
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }  
    
    /*
    CalcProduct -> calculates the product of 2 given matrixes, and then calls printMatrix to print it out
    @param matrix1 -> the first matrix
    @param matrix2 -> the second matrix
    */
    void calcProduct(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length; //the # of rows in the first matrix
        int col1 = matrix1[0].length; //the # of columns in first matrix
        int row2 = matrix2.length; //the # of rows in the second matrix
        int col2 = matrix2[0].length; //the # of columns in the second matrix
        
        //Checks compatibility of the two matrixes. if the # of columns in matrix1 is not equal to the # of rows in matrix 2, they are incompatible. 
        if(col1 != row2) {
            System.out.println("Matrixes are incompatible.");
        } else { 
            int product[][] = new int[row1][col2]; //the product of the two matrixes
         
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < col2; j++) {
                    for(int k = 0; k < row2; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            printMatrix(product); //calls to print the product
        }
    } 
    
    /*
    printMatrix -> prints the given matrix out
    @param matrix -> the given matrix
    */
    void printMatrix(int[][] matrix) { 
        
        int row = matrix.length; //the number of rows
        int col = matrix[0].length; //the number of columns
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
