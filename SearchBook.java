import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;  

public class SearchBook extends JFrame implements ActionListener{  
	
	JLabel l1;
    JLabel l2;  
    JLabel l3; 
    JLabel l4; 
    JLabel l5; 
    JTextField Text;
    JButton b1;  
    JButton b2;

    int cnt=0;
    ArrayList bklist = new ArrayList();
    SearchBook()
    {   
    	try {
    	  //Array list of books. 
		  File file = new File("C:/Users/User/Desktop/Book.txt");
		  Scanner scan = new Scanner(file);
		  String fileContent = "";
		  System.out.println(fileContent+"abc");
		  while(scan.hasNextLine()) {
			  bklist.add(scan.nextLine());
			  cnt++;
			  fileContent = fileContent.concat(scan.nextLine()+ "\n");
			  System.out.println(fileContent);
  
		  }
		  
		  fileContent = fileContent.concat(Text.getText()+ "abcde\n");
		  System.out.println(fileContent);
		  FileWriter writer = new FileWriter("C:/Users/User/Desktop/Book.txt");
		  writer.write(fileContent);
		  writer.close();
		  
} 
catch(Exception e1)
{
System.out.println("search try catch error"+ e1);
}
 
    	l1=new JLabel("Search Book"); 
    	l1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        l1.setBounds(180,30,400,35); 
        l2=new JLabel("Amount of books you have: "+cnt); 
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2.setBounds(90,100,300,50); 
    	l3=new JLabel("I want to search book number:");  
    	l3.setFont(new Font("Arial", Font.PLAIN, 20)); 
        l3.setBounds(90,160,500,20); 
        l4=new JLabel("The book is:");  
    	l4.setFont(new Font("Arial", Font.PLAIN, 20)); 
        l4.setBounds(90,360,500,20);
        l5=new JLabel("");  
    	l5.setFont(new Font("Arial", Font.PLAIN, 20)); 
        l5.setBounds(90,400,500,20); 
       
        JPanel panel = new JPanel();
        Text=new JTextField();  
        Text.setBounds(90,190,300,30);
       
        panel.add(Text);
 
        b1=new JButton("Search");  
        b1.setBounds(90,250,300,30); 
        b2=new JButton("Back to Menu");  
        b2.setBounds(90,300,300,30);
    
        b1.addActionListener(this); 
        b2.addActionListener(this); 
       
        add(l1);add(l2);add(l3);add(l4);add(l5);add(Text);add(b1);add(b2);
        setSize(530,520);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
	public void actionPerformed(ActionEvent e)throws NumberFormatException
	{  
		if (e.getSource() == b2) {
			this.dispose();
			MainMenu c = new MainMenu();
			c.setVisible(true);
		}
		 l5.setText("Set display of validation error");
        String s="200";
        int i= Integer.parseInt(Text.getText());
       
        l4.setText("The book is: "+ bklist.get(i));
        l5.setText("");
	   }
	   

    public static void main(String[] args) {  
        new SearchBook(); 
    }
}



    
   
