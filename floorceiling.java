import java.io.*;
import java.util.*;

public class floorceiling{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];
    for(int i =0; i< arr.length; i++){

        arr[i] = scn.nextInt();
    }

    int data = scn.nextInt();

    int low= 0;
    int high= arr.length-1;
    int floor =0;
    int ceiling=0;
    

    while(low<=high){
        int mid = (high + low)/2;

        if(data<arr[mid]){

            high = mid -1;
            ceiling = arr[mid];


        }else if(data > arr[mid]){
            low = mid +1;
            floor = arr[mid];

        }else{

            ceiling = arr[mid];
            floor = arr[mid];
            break;


        }
    }

    System.out.println(ceiling);
    System.out.println(floor);
 }

}