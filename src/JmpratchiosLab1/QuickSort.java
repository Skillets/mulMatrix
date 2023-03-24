

package JmpratchiosLab1;
import java.util.Random;
/**
 * Joshua Pratchios
 * 9/07/2020
 * QuickSort Problem
 * given an array, randomizes the array, creates a partition for quicksorting, and then recursively sorts the array. Also includes method for printing out array.
 */

public class QuickSort {
   
    /*
    randomize: given an array, fills the array with random values between 0-9.
    @param arr -> the given array
    */
    
    void randomize(int arr[]) {
        
        int l = arr.length; //length of array
        
        Random rand = new Random(); 
        
        //For loop to fill the array. Goes from 0 to the end of the array. Each iteration puts a random value 0-9
        for(int i = 0; i < l; i++) {
            arr[i] = rand.nextInt(10);
        }
    }
    
    /*
    partition: takes the last element as a "pivot", and then places the pivot element in its correct position. 
    Additionally, places all values smaller than the pivot to the left, and all greater values to the right of the pivot. 
    @param arr -> the given array
    @param low -> index of the smaller element
    @param high -> index of the larger element
    @return i+1
    */
    
      
    int partition(int arr[], int low, int high) {
        
        int pivot = arr[high]; //Element to be placed at right position
        int i = (low - 1); //Index for smaller element
        
        for(int j = low; j < high; j++) {
            //if current value is smaller than pivot 
            if(arr[j] < pivot) {
                i++; //increment index of smaller element
                
                //swap the two values
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;    
            }
        }
        //swap i+1 and high
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
    /*
    sort: sorts the given array 
    @param arr -> given array that is to be sorted
    @param low -> starting index
    @param high -> ending index
    */
    void sort(int arr[], int low, int high) {
        
        if(low < high) {
            
            // Pi starts for Partioning Index. 
            int pi = partition(arr,low,high);
            //Seperately sorts elements before/after partition
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }
    /*
    printArray: prints the contents of the given array
    @param arr -> the given array
    */
    void printArray(int arr[]) {
        int length = arr.length;
        for(int i = 0; i<length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
 
    
    
}
