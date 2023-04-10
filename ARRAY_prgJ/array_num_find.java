package JAVA;
import java.util.*;

public class array_num_find {
    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
         System.out.print("ENTER THE ARRAY NUMBER >> ");
         int n = sc.nextInt();

         int aryn[] = new int[n];

         for (int i=0; i<n; i++){
            aryn[i]= sc.nextInt();
         }
         for(int i=0; i<n; i++){
             if(aryn[i]==5){
              System.out.println("THE NUMBER ^5^ is in "+i+"TERM");
             }
         }
    }
}
