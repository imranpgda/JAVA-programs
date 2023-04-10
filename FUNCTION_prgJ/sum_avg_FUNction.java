package JAVA;
import java.util.Scanner;

public class sum_avg_FUNction {
    public static int sum(int x,int y,int z){
        int sum;
        sum=x+y+z;
        return sum;
    }
    public static int avg(int x,int y,int z){
        int avg;
        avg=(x+y+z)/2;
        return avg;
    }
    public static void main(String args[]){
        System.out.print("ENTER THE A >> ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("ENTER THE B >> ");
        int b = sc.nextInt();
        System.out.print("ENTER THE C >> ");
        int c = sc.nextInt();


        System.out.println("THE SUM A + B + C is "+sum(a,b,c));
        System.out.println("THE AVG A + B + C is "+avg(a,b,c));
    }
}
