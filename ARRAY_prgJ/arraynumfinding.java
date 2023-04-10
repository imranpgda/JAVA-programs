package JAVA;
import java.util.*;

public class arraynumfinding {
    public static void main(String args[]){
       
       //scanner class for input
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE ARRAY SIZE >> ");
        int size = sc.nextInt();
        
        //array defining 
        int arr[] = new int[size];

        //now input in array through loop
      for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }
//CODE BY @imranpgda  >>> connect me on INSTAGRAM .. @imranpgda
      //input for search number 
      System.out.println("ENTER THE NUM FOR SEARCHING IN THIS ARRAY ><><");
      int num = sc.nextInt();

// finding the number in array 
      for(int i=0; i<arr.length; i++){
        if(arr[i]==num){
            System.out.print("THE TERM <<"+num+">> IS AT THE ARRAY NUMBER <<"+i+">>");
        }
      }
    }
}
