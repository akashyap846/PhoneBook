import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
class B
{
B()
{
JFrame f=new JFrame("Add");
JButton b=new JButton("Save");
Label l1=new Label("   Name");
Label l2=new Label("   Contect");
Label l3=new Label("   City");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Panel p1=new Panel();
Panel p2=new Panel();
Panel p3=new Panel();
f.add(p1);
f.add(p2);
f.add(p3);
p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
p3.setLayout(new FlowLayout(FlowLayout.CENTER));
p1.add(l1);
l1.setFont(new Font("serif",Font.BOLD,30));
p1.add(l2);
l2.setFont(new Font("serif",Font.BOLD,30));
p1.add(l3);
l3.setFont(new Font("serif",Font.BOLD,30));
p2.add(t1);
t1.setFont(new Font("serif",Font.BOLD,40));
p2.add(t2);
t2.setFont(new Font("serif",Font.BOLD,40));
p2.add(t3);
t3.setFont(new Font("serif",Font.BOLD,40));
p3.add(b);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
PrintWriter pw=new PrintWriter(new FileWriter(new File("C:\\Users\\akash\\Documents\\55\\numbers.txt"),true));
pw.println(t1.getText());
pw.println(t2.getText());
pw.println(t3.getText());
JOptionPane.showMessageDialog(null,"Data Is Saved");
pw.close();
pw.flush();
t1.setText("");
t2.setText("");
t3.setText("");
}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}
}
});
b.setFont(new Font("serif",Font.BOLD,30));
f.setSize(600,350);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
p1.setBounds(0,0,300,200);
p2.setBounds(300,0,300,200);
p3.setBounds(0,200,600,150);
}
}