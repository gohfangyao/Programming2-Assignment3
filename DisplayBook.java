import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;  

public class DisplayBook extends JFrame implements ActionListener{  
	
	JLabel l1;
    JLabel l2;     
    JLabel l3; 
    JButton b1;  

    DisplayBook()
    {  
    	 try {
    		 
    		 //Array list of books.	
			 File file = new File("C:/Users/User/Desktop/Book.txt");
			  Scanner scan = new Scanner(file);
			  
			  String fileContent = "<HTML>";
			  System.out.println(fileContent+"abc");
			  while(scan.hasNextLine()) {
				  fileContent = fileContent.concat(scan.nextLine()+ "<br>");
				  System.out.println(fileContent);
			  }
			  fileContent = fileContent.concat("</Html>");
		
    	l1=new JLabel("Display Book"); 
    	l1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        l1.setBounds(180,30,400,35); 
        l2=new JLabel("Books you have: "); 
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2.setBounds(100,100,300,50);  
        l3 = new JLabel(fileContent);
        l3.setFont(new Font("Arial", Font.PLAIN, 20)); 
        l3.setBounds(100,0,500,500);

        b1=new JButton("Back to Menu");  
        b1.setBounds(100,350,300,30);
        b1.addActionListener(this); 

        add(l1);add(l2);add(l3);add(b1);
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        
	} 
	catch(Exception e1)
	{
	System.out.println("display try catch error"+ e1);
	}
       
    }  
  
	public void actionPerformed(ActionEvent e)
	{  

		if (e.getSource() == b1) {
			this.dispose();
			MainMenu c = new MainMenu();
			c.setVisible(true);
		}
   
	   }
	   
    public static void main(String[] args) {  
        new DisplayBook(); 
        
    }
}



    
   
