import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

class A
{
A()
{
JFrame f=new JFrame("PhoneBook");
JButton b1=new JButton("Add contact");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
B z=new B();
}
});
JButton b2=new JButton("Search contact");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
C c=new C();
}
});
b1.setFont(new Font("serif",Font.BOLD,30));
b2.setFont(new Font("serif",Font.BOLD,30));
f.add(b1);
f.add(b2);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);  
f.setSize(400,200);
f.setVisible(true);
f.setLayout(new FlowLayout(FlowLayout.CENTER));
}
public static void main(String ar[])
{
A a=new A();
}
}