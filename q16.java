import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
class C
{
String d;
C()
{
JFrame f=new JFrame("Find");
JButton b=new JButton("Find");
Label l1=new Label("   Name");
Label l2=new Label("   Show number");
TextField t1=new TextField();
TextArea t2=new TextArea();
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
p2.add(t1);
t1.setFont(new Font("serif",Font.BOLD,30));
p2.add(t2);
t2.setFont(new Font("serif",Font.BOLD,60));
p3.add(b);
b.setFont(new Font("serif",Font.BOLD,30));
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
Scanner scr=new Scanner(new FileReader(new File("C:\\Users\\akash\\Documents\\55\\numbers.txt")));
String st=scr.nextLine();
d=t1.getText();
int count=0;
while((st)!=null)
{
if(st.equals(d)){count++;}
st=scr.nextLine();
if(count==1)
{
t2.append(st+"\n");
break;
}
}
scr.close();
}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}
}
});
f.setSize(600,350);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p1.setBounds(0,0,250,150);
p2.setBounds(250,0,350,150);
p3.setBounds(0,200,600,150);
}
}