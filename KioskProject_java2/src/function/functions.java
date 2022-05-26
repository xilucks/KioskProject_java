package function;

import javax.swing.*;
import java.awt.*;

public class functions extends JFrame{
    //resize method
    public static ImageIcon resize(String path){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image reSizeImg = img.getScaledInstance(200,100,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(reSizeImg);

        return changeIcon;

    }

    public Container defaultContainer(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(new Color(238,238,238));

        return c;
    }
}
