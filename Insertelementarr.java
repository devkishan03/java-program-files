import java.util.*;
public class Insertelementarr 
{
    public static void main(String[] args) {
        System.out.println("input the element");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        System.out.println("enter the index");
        int index=sc.nextInt();
        if(index>9){
            System.out.println("invalid index");
            System.out.println("plese enter upto index 9");
            System.exit(0);
        }
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

        for(int i=n;i>index;i--){
             a[i]=a[i-1];
             
        }a[index]=element;
        for(int x:a){
            System.out.print(x+",");
        }
    
    }
    
}
