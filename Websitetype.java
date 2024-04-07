public class Websitetype 
{
    public static void main(String[] args) 
    {
    String str="http://www.google.com";
    String str1=str.substring(0,str.indexOf(':'));
     if(str1.matches("http")){
        System.out.println("its a hyper text transfer protocol");
     }else if(str1.matches("ftp")){
        System.out.println("its a file transfer protocol");
     }else if(str1.matches("https")){
        System.out.println("its a sycure hyper text transfer protocol ");
     }else{
        System.out.println("invalid protocol");
     }
    String str2=str.substring(str.lastIndexOf('.')+1);
    if(str2.matches("com")){
        System.out.println("its a commercial website");
    }else if(str2.matches("gov")){
        System.out.println("its a goverment website");
    }else if(str2.matches("net")){
        System.out.println("its a network website");
    }else{
        System.out.println("invalid website");
    }

}
    
}
