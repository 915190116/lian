import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI
 *
 * @author Lian
 * @create 2018-06-28 下午3:42
 **/
public class CopyText {
    public static void main(String[] args) {
        JFrame frame = new JFrame("复制文字");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,5,15));
        JButton button = new JButton("拷贝");
        JPanel panel = new JPanel(new GridLayout(2,1,5,5));

        JTextArea textArea = new JTextArea("", 6, 20);
        JTextArea textArea1 = new JTextArea("", 6, 20);

        frame.add(button);
        frame.add(panel);
        panel.add(new JScrollPane(textArea));
        panel.add(new JScrollPane(textArea1));
        frame.setSize(350, 270);

        textArea.setLineWrap(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textArea.getSelectedText();
                if (text != null && !"".equals(text)) {
                    textArea1.replaceSelection(text);
                }
            }
        });
    }
}
