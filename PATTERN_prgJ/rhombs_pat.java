package JAVA;

import java.util.Scanner;

public class rhombs_pat {
    public static void main(String[] args){
 
    System.out.print("ENTER THE ROW NUM >> ");
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i=1 ; i<=n; i++){
        for(int j=0; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=0; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=n; i>=1; i--){
        
        for(int j=0; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=0; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    }
}
