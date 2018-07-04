import javax.swing.*;
import javax.swing.event.ListDataEvent;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 第二题
 *
 * @author Lian
 * @create 2018-06-30 下午7:08
 **/
public class ComboChangeField {
    public static void main(String[] args) {
        String[] list = new String[]{"花鸟鱼虫","梅兰菊竹","小桥流水","田园风光","渔歌晚唱"};
        JFrame jFrame = new JFrame("改变文本框的文字");
        jFrame.setLayout(new GridLayout(3,1,10,10));

        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
        JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER,50,50));
        JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER,50,50));
        JTextField jTextField1 = new JTextField();
        JTextField jTextField2 = new JTextField();
        JCheckBox jCheckBox1 = new JCheckBox("文本1");
        JCheckBox jCheckBox2 = new JCheckBox("文本2");
        JComboBox jComboBox = new JComboBox();

        for (String str : list) {
            jComboBox.addItem(str);
        }


        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);
        jPanel.add(jComboBox);
        jFrame.add(jPanel1.add(jTextField1));
        jFrame.add(jPanel);
        jFrame.add(jPanel2.add(jTextField2));

        jFrame.setSize(300,150);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (jCheckBox1.isSelected()) {
                    jTextField1.setText(String.valueOf(jComboBox.getSelectedItem()));
                }
                if (jCheckBox2.isSelected()) {
                    jTextField2.setText(String.valueOf(jComboBox.getSelectedItem()));
                }
            }
        });
    }
}
