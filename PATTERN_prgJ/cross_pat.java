package JAVA;

import java.util.Scanner;


public class cross_pat {
public static void main(String[] args){
System.out.print("ENTER THE ROW NUM <<>> ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

for(int i=0; i<=n; i++){
    for(int j=0; j<=n; j++){
        if(i==j || i+j==n){
            System.out.print("*");
        }else{
            System.out.print("-");
        }
    }
    System.out.println();
}

}


}
