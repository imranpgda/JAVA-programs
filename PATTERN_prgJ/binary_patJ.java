package JAVA;

import java.util.Scanner;

public class binary_patJ {
    public static void main(String[] args){
        
    System.out.print("ENTER THE ROW NUM >> ");
    Scanner sc = new Scanner(System.in);
//CODE BY @imranpgda  >>> connect me on INSTAGRAM .. @imranpgda
    int n = sc.nextInt();

    for(int i=0; i<=n; i++){
     for(int j=0; j<=i; j++){
        if((i+j)%2==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
     }
        System.out.println();
    }
}

}
