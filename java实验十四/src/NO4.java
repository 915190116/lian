import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 第四题
 *
 * @author Lian
 * @create 2018-06-30 下午8:32
 **/
public class NO4 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("隐藏按键");
        jFrame.setLayout(new BorderLayout());

        JButton jButton1 = new JButton("隐藏北方");
        JButton jButton2 = new JButton("隐藏西方");
        JButton jButton3 = new JButton("隐藏中央");
        JButton jButton4 = new JButton("隐藏东方");
        JButton jButton5 = new JButton("隐藏南方");

        jFrame.add(jButton1, BorderLayout.NORTH);
        jFrame.add(jButton2, BorderLayout.WEST);
        jFrame.add(jButton3, BorderLayout.CENTER);
        jFrame.add(jButton4, BorderLayout.EAST);
        jFrame.add(jButton5, BorderLayout.SOUTH);



        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton1.setVisible(false);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton2.setVisible(false);
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton3.setVisible(false);
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton4.setVisible(false);
            }
        });

        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton5.setVisible(false);
            }
        });

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount()==1) {
                    jButton1.setVisible(true);
                    jButton2.setVisible(true);
                    jButton3.setVisible(true);
                    jButton4.setVisible(true);
                    jButton5.setVisible(true);
                }
            }
        };
        jFrame.addMouseListener(mouseAdapter);

    }
}
