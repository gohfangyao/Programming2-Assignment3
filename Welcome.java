import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.BevelBorder;

public class Welcome extends javax.swing.JFrame implements ActionListener {

private static JLabel welcomeLabel;
private JPanel jPanel1;
private JButton jButton1;
private JButton jButton2;
private JButton jButton3;
private JButton jButton4;
private JPanel jPanel2;
private JPanel ButtonsPanel;
private JLabel jLab1;

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("hello");

SwingUtilities.invokeLater(new Runnable() {
public void run() {
Welcome inst = new Welcome();
inst.setLocationRelativeTo(null);
inst.setVisible(true);
}
});

}

public Welcome() {
super();
initGUI();
}

private void initGUI() {
try {

JPanel panel = new JPanel();

panel.setLayout(null);

welcomeLabel = new JLabel("<HTML> WELCOME TO ABC BOOKSTORE "
		+ " <br> I want to know more about... </Html>");
welcomeLabel.setFont(new Font("Times New Roman",Font.ITALIC, 20));
welcomeLabel.setBounds(70, 60, 500, 40);
panel.add(welcomeLabel);
panel.setBounds(5, 5, 500, 150);
panel.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));

setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
jPanel1 = new JPanel();
getContentPane().add(jPanel1, BorderLayout.CENTER);
jPanel1.setLayout(null);

jPanel1.add(panel);

ButtonsPanel = new JPanel();
FlowLayout ButtonsPanelLayout = new FlowLayout();
jPanel1.add(ButtonsPanel);
ButtonsPanel.setLayout(ButtonsPanelLayout);
ButtonsPanel.setBounds(10, 180, 150, 180);
ButtonsPanel.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));

jButton1 = new JButton();
ButtonsPanel.add(jButton1);
jButton1.setText("Printed Book");
jButton1.setPreferredSize(new java.awt.Dimension(120, 23));
jButton1.addActionListener(this);

jButton2 = new JButton();
ButtonsPanel.add(jButton2);
jButton2.setText("Ebook");
jButton2.setPreferredSize(new java.awt.Dimension(120, 23));
jButton2.addActionListener(this);

jButton3 = new JButton();
ButtonsPanel.add(jButton3);
jButton3.setText("Audio Book");
jButton3.setPreferredSize(new java.awt.Dimension(120, 23));
jButton3.addActionListener(this);

jButton4 = new JButton();
ButtonsPanel.add(jButton4);
jButton4.setText("Find Out More");
jButton4.setPreferredSize(new java.awt.Dimension(120, 30));
jButton4.addActionListener(this);

jPanel2 = new JPanel();
jPanel1.add(jPanel2);
jPanel2.setLayout(null);
jPanel2.setBounds(150, 180, 360, 180);
jPanel2.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));

jLab1 = new JLabel("");
jLab1.setBounds(10, 50, 700, 50);
jPanel2.add(jLab1);

pack();
setSize(600, 500);
} catch (Exception e) {
e.printStackTrace();
}
}

public void actionPerformed(ActionEvent e) {
try {
if (e.getSource() == jButton1) {
jLab1.setFont(new Font("Arial", Font.PLAIN, 14)); 
jLab1.setBounds(70, 5, 1000, 100);
jLab1.setText("<HTML> -WORDS OF THE CONTENT <br> -HAVE HIGHLIGHT CONTENT <br> -BULKY </Html>");

} else if (e.getSource() == jButton2) {

jLab1.setBounds(70, 10, 1000, 120);
jLab1.setText("<HTML> -WORDS OF THE CONTENT<br> -HAVE HIGHLIGHT CONTENT <br> -NEED POWER TO READ <br>"
+ "-CAN READ IN DARK <br> -PROVIDE DICTIONARY </Html>");

} else if (e.getSource() == jButton3) {

jLab1.setBounds(70, 10, 1000, 120);
jLab1.setText("<HTML> -READ ALOUD OF CONTENT <br> -NEED POWER TO READ <br> -CAN READ IN DARK <br> "
+ "-CAN MULTI TASK WHILE LISTENING <br> -PROVIDE AUDIO </Html>");

} else if (e.getSource() == jButton4) {

jLab1.setBounds(70, 10, 1000, 120);
if(e.getSource()== jButton4) {
	this.dispose();
	Purchase c = new Purchase();
	c.setVisible(true);
}

}

} catch (Exception ex) {
System.out.println(ex);
}
}

}
