package JAVA;
import java.util.Scanner;

public class Pyramid_pat{

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
System.out.print("ENTER THE ROW NUMBER >> ");
int n = sc.nextInt();

for(int i=0; i<=n; i++){
    for(int j=0; j<=n; j++){
        if(j<=n-i){
            System.out.print(" ");
        }else{
            System.out.print(" *");
        }
    }
    // for(int j=0; j<=(n-i); j++){
    //     System.out.print(" ");
    // }for(int j=0; j<=i; j++){
    // System.out.print(" *");
    // }

    System.out.println();
}

}    
}