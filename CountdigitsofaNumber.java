package Module_6;

import java.util.Scanner;

public class CountdigitsofaNumber {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
         sc.close();
        int num=0;

        while(n>0){
          
           n=n/10;
           num++;
        }
        System.out.println("total number of digits are "+num);
    }
     
        
}
