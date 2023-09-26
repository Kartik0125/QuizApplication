package myjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{

	String name;
	int score;
	Score(String name,int score)
	{
		this.name=name;
		this.score=score;
		setBounds(400,150,750,550);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/unnamed.png"));
        setIconImage(logoIcon.getImage());
        setTitle("Java Quiz");
		
		//Image
		ImageIcon i1 = new ImageIcon(Login.class.getResource("/images/score.png"));
		Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,200,300,250);
		add(image);
		
		
		JLabel heading =new JLabel("Thank You "+name+" for playing Simple Minds");
		heading.setBounds(102,30,700,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel Score =new JLabel("Your Score is "+score);
		Score.setBounds(320,200,300,30);
		Score.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(Score);
		
		JButton playAgain=new JButton("PlayAgain");
        playAgain.setBounds(335,270,150,30);
        playAgain.setBackground(new Color(30,144,255));
        playAgain.setForeground(Color.white);
        playAgain.setFont(new Font("Tahoma",Font.PLAIN,18));
        playAgain.setEnabled(false);
        playAgain.addActionListener(this);
        playAgain.setEnabled(true); 
        add(playAgain);
		
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Score("Guest User",0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new Login();
	}
}
