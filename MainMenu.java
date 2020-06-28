import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.BevelBorder;

public class MainMenu extends javax.swing.JFrame implements ActionListener {

private static JLabel mainmenuLabel;
private JPanel jPanel1;
private JButton jButton1;
private JButton jButton2;
private JButton jButton3;
private JButton jButton4;
private JButton jButton5;
private JButton jButton6;
private JPanel ButtonsPanel;
private JLabel jLab1;

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("hello");

SwingUtilities.invokeLater(new Runnable() {
public void run() {
MainMenu inst = new MainMenu();
inst.setLocationRelativeTo(null);
inst.setVisible(true);
}
});

}

public MainMenu() {
super();
initGUI();
}

private void initGUI() {
try {

JPanel panel = new JPanel();

panel.setLayout(null);

mainmenuLabel = new JLabel("MAIN MENU");
mainmenuLabel.setFont(new Font("Times New Roman",Font.ITALIC, 20));
mainmenuLabel.setBounds(60, 20, 500, 40);
panel.add(mainmenuLabel);
panel.setBounds(15, 5, 250, 80);
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
ButtonsPanel.setBounds(15, 100, 250, 230);
ButtonsPanel.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));

//different button options,user can select list of choices. 
jButton1 = new JButton();
ButtonsPanel.add(jButton1);
jButton1.setText("1. Add Book");
jButton1.setPreferredSize(new java.awt.Dimension(120, 30));
jButton1.addActionListener(this);

jButton2 = new JButton();
ButtonsPanel.add(jButton2);
jButton2.setText("2. Delete Book");
jButton2.setPreferredSize(new java.awt.Dimension(120, 30));
jButton2.addActionListener(this);

jButton3 = new JButton();
ButtonsPanel.add(jButton3);
jButton3.setText("3. Edit Book");
jButton3.setPreferredSize(new java.awt.Dimension(120, 30));
jButton3.addActionListener(this);

jButton4 = new JButton();
ButtonsPanel.add(jButton4);
jButton4.setText("4. Search Book");
jButton4.setPreferredSize(new java.awt.Dimension(120, 30));
jButton4.addActionListener(this);

jButton5 = new JButton();
ButtonsPanel.add(jButton5);
jButton5.setText("5. Display");
jButton5.setPreferredSize(new java.awt.Dimension(120, 30));
jButton5.addActionListener(this);

jButton6 = new JButton();
ButtonsPanel.add(jButton6);
jButton6.setText("6. Exit");
jButton6.setPreferredSize(new java.awt.Dimension(120, 30));
jButton6.addActionListener(this);

pack();
setSize(300, 400);
} catch (Exception e) {
e.printStackTrace();
}
}

public void actionPerformed(ActionEvent e) {
try {
if (e.getSource() == jButton1) {
	this.dispose();
	AddBook c = new AddBook();
	c.setVisible(true);
}

else if (e.getSource() == jButton2) {
	this.dispose();
	DeleteBook c = new DeleteBook();
	c.setVisible(true);
}

else if (e.getSource() == jButton3) {
	this.dispose();
	EditBook c = new EditBook();
	c.setVisible(true);
}

else if (e.getSource() == jButton4) {
	this.dispose();
	SearchBook c = new SearchBook();
	c.setVisible(true);
}

else if (e.getSource() == jButton5) {
	this.dispose();
	DisplayBook c = new DisplayBook();
	c.setVisible(true);
}

else if (e.getSource() == jButton6) {
	this.dispose();
	System.exit(0);
}


} catch (Exception ex) {
System.out.println(ex);
}
}
}


