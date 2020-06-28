import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;  

public class AddBook extends JFrame implements ActionListener{  
	
 	JLabel l1;
    JLabel l2;  
    JTextField Text;
    JButton b;  
    JButton b1;
    
    AddBook()
    {  
    	l1=new JLabel("Add Book"); 
    	l1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        l1.setBounds(150,30,400,35); 
    	l2=new JLabel("Title:");  
    	l2.setFont(new Font("Arial", Font.PLAIN, 23)); 
        l2.setBounds(50,95,500,20); 
       
        JPanel panel = new JPanel();
        Text=new JTextField();  
        Text.setBounds(150,95,200,26);
       
        panel.add(Text);
 
        b=new JButton("Add Book");  
        b.setBounds(50,150,300,30);      
        b1=new JButton("Back to Menu");  
        b1.setBounds(50,200,300,30);
        b.addActionListener(this);  
        b1.addActionListener(this);
        add(l1);add(l2);add(Text);add(b);add(b1);
        setSize(440,350);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
  
    
	public void actionPerformed(ActionEvent e)
	{  

try {
          //Array list to store books being add.	
		  File file = new File("C:/Users/User/Desktop/Book.txt");
		  Scanner scan = new Scanner(file);
		  
		  String fileContent = "";
		  System.out.println(fileContent+"abc");
		  while(scan.hasNextLine()) {
			  fileContent = fileContent.concat(scan.nextLine()+ "\n");
			  System.out.println(fileContent);
		  }
		  
		  fileContent = fileContent.concat(Text.getText()+ "\n");
		  System.out.println(fileContent);
		  FileWriter writer = new FileWriter("C:/Users/User/Desktop/Book.txt");
		  writer.write(fileContent);
		  writer.close();
		  
} 
catch(Exception e1)
{
System.out.println("add try catch error"+ e1);

}

		if (e.getSource() == b1) {
			this.dispose();
			MainMenu c = new MainMenu();
			c.setVisible(true);
		}	

	   }
	   
    public static void main(String[] args) {  
        new AddBook(); 
    }
}



    
   
