import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 第五题
 *
 * @author Lian
 * @create 2018-06-30 下午9:02
 **/
public class NO5 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("大写转换");
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

        JTextField jTextField = new JTextField("JCheckBox测试", 22);
        JCheckBox jCheckBox = new JCheckBox("大写");
        String text = jTextField.getText();

        jFrame.add(jTextField);
        jFrame.add(jCheckBox);

        jFrame.setSize(300, 200);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        jCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {

                if (jCheckBox.isSelected()) {
                    jTextField.setText(jTextField.getText().toUpperCase());
                } else {
                    jTextField.setText(text);
                }
            }
        });
    }
}
