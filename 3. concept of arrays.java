// to show the concept of arrays in java

import java.util.*;

public class Main{
    public static void main(String[] args){
        
        int i,n,pos;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        
        int[] arr= new int[n+1]; //dynamically initializing array
        
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the position you want to enter the new element at: ");
        pos=sc.nextInt();
        
        //shifting elements to the right to make space for the new elements
        for(i=n;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        
        System.out.println("Enter the new element: ");
        arr[pos-1]=sc.nextInt();
        n++;
        
        //printing the new array
        System.out.println("\n");
        System.out.println("The new array is: ");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        
    }
}
