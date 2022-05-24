package pages;

import item.Bread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Component.Components.nowBucket;
import static pages.Menu.*;
import static pages.index.breadList;


public class orderCheck extends JFrame {

    public orderCheck(){

        setTitle("주문 내역 확인");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // 금액정산
        int nowPrice = 0;
        for(int i=0; i<index.breadList.size(); i++) {
            nowPrice += breadList.get(i).price;
        }

        //container
        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new GridLayout(6,1));

        //JPanel
        JPanel header = new JPanel();
        JPanel text = new JPanel();
        JPanel nowBucket = new JPanel();
        JPanel btnz = new JPanel();

        //jlabel, jbutton
        JLabel order = new JLabel("<html><br><br> 주문 내역 <br></html>");
        JLabel price = new JLabel("<html><br> 총 결제 비용: " + String.valueOf(nowPrice)+"원<br> 이대로 결제 하시겠습니까? <html>");
        JButton moremenu = new JButton("메뉴 더 고르기");
        JButton confirm = new JButton("결제하기");

        //panel에 배치
        header.add(order);
        text.add(price);
        btnz.add(moremenu);
        btnz.add(confirm);

        this.setVisible(true);


        //주문내역
        for(int i=0; i<index.breadList.size(); i++) {
            JPanel panel = new JPanel();
            Bread now_bread = index.breadList.get(i);
            panel.add(new JLabel("<html><br> 선택한 메뉴:" + now_bread.getCore()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 빵:" + now_bread.getBread()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 치즈:" + now_bread.getCheese()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 야채:" + now_bread.getVegetables().size()+"개 <br></html>"));
            panel.add(new JLabel("<html><br> 선택한 소스:" + now_bread.getSauce().size()+"개 <br></html>"));
            panel.add(new JLabel("<html><br> 세트 여부:" + now_bread.getSet()+"<br></html>"));
            panel.add(new JLabel());
            nowBucket.add(panel);
        }

        //header, nowBucket, text, btnz 디자인
        header.setBackground(new Color(0,85,67));
        order.setForeground(Color.WHITE);
        moremenu.setBackground(new Color(0,85,67));
        moremenu.setForeground(Color.WHITE);
        confirm.setBackground(Color.white);

        //font
        Font font1 = new Font("나눔고딕", Font.BOLD, 40);
        Font font2 = new Font("나눔고딕", Font.PLAIN, 20);
        order.setFont(font2);
        price.setFont(font2);
        moremenu.setPreferredSize(new Dimension(200,100));
        confirm.setPreferredSize(new Dimension(200,100));
        moremenu.setFont(font2);
        confirm.setFont(font2);




        //콘테이너 배치
        c.add(header);
        c.add(nowBucket);
        c.add(text);
        c.add(btnz);

        //eventListener

        moremenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 장바구니에 추가

                JOptionPane.showConfirmDialog(c, "장바구니에 추가되었습니다","Message", JOptionPane.CLOSED_OPTION);

                //초기화
                core = null;
                bread = null;
                cheese = null;
                vegetables = new ArrayList<>();
                sauces = new ArrayList<>();
                set = false;

                new Menu();
                setVisible(false);


            }
        });

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(c,Menu.price + "원 결제가 완료되었습니다","Message", JOptionPane.CLOSED_OPTION);
                //전체창 닫기
                setVisible(false);

            }
        });

    }

    public static void main(String[] args) {
        new orderCheck();
    }


}
