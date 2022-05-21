/*

체크박스 https://dynamide.tistory.com/1456

다중 체크박스 : https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=scyan2011&logNo=221687232608
 */

package pages;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Component.Components.nowBucket;
import static pages.Menu.sauces;
import static pages.Menu.vegetables;

public class vegetableAndSauce extends JFrame {
    public vegetableAndSauce(){

        //Container Setting
        Container c = getContentPane();
        c.setBackground(new Color(50,100,100));
        c.setLayout(new FlowLayout());
        setTitle("야채와 소스를 골라주세요");



        //컴포넌트 생성
        JPanel vegetablesPanel = new JPanel();
        JPanel saucePanel = new JPanel();
        JButton submit = new JButton("확인");
        JPanel nowBucket = nowBucket();

            //vegetablesPanel 수정
        JCheckBox cucumber = new JCheckBox("오이");
        JCheckBox lettuce = new JCheckBox("양상추");
        JCheckBox olive = new JCheckBox("올리브");
        JCheckBox tomato = new JCheckBox("토마토");
        JCheckBox pickle = new JCheckBox("피클");
        JCheckBox onion= new JCheckBox("양파");

        vegetablesPanel.add(cucumber);
        vegetablesPanel.add(lettuce);
        vegetablesPanel.add(olive);
        vegetablesPanel.add(tomato);
        vegetablesPanel.add(pickle);
        vegetablesPanel.add(onion);

        //vegetablesPanel 수정
        JCheckBox hotChilli = new JCheckBox("핫칠리");
        JCheckBox mustard = new JCheckBox("머스타드");
        JCheckBox dressing = new JCheckBox("이탈리안 드레싱");
        JCheckBox sweatOnion = new JCheckBox("스위트 어니언");
        JCheckBox sweetchilly = new JCheckBox("스위트 칠리");
        JCheckBox smokebbq = new JCheckBox("스모크 바베큐");
        JCheckBox salt = new JCheckBox("소금");
        JCheckBox pepper = new JCheckBox("후추");

        saucePanel.add(hotChilli);
        saucePanel.add(mustard);
        saucePanel.add(dressing);
        saucePanel.add(sweatOnion);
        saucePanel.add(sweetchilly);
        saucePanel.add(smokebbq);
        saucePanel.add(salt);
        saucePanel.add(pepper);


        //컴포넌트 디자인
        vegetablesPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "야채종류" ,TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,0,0)));
        saucePanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "야채종류" ,TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,0,0)));

        //컴포넌트 추가
        c.add(vegetablesPanel);
        c.add(saucePanel);
        c.add(submit);
        c.add(nowBucket);

        //submit 액션
        submit.addActionListener(new ActionListener() {
            boolean[] tmpVegetableArr = new boolean[4];

            @Override
            public void actionPerformed(ActionEvent e) {

                //야채 선택
                if(cucumber.isSelected()){
                    vegetables.add("오이");
                }
                if(lettuce.isSelected()){
                    vegetables.add("양상추");
                }
                if(olive.isSelected()){
                    vegetables.add("올리브");
                }
                if(tomato.isSelected()){
                    vegetables.add("토마토");
                }
                if(pickle.isSelected()){
                    vegetables.add("피클");
                }
                if(onion.isSelected()){
                    vegetables.add("양파");
                }

                //소스 선택
                if(hotChilli.isSelected()){
                    sauces.add("핫칠리");
                }
                if(mustard.isSelected()){
                    sauces.add("머스타드");
                }
                if(dressing.isSelected()){
                    sauces.add("이탈리안 드레싱");
                }
                if(sweatOnion.isSelected()){
                    sauces.add("스위트 어니언");
                }
                if(sweetchilly.isSelected()){
                    sauces.add("스위트 칠리");
                }
                if(smokebbq.isSelected()){
                    sauces.add("스모크 바베큐");
               }
                if(salt.isSelected()){
                    sauces.add("소금");
                }
                if(pepper.isSelected()){
                    sauces.add("후추");
                }

                new set();
            }


        });



        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(800, 600);
        setVisible(true);
    }





    public static void main(String[] args) {
        new vegetableAndSauce();

    }
}
