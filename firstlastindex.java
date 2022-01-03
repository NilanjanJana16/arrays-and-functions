import java.io.*;
import java.util.*;
public class firstlastindex {
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
        int fi= -1;
        int lasti= -1; 
        
    
        while(low<=high){
            int mid = (high + low)/2;
    
            if(data<arr[mid]){
    
                high = mid -1;
                
    
            }else if(data > arr[mid]){
                low = mid +1;
                
    
            }else{    
                fi= mid;
                high = mid-1;                  
        
            }
        }
    
        System.out.println(fi);   

        //Inititalise them to original values
        low= 0;
        high= arr.length-1;
          
               
    
        while(low<=high){
            int mid = (high + low)/2;
    
            if(data<arr[mid]){
    
                high = mid -1;
                
    
            }else if(data > arr[mid]){
                low = mid +1;               
    
            }else{
    
                lasti= mid;
                low = mid+1;                     
    
            }
        }
    
        System.out.println(lasti);
    }

    
}
