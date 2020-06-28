import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;  

public class Purchase extends JFrame implements ActionListener{  
	
	JLabel l1;
    JLabel l2;  
    JLabel l3; 
    JTextField budgetText;
    JCheckBox cb1,cb2,cb3;  
    JButton b;  
    JButton b1;
    JButton b2;
    
    Purchase()
    {  
    	l1=new JLabel("What can I get?"); 
    	l1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        l1.setBounds(50,30,400,35); 
    	l2=new JLabel("What is your budget? (RM) ");  
    	l2.setFont(new Font("Arial", Font.PLAIN, 18)); 
        l2.setBounds(50,95,500,20); 
        l3=new JLabel("Do you want these features?"); 
        l3.setFont(new Font("Arial", Font.PLAIN, 18)); 
        l3.setBounds(50,145,300,20);  
        
        JPanel panel = new JPanel();
        budgetText=new JTextField();  
        budgetText.setBounds(300,95,50,26);
       
        panel.add(budgetText);

        cb1=new JCheckBox("Read in dark");  
        cb1.setFont(new Font("Arial", Font.PLAIN, 17)); 
        cb1.setBounds(50,190,150,20);  
        cb2=new JCheckBox("Audio");  
        cb2.setFont(new Font("Arial", Font.PLAIN, 17)); 
        cb2.setBounds(50,230,150,20);  
        cb3=new JCheckBox("Don't need power");
        cb3.setFont(new Font("Arial", Font.PLAIN, 17)); 
        cb3.setBounds(50,270,180,20);  
        b=new JButton("Submit");  
        b.setBounds(50,330,80,30); 
        b1=new JButton("Clear");  
        b1.setBounds(180,330,80,30);
        b2=new JButton("Main Menu");  
        b2.setBounds(310,330,100,30);
        b.addActionListener(this);  
        b1.addActionListener(this);  
        b2.addActionListener(this);
        add(l1);add(l2);add(budgetText);add(l3);add(cb1);add(cb2);add(cb3);add(b);add(b1);add(b2);
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
  
    
	public void actionPerformed(ActionEvent e)
	{  
		if (e.getSource() == b2) {
			this.dispose();
			MainMenu c = new MainMenu();
			c.setVisible(true);
		}
		
        String msg="";  
        if(cb1.isSelected()){   
            msg="Read in dark";  
        }  
        if(cb2.isSelected()){  
            msg="Audio";  
        }  
        if(cb3.isSelected()){  
            msg="Don't need power";  
        }  
        if(cb1.isSelected()&&cb2.isSelected()){  
          msg="Read In dark & Audio";  
        }  
        if(cb1.isSelected()&&cb3.isSelected()){  
            msg="No available option";  
        }  
        if(cb2.isSelected()&&cb3.isSelected()){  
            msg="No available option";  
        }  
        

	String budget = budgetText.getText();
	String msg1=""; 
    int a=Integer.parseInt(budget);

	if ((a > 0) && (a <= 50)) {
	  System.out.println("Printed Book");
	  msg1="Printed Book";
	} 
	else if((a > 50) && (a <200)) {
	  System.out.println("Printed Book,EBook");
	  msg1="Printed Book, EBook";
	}  
	else if (a >=200) {
  	 System.out.println("Printed Book, EBook, Audio Book");
  	 msg1="Printed Book, EBook, Audio Book";
  	}
	
	 msg1+="\n";  
     JOptionPane.showMessageDialog(this,"Book Type: "+msg1 + "Feature: "+ msg + "\n" +"Price: "+"RM"+a);
     
	   if (e.getSource() == b1) { 
        String def = ""; 
        budgetText.setText(def); 
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
	   }
	   }
	   
    public static void main(String[] args) {  
        new Purchase(); 
    }
}



    
   
