package myjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener{
	
	JButton start,back;
	String name;
	Rules(String name)
	{
		this.name=name;
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/unnamed.png"));
        setIconImage(logoIcon.getImage());
        setTitle("Java Quiz");
		
		//Heading
		JLabel heading=new JLabel("Welcome"+"  "+name+"  "+"to Quiz Master");
		heading.setBounds(200,20,700,30);
		heading.setFont(new Font("Times New Roman",Font.ITALIC,28));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		
		JLabel rules=new JLabel();
		rules.setBounds(20,90,700,430);
		rules.setFont(new Font("Tahoma",Font.PLAIN,18));
		rules.setText("<html>"+ 
		            "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
		            "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
		            "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
		            "4. Crying is allowed but please do so quietly." + "<br><br>" +
		            "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
		            "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
		            "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
		            "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
		       "<html>");
		add(rules);
		
		
		start = new JButton("Start");
		start.setBounds(430,500,100,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.white);
		start.addActionListener(this);
		add(start);
		
		
		
		back = new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		setSize(800,650);
		setLocation(340,100);
		setVisible(true);		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==start)
		{
			new Quiz(name);
		}
		else if(e.getSource()==back)
		{
			setVisible(false);
			new Login(); 
		}
		
	}
	
	
	public static void main(String args[])
	{
		new Rules("Guest");
		
	}

}
