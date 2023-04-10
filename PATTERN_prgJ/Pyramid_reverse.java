package JAVA;

import java.util.Scanner;

public class Pyramid_reverse{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("ENTER THE NUM OF ROW >> ");
int n = sc.nextInt();

for(int i=0; i<=n; i++){

   for(int j=0; j<=n; j++){
    if(i<j){
        System.out.print(" *");
    }else{
        System.out.print(" ");
    }
   }

    System.out.println();
}

}

}
