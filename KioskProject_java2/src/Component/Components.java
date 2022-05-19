package Component;

import javax.swing.*;

import static pages.Menu.*;

public class Components extends JFrame {

    public static JPanel nowBucket(){
        int vegetableNum = vegetables.size();
        int sourceNum = sources.size();
        boolean bolSet = set;

        JPanel nowOrder = new JPanel();

        JLabel nowMenu = new JLabel("메뉴" + core);
        JLabel nowBread = new JLabel("빵" + bread);
        JLabel nowCheese = new JLabel("치즈" + cheese);
        JLabel nowVegetables = new JLabel(vegetableNum + "개");
        JLabel nowSources = new JLabel(sourceNum+ "개");
        JLabel nowSet = new JLabel("세트유무" + bolSet);

        nowOrder.add(nowMenu);
        nowOrder.add(nowBread);
        nowOrder.add(nowCheese);
        nowOrder.add(nowVegetables);
        nowOrder.add(nowSources);
        nowOrder.add(nowSet);

        return nowOrder;
    }
}
