package JAVA;
import java.util.Scanner;

public class pyramid_num{



    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("ENTER THE NUMBER >> ");
    int n= sc.nextInt();
for(int i=1;i<=n;i++){

    // CODE LOGIC 
//      1
//     232
//    34543
//   4567654

 for(int j=1; j<=n-i;j++){
    System.out.print(" ");  //SPACE
 }for(int j=1; j<=i; j++){
    System.out.print(i+j-1);
 }for(int j=1; j<=i-1;j++){
    System.out.print(i+i-2);
 }
 
 

/// END 
    System.out.println();
}


    }
}