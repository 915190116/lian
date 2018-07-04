import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 第七题
 *
 * @author Lian
 * @create 2018-07-01 下午7:18
 **/
public class NO7 {
    public static void main(String[] args) {
        String[] s = new String[]{"Serif", "Dialog", "Monospaced"};
        String[] c = new String[]{"红色", "绿色", "蓝色"};

        JFrame jFrame = new JFrame("字体和颜色");
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

        JLabel z = new JLabel("字型");
        JComboBox jComboBox_s = new JComboBox();
        JComboBox jComboBox_close = new JComboBox();
        JLabel color = new JLabel("颜色");
        JLabel h = new JLabel("Hello World!");

        h.setFont(new Font("Serif", 1, 30));
        h.setForeground(Color.red);

        for (String str : s) {
            jComboBox_s.addItem(str);
        }
        for (String str : c) {
            jComboBox_close.addItem(str);
        }

        jFrame.add(z);
        jFrame.add(jComboBox_s);
        jFrame.add(color);
        jFrame.add(jComboBox_close);
        jFrame.add(h);

        jFrame.setSize(400, 150);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jComboBox_s.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                h.setFont(new Font(String.valueOf(jComboBox_s.getSelectedItem()),1,30));
            }
        });

        jComboBox_close.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (jComboBox_close.getSelectedIndex() == 0) {
                    h.setForeground(Color.red);
                } else if (jComboBox_close.getSelectedIndex() == 1) {
                    h.setForeground(Color.green);
                } else if (jComboBox_close.getSelectedIndex() == 2) {
                    h.setForeground(Color.blue);
                }
            }
        });
    }
}
