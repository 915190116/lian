import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 第三题
 *
 * @author Lian
 * @create 2018-06-30 下午8:12
 **/
public class NO3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("选择水果");
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

        String[] ShuiGuo = new String[]{"苹果", "香蕉", "葡萄", "菠萝", "荔枝", "龙眼"};

        JComboBox jComboBox = new JComboBox();
        JLabel jLabel = new JLabel("苹果");
        for (String str : ShuiGuo) {
            jComboBox.addItem(str);
        }

        jFrame.add(jComboBox);
        jFrame.add(jLabel);

        jFrame.setSize(200,200);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                jLabel.setText((String) jComboBox.getSelectedItem());
            }
        });
    }
}
