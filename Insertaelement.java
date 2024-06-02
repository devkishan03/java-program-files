package Module_7;

import java.util.Scanner;

public class Insertaelement {
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;

        for (int i : A) {
            System.out.print(i+",");
        }
        System.out.println();

            Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        int element=sc.nextInt();
        System.out.println("enter the index '0-9'");
        int index=sc.nextInt();
        sc.close();

        for(int i=A.length-1;i>index;i--){
            A[i]=A[i-1];

        }
        A[index]=element;
        for (int i : A) {
            System.out.print(i+",");
        }
    }
}
