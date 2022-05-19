package Component;

import javax.swing.*;

import static pages.Menu.*;

public class Components extends JFrame {

    public static JPanel nowBucket(){
        int vegetableNum = vegetables.size();
        int sauceNum = sauces.size();
        boolean bolSet = set;

        JPanel nowOrder = new JPanel();

        JLabel nowMenu = new JLabel("메뉴: " + core + "\n");
        JLabel nowBread = new JLabel("빵: " + bread + "\n");
        JLabel nowCheese = new JLabel("치즈: " + cheese + "\n");
        JLabel nowVegetables = new JLabel("야채:" + vegetableNum + "개 \n");
        JLabel nowSources = new JLabel("소스: " + sauceNum+ "개 \n" );
        JLabel nowSet = new JLabel("세트유무: " + bolSet + "\n");

        nowOrder.add(nowMenu);
        nowOrder.add(nowBread);
        nowOrder.add(nowCheese);
        nowOrder.add(nowVegetables);
        nowOrder.add(nowSources);
        nowOrder.add(nowSet);

        return nowOrder;
    }
}
