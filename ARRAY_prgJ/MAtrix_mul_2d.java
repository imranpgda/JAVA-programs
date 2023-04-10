package JAVA;
import java.util.Scanner;

public class MAtrix_mul_2d{
    /**
     * @param args
     */
    public static void main(String[] args){
// res
int res[][] = new int[10][10];

Scanner sc=new Scanner(System.in);
//1st array
System.out.print("ENTER ROW NUMBER >> ");
int r1= sc.nextInt();
System.out.print("ENTER THE COLUMN NUMBER >> ");
int c1=sc.nextInt();
int A1[][] = new int[r1][c1];
//1st array input
for(int i=0; i<r1; i++){

    for(int j=0;j<c1; j++){
      A1[i][j]=sc.nextInt();
    }
      System.out.println();
  }
//2nd array
System.out.print("ENTER ROW NUMBER >> ");
int r2= sc.nextInt();
System.out.print("ENTER THE COLUMN NUMBER >> ");
int c2=sc.nextInt();

int A2[][] = new int[r2][c2];
//2nd array input
for(int i=0;i<r2;i++){
for(int j=0; j<c2; j++){
    A2[i][j] = sc.nextInt();
}
System.out.println();
}

// condition

if(c1==r2){

for(int i=0; i<r1;i++){
    for(int j=0; j<c1;j++){
        res[i][j] =0;
        for(int c=0; c<r2; c++){
res[i][j] = res[i][j] + A1[i][c]*A2[c][j];
}
}
}
//CODE BY @imranpgda  >>> connect me on INSTAGRAM .. @imranpgda

for(int i=0; i<r2;i++){
    for(int j=0;j<c1;j++){
        System.out.print(res[i][j]+" ");
    }
    System.out.println();
}


    }
    else{
        System.out.print("MATRIX MULTIPLICATIONS NOT POSSIBLE");
    }




}

}