import java.io.*;
import java.util.*;

public class subsetarray {

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int n =  scn.nextInt();

    int[] arr = new int[n];

    for(int i=0; i < arr.length;i++){
        arr[i]= scn.nextInt();

    }

    //concept of binary division

    int limit = (int)Math.pow(2, arr.length);

    for(int i=0; i< limit; i++){

        int temp = i;
        String set = "";


        for(int j= arr.length-1; j>=0; j--){

            int remainder = temp % 2;
            temp = temp / 2;

            if( remainder == 0){
                set = "-\t" + set;
            }
            else{
                set = arr[j] + "\t" + set;
            }

            
        }

        System.out.println(set);

    }




} 
 

}
    

