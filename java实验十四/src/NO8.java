import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 第八题
 *
 * @author Lian
 * @create 2018-07-01 下午7:56
 **/
public class NO8 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("设置字体");
        jFrame.setLayout(new GridLayout(2, 1));
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 15));
        JTextField jTextField = new JTextField("今天天气真好，我想去爬山。");
        jTextField.setFont(new Font("宋体", 0, 20));
        jTextField.setForeground(Color.gray);

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton jRadioButton1 = new JRadioButton("平体", true);
        JRadioButton jRadioButton2 = new JRadioButton("粗体");
        JRadioButton jRadioButton3 = new JRadioButton("斜体");
        JRadioButton jRadioButton4 = new JRadioButton("粗斜体体");
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);
        buttonGroup.add(jRadioButton4);

        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        jPanel.add(jRadioButton3);
        jPanel.add(jRadioButton4);

        jFrame.add(jTextField);
        jFrame.add(jPanel);

        jFrame.setSize(400, 110);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);


        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextField.setFont(new Font("宋体", Font.PLAIN, 20));
            }
        });

        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextField.setFont(new Font("宋体", Font.BOLD, 20));
            }
        });

        jRadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextField.setFont(new Font("宋体", Font.ITALIC, 20));
            }
        });

        jRadioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jTextField.setFont(new Font("宋体", Font.BOLD + Font.ITALIC, 20));
            }
        });

    }
}
