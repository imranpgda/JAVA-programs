package JAVA;
import java.util.*;

public class array_2d_numsearch{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE ROW NUMBER >> ");
    int r = sc.nextInt();
    System.out.print("ENTER THE COLOMN NUMBER >> ");
    int c = sc.nextInt();

    int arr[][] = new int[r][c];
 
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println();
    System.out.println();
//output the array matrix
for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
System.out.print("ENTER THE NUMBER FOR SEARCHING >> ");
int num = sc.nextInt();

for(int i=0; i<r; i++){
    for(int j=0;j<c;j++){
        if(arr[i][j]==num){
            System.out.print("THE TERM "+num+"IS AT ("+i+","+j+")");
        }
    }
}
//CODE BY @imranpgda  >>> connect me on INSTAGRAM .. @imranpgda
     
    }
}
