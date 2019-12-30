package inputoutput;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class registration {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private final ButtonGroup buttonGroup = new ButtonGroup();

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
registration window = new registration();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public registration() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 464);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("User Application Form");
lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
lblNewLabel.setBounds(167, 25, 152, 14);
frame.getContentPane().add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("FIRST NAME");
lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_1.setBounds(32, 61, 74, 14);
frame.getContentPane().add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("LAST NAME");
lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_2.setBounds(32, 102, 74, 14);
frame.getContentPane().add(lblNewLabel_2);

JLabel lblNewLabel_3 = new JLabel("DOB");
lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_3.setBounds(32, 143, 46, 14);
frame.getContentPane().add(lblNewLabel_3);

JLabel lblNewLabel_4 = new JLabel("PH.NO.");
lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_4.setBounds(32, 184, 46, 14);
frame.getContentPane().add(lblNewLabel_4);

JLabel lblNewLabel_5 = new JLabel("GENDER");
lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_5.setBounds(32, 223, 61, 14);
frame.getContentPane().add(lblNewLabel_5);

JLabel lblNewLabel_6 = new JLabel("E-Mail");
lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
lblNewLabel_6.setBounds(32, 261, 46, 14);
frame.getContentPane().add(lblNewLabel_6);

JTextArea textArea = new JTextArea();
textArea.setBounds(32, 311, 343, 125);
frame.getContentPane().add(textArea);

textField = new JTextField();
textField.setBounds(147, 58, 86, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setBounds(147, 99, 86, 20);
frame.getContentPane().add(textField_1);
textField_1.setColumns(10);

textField_2 = new JTextField();
textField_2.setBounds(147, 140, 86, 20);
frame.getContentPane().add(textField_2);
textField_2.setColumns(10);

textField_3 = new JTextField();
textField_3.setBounds(147, 181, 86, 20);
frame.getContentPane().add(textField_3);
textField_3.setColumns(10);

textField_4 = new JTextField();
textField_4.setBounds(147, 258, 86, 20);
frame.getContentPane().add(textField_4);
textField_4.setColumns(10);

JRadioButton rbd = new JRadioButton("F");
buttonGroup.add(rbd);
rbd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
rbd.setBounds(147, 219, 38, 23);
frame.getContentPane().add(rbd);

JRadioButton rdb1 = new JRadioButton("M");
rdb1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
rdb1.setBounds(187, 219, 46, 23);
frame.getContentPane().add(rdb1);

JButton btnNewButton = new JButton("SUBMIT");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String fname=textField.getText();
String lname=textField_1.getText();
String dob=textField_2.getText();
String phno=textField_3.getText();
String mail=textField_4.getText();
String gender;
if(rbd.isSelected()) {
gender = "Female";

}
else
{
gender="Male";
}
//JOptionPane.showMessageDialog(textArea,"  \n");
textArea.setText("Registration Sucessful!! Your details are \n"+"FNAME \t "+fname+"\n"+"LNAME \t"+lname+"\n"+"DOB \t"+dob+"\n"+" PH.NO. \t"+phno+"\n"+"E-Mail \t"+mail+"\n"+"GENDER \t"+gender);

}
});
btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
btnNewButton.setBounds(286, 139, 89, 23);
frame.getContentPane().add(btnNewButton);
}
}
