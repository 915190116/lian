import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 第六题
 *
 * @author Lian
 * @create 2018-07-01 下午6:40
 **/
public class NO6 {
    private static int count = 0;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("羊城美景");
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
        JButton jButton = new JButton("请按此按钮一次");
        JLabel jLabel = new JLabel("白云山");

        jFrame.add(jButton);
        jFrame.add(jLabel);

        jFrame.setSize(500, 100);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count++;
                int b = count % 5;
                switch (b) {
                    case 0:
                        jLabel.setText("白云山");
                        break;
                    case 1:
                        jLabel.setText("陈家祠");
                        break;
                    case 2:
                        jLabel.setText("黄埔军校");
                        break;
                    case 3:
                        jLabel.setText("宝墨园");
                        break;
                    case 4:
                        jLabel.setText("五层楼");
                        break;
                }
            }
        });
    }
}
