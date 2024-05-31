package Module_7;

import java.util.Scanner;

public class DeleteaElement {
    public static void main(String[] args) {
         int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;

        for (int i : A) {
            System.out.print(i+",");
        }
        System.out.println();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sequence:\n 0 for deleting with index \n 1 for deleting element");
        int choice=sc.nextInt();
         sc.close();
        if(choice==0){
            
            System.out.println("enter the index");
            int index=sc.nextInt();
            for(int i=index;i<A.length-1;i++){
                A[i]=A[i+1];
            }
        }
        
        else if(choice==1){
             int index;
            System.out.println("enter the element");
            int element=sc.nextInt();
            for(int i=0;i<A.length;i++){
                if(A[i]==element){
                    index=i;
                for(int j=index;j<A.length-1;j++){
                        A[j]=A[j+1];
                    }
                    break;
                }
             }
                
        }
        
        else{
            System.out.println("invalid choice");
            System.exit(0);
        }
        

            for (int i : A) {
            System.out.print(i+",");
        }
        System.out.println();
    }
}