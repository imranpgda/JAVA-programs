package JAVA.CN_Prb;
import java.util.Scanner;

public class alterpairCN {
    public static void main(String[] args)
   {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
int s=0;

for(int i=0; i<arr.length; i++){
    arr[i]= sc.nextInt();
}

    for(int i=1; i<=arr.length; i+=2){
    
        if(i%2==1){
            int temp = arr[i];
            arr[s] = temp;
            arr[i] = arr[s];
            
        }
        s++;
    }
for(int i=0; i<arr.length; i++){
    System.out.print(arr[i]);
}
   } 
}
