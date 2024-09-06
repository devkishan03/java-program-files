package AWT.M1;
import java.awt.*;
public class Myfirstapp {
    public static void main(String[] args) {
    
        Frame f=new Frame("My first app");
        f.setLayout(new FlowLayout());

        Button b=new Button("ok");
        Label l=new Label("Lable");
        TextField tf=new TextField(10);
        
       
        f.add(l);
        
        f.add(tf);
         f.add(b);

        f.setSize(400, 400);
        f.setVisible(true);

    }
}
