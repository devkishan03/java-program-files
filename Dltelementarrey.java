import java.util.*;
public class Dltelementarrey 
{
    public static void main(String[] args) {
        System.out.println("the elements are");
        int a[]=new int[10];
        a[0]=5;
        a[1]=9;
        a[2]=6;
        a[3]=10;
        a[4]=12;
        a[5]=7;
        int n=6;
        for(int x:a){
            System.out.print(x+",");
        }System.out.println();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index");
        int index=sc.nextInt();
        if(index>9){
            System.out.println("invalid index");
            System.out.println("plese enter upto index 9");
            System.exit(0);
        }
        for(int i=index;i<a.length-1;i++){
            a[i]=a[i+1];
        }for(int x:a){
            System.out.print(x+",");
        }  
        
    }
    
}
