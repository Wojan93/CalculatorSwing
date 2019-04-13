package com.ZDA;
import javax.swing.*;
import java.awt.event.*;
 
 
class Calc extends JFrame implements ActionListener {
	
	private static double a=0,b=0,result=0;
	private static int operator=0;
	
	
	public static void main(String[] a) {
		new Calc();
	}
	Calc()
	{
		
		JTextField t=new JTextField();
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		JButton b0=new JButton("0");
		JButton bdiv=new JButton("/");
		JButton bmul=new JButton("*");
		JButton bsub=new JButton("-");
		JButton badd=new JButton("+");
		JButton bdec=new JButton(".");
		JButton beq=new JButton("=");
		JButton bdel=new JButton("Delete");
		JButton bclr=new JButton("Clear");
		
		t.setBounds(30,40,580,50);
		b7.setBounds(40,100,100,80);
		b8.setBounds(180,100,100,80);
		b9.setBounds(320,100,100,80);
		bdiv.setBounds(480,100,100,80);
		
		b4.setBounds(40,220,100,80);
		b5.setBounds(180,220,100,80);
		b6.setBounds(320,220,100,80);
		bmul.setBounds(480,220,100,80);
		
		b1.setBounds(40,360,100,80);
		b2.setBounds(180,360,100,80);
		b3.setBounds(320,360,100,80);
		bsub.setBounds(480,360,100,80);
		
		bdec.setBounds(40,500,100,80);
		b0.setBounds(180,500,100,80);
		beq.setBounds(320,500,100,80);
		badd.setBounds(480,500,100,80);
		
		bdel.setBounds(60,650,150,80);
		bclr.setBounds(360,650,150,80);
		
		getContentPane().add(t);
		getContentPane().add(b7);
		getContentPane().add(b8);
		getContentPane().add(b9);
		getContentPane().add(bdiv);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		getContentPane().add(bmul);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(bsub);
		getContentPane().add(bdec);
		getContentPane().add(b0);
		getContentPane().add(beq);
		getContentPane().add(badd);
		getContentPane().add(bdel);
		getContentPane().add(bclr);
		
		setLayout(null);
		setVisible(true);
		setSize(700,1000);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			t.setText(t.getText().concat("1"));
		
		if(e.getSource()==b2)
			t.setText(t.getText().concat("2"));
		
		if(e.getSource()==b3)
			t.setText(t.getText().concat("3"));
		
		if(e.getSource()==b4)
			t.setText(t.getText().concat("4"));
		
		if(e.getSource()==b5)
			t.setText(t.getText().concat("5"));
		
		if(e.getSource()==b6)
			t.setText(t.getText().concat("6"));
		
		if(e.getSource()==b7)
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==b8)
			t.setText(t.getText().concat("8"));
		
		if(e.getSource()==b9)
			t.setText(t.getText().concat("9"));
		
		if(e.getSource()==b0)
			t.setText(t.getText().concat("0"));
		
		if(e.getSource()==bdec)
			t.setText(t.getText().concat("."));
		
		if(e.getSource()==badd)
		{
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		} 
		
		if(e.getSource()==bsub)
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		
		if(e.getSource()==bmul)
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		
		if(e.getSource()==bdiv)
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		
		if(e.getSource()==beq)
		{
			b=Double.parseDouble(t.getText());
		
			if (operator =1){
				result=a+b;
				break;
			}
			else if (operator =2){
			result=a-b;
					break;
			}
			else if (operator =3){
				result=a*b;
					break;
			}
			else if (operator =3) {
				if (b!=0) {
					result=a/b;
					break;
				}
				else {
					t.setText("nie mozna dzielic przez 0");
					break;
			}
			}
			else {
				result=0;
			}
				
		
			t.setText(""+result);
		}
		
		if(e.getSource()==bclr)
			t.setText("");
		
		if(e.getSource()==bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}		
	}
}
