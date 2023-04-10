package JAVA;

import java.util.Scanner;

public class butterfly_pat {
    
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("ENTER THE ROW NUMBER >> ");
int n = sc.nextInt();

for(int i=1; i<=n; i++){

 for(int j=1 ; j<=i; j++){
    System.out.print("I");
 }
 int space = 2*(n-i);
for(int j=1; j<=space; j++){
    System.out.print("-");
}
for(int j=1;j<=i; j++){
System.out.print("I");
}
//CODE BY @imranpgda  >>> connect me on INSTAGRAM .. @imranpgda
    System.out.println();
}
for(int i=n; i>=1; i--){
for(int j=1; j<=i; j++){
    System.out.print("I");
}int space = 2*(n-i);
for(int j=1; j<=space; j++){
    System.out.print("-");
}for(int j=1; j<=i; j++){
    System.out.print("I");
}


    System.out.println();
}

}
}
