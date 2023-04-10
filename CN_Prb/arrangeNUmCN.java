package JAVA.CN_Prb;
import java.util.Scanner;
public class arrangeNUmCN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.print("ENTER THE ARRAY LENGTH _ COUNT >> ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int s=0; int e = n-1;
        for(int i=1; i<=n; i++){
        if(i%2==1){
            arr[s]=i;
            s++;
        }else{
            arr[e] = i;
            e--;
        }
      //++//CODE BY @imranpgda  >>> connect me on INSTAGRAM .. @imranpgda
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
