public class Sumelementva 
{ 
    static int  sum(int ...a)
    {
        int s=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];
           }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{2,3,4,5,6,7,7,8}));
    }
}
