package Module_9_Oops.Interface;
interface Camera
{
    void click();
    void record();
    
}

interface Musicplayer
{
    void play();
    void pause();
    void stop();
}

class Phone
{
    public void call(){
      System.out.println("Phone is calling");
    }
    public void sendsms(){
        System.out.println("Phone sending sms");
    }
}

class Smartphone extends Phone implements Camera,Musicplayer
{
       public void videocall(){
        System.out.println("Smartphone videocalling");
       }
       public void browseinternet(){
        System.out.println("smartphone browsing internet");
       }

       public void click(){
        System.out.println("Clicking picture");
       }
       public void record(){
        System.out.println("recording video");
       }

       public void play(){
        System.out.println("Playing music");
       }
       public void pause(){
        System.out.println("music pause");
       }
       public void stop(){
        System.out.println("music stop");
       }
    
}

public class Practiceinterface {
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        Camera c;
        Phone p;
        Musicplayer m;
        m=s;
        c=s;
        p=s;
        s.play();
        p.call();
        c.click();
        m.play();
    }
}
