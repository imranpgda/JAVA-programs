package JAVA.CN_Prb;
import java.util.Scanner;

public class linearsearchCN {
    public static void main(String[] args){
       
Scanner sc = new Scanner(System.in);
System.out.print("ENTER THE ARR LENGTH >> ");
int n = sc.nextInt();
int[] arr = new int[n];

//CODE BY @imranpgda  >>> connect me on INSTAGRAM .. @imranpgda
for(int i=0; i<arr.length; i++){
    System.out.print("ENTER "+(i+1)+"th ELEMENT >> ");
    arr[i] = sc.nextInt();
}
System.out.print("WHICH ONE DO YOU WANT TO SEARCH >> ");
int se = sc.nextInt();
for(int i=0 ; i<arr.length; i++){
    if(arr[i]==se){
        System.out.print(+se+" IS AT "+(i)+"th INDEX OF ARRAY \n");
    }
}   

}
}
