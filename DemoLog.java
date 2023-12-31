package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DemoLog extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   DemoLog() {
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField();
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Please Login Here !");
      setSize(300,200);
      setVisible(true);
   }
   public static void main(String[] args) {
      new DemoLog();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
      int error =1;
      
    	  if (userName.trim().equals("admin") && password.trim().equals("admin")) {
    	  		message.setText(" Hello " + userName + "");
      			} 
      		else {
      			message.setText(" Invalid user.. ");
      			error++;
          	  if (error == 3) {
          		  System.out.println("3 attempts failed!!! Exiting...");
          		  System.exit(0);
          	  }
      }
    	  
   }
}