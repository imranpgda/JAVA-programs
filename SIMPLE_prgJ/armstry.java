package JAVA;
import java.util.Scanner;

public class armstry {
    
    public static void main(String Args[]){
     
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER >> ");
        int num = sc.nextInt();

int rem=0 ,num2=1;
int count=0,num3=0;

int temp = num;
int temp1=num;

        while(num!=0){
            rem = num %10;
            num = num /10;
            count=count+1;
        }

        while(temp1!=0){
            num2=1;
            for(int i=0; i<count ; i++){
                num2=num2*rem;
                System.out.println(num2);
            }
            // while(i<count){
            //     num2=num2*rem;
            //     System.out.println(num2);
            //     i++;
            //     }
                num3=num3+num2;
                temp1=temp1/10;
        }
       

        if(num3==temp){
            System.out.print("<> THE NUMBER "+temp+" IS AN ARMSTRONG NUMBER <>");
        }else{
            System.out.print("THE NUMBER IS "+temp+" NOT AN ARMSTONG NUMBER ");
        }
       
    }
}
