package JAVA;

import java.util.Scanner;

public class ARmstrong_num{
 /**
 * @param args
 */
public static void main(String[] args) {
    
int n,t1,t2,i,arm=0,len=0 ,rem,mul=1;
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER >> ");
            n= input.nextInt();
            t1= n;
            while(t1>0){
                len = len+1;
                t1= t1/10;
            }
            t2 =n;
            while(t2>0){
                rem= t2%10;
                for(i=1;i<=len;i++){
                   mul = mul*rem;
                }
                arm= arm+mul;
                t2= t2/10;
            }
            if(arm==n){
                System.out.println("The number is a armstrong number");
            }
            else{
                System.out.println("not a armstrong number");
            }
        }}