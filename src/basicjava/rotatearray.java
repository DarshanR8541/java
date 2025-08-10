package basicjava;
import java.util.Arrays;
import java.util.Scanner;
public class rotatearray{
    public static void main(String[] args){
    int arr[][]= {{1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12}};
    System.out.println(arr.length);
    System.out.println(arr[1].length);
    for(int row=0;row<arr.length;row++) {
        for(int col=0;col<arr[row].length;col++) {
            System.out.print(arr[row][col]+" ");          
        }
        
        System.out.println();
    }
  }
}