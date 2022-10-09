import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LyftRideCalculator{

  public static void main(String [] args){
  JFrame window= new JFrame("LyftRide");

  JPanel panel1= new JPanel();
  JPanel panel2= new JPanel();
  JPanel panel3= new JPanel();
  JPanel panel4= new JPanel();

  panel1.setLayout(new BorderLayout());
  panel2.setLayout(new GridLayout(0,1));
  panel3.setLayout(new GridLayout(3,2));




  JTextArea textArea1= new JTextArea("pay is calculated by 5+(3*distance)+(0.2*time)");
  JTextArea textArea2= new JTextArea("pickup fee: $5");
  JTextArea textArea3= new JTextArea("time fee:$.20/minute");
  JTextArea textArea4= new JTextArea("ride distance in miles");
  JTextArea textArea5= new JTextArea("ride time in minutes");
  JTextArea textArea6= new JTextArea("pay for the ride");
  JTextArea textArea7= new JTextArea("$13.0");
  JTextArea textArea8= new JTextArea("distance fee:$3/mile");


  JTextField textfield1= new JTextField("2");
  JTextField textfield2= new JTextField("10");


  JButton button1 = new JButton("calculate pay");

  panel1.add(new JLabel("<html><h1>LyftRideCalculator</h1></html>"),BorderLayout.PAGE_END);

  panel2.add(textArea1);
  panel2.add(textArea2);
  panel2.add(textArea8);
  panel2.add(textArea3);
  panel3.add(textArea4);
  panel3.add(textfield1);
  panel3.add(textArea5);
  panel3.add(textfield2);
  panel3.add(textArea6);
  panel3.add(textArea7);
  panel4.add(button1);



  panel2.setPreferredSize(new Dimension (125,1));

  panel3.setBackground(new Color(255,255,0));
  textArea4.setBackground(new Color(255,255,0));
  textArea5.setBackground(new Color(255,255,0));
  textArea6.setBackground(new Color(255,255,0));
  textArea7.setBackground(new Color(255,255,0));


  panel1.add(textArea1,BorderLayout.PAGE_END);
  panel1.add(panel2,BorderLayout.LINE_START);
  panel1.add(panel3,BorderLayout.CENTER);
  panel1.add(panel4,BorderLayout.LINE_END);

  window.setContentPane(panel1);
  window.setSize(550,200);
  window.setResizable(false);
  window.setLocation(100,100);
  window.setVisible(true);

  button1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
      int dist=Integer.parseInt(textfield1.getText().trim());
      int time=Integer.parseInt(textfield2.getText().trim());

      textArea7.setText(5+(3*dist)+(.2*time)+"");
    }
  });

  }
}
