import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;  

public class DeleteBook extends JFrame implements ActionListener{  
	
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
    public String displayText() {
    String fileContent = "<HTML>";
    bklist = new ArrayList();
    
    try {
    	  //Array list to store books being remove.
  		  File file = new File("C:/Users/User/Desktop/Book.txt");
  		  Scanner scan = new Scanner(file);
  		
		  String nextLine = "";
  		  System.out.println(fileContent+"abc");
  		  while(scan.hasNextLine()) {
  			  nextLine = scan.nextLine();
  			  bklist.add(nextLine);
  			  cnt++;
  			  fileContent = fileContent.concat((nextLine)+ "<br>");
  			  System.out.println(fileContent);
  		  }
  		  fileContent = fileContent.concat("</Html>");  
  		  fileContent = fileContent.concat(Text.getText()+ "<HTML>");
  		  System.out.println(fileContent);

  } 
  catch(Exception e1)
  {
  System.out.println("delete try catch error"+ e1);
  
  }	
    
    return fileContent;
    
    }
    
    DeleteBook()
    {  
    	String fileContent = "<HTML>";

    	l1=new JLabel("Delete Book"); 
    	l1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        l1.setBounds(200,30,400,35); 
        l2=new JLabel("Books you have: "); 
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2.setBounds(100,100,300,50); 
		l3 = new JLabel(displayText());
        l3.setFont(new Font("Arial", Font.PLAIN, 20)); 
        l3.setBounds(100,0,500,500);
    	l4=new JLabel("I want to delete book:");  
    	l4.setFont(new Font("Arial", Font.PLAIN, 20)); 
        l4.setBounds(100,350,500,20); 
        l5=new JLabel("");  
    	l5.setFont(new Font("Arial", Font.PLAIN, 20)); 
        l5.setBounds(100,580,500,20); 
              
        JPanel panel = new JPanel();
        Text=new JTextField();  
        Text.setBounds(100,400,300,30);       
        panel.add(Text); 
        
        b1=new JButton("Delete");  
        b1.setBounds(100,460,300,30); 
        b2=new JButton("Back to Menu");  
        b2.setBounds(100,510,300,30);
    
        b1.addActionListener(this); 
        b2.addActionListener(this); 
       
        add(l1);add(l2);add(l3);add(l4);add(l5);add(Text);add(b1);add(b2);
        setSize(550,700);  
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
        int i= Integer.parseInt(Text.getText())-1;
        l5.setText("Reset label if there is no input validation error");
		bklist.remove(i);
        String fileContent = "";
        /* For Loop for iterating ArrayList */
        System.out.println("For Loop");
        for (int counter = 0; counter < bklist.size(); counter++) { 
  	    fileContent = fileContent.concat(bklist.get(counter)+ "\n");
  
            System.out.println(bklist.get(counter)); 		
        }  
        
        l5.setText("edit action");
try {
	  FileWriter writer = new FileWriter("C:/Users/User/Desktop/Book.txt");
	  writer.write(fileContent);
	  writer.close();	  
} 
catch(Exception e1)
{
System.out.println("delete try catch error"+ e1);
if (e1 instanceof NumberFormatException)
	throw new NumberFormatException();
}
l3.setText(displayText());
	   }
	   
    public static void main(String[] args) {  
        new DeleteBook(); 
    }
}
