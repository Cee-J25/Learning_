/**@author Cee_J*/
// import java.awt.desktop.UserSessionEvent;
 import javax.swing.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

public class Jul_23 {
//Creating Live Admin login users to say the least 
    private static String usernames[] = {"Cee J","Rasta","Lindo","Gipson","","","","","","","","","","","","",""

    };
    private static String passwords[] = {"@NiggaPlz","Why_Not_4me","@CeeJ1234","Cee_J","","","","","","","","","","","","",""

    };
//This is where the main code runs, The frame that holds all the buttons and labels is created here
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
//Panel in with the labels, buttons and edits will be placed
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

    }
//Panel, set to cover the whole frame
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
//First label created to get the user to type in their details
        JLabel userLabel = new JLabel("Username: ");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
//The password labels and edit for the user to type in the info...
        JLabel passLabel = new JLabel("Password: ");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);
        JTextField passText = new JTextField(20);
        passText.setBounds(100,50,165,25);
        panel.add(passText);
//The login button which is set to get the variables typed in and has a function to check if the information typed in is true or false in which if it is falsde the "Invalid login" message will appear and things will sort themselves out...
        JButton loginB = new JButton("Login");
        loginB.setBounds(10,80,80,25);
        panel.add(loginB);
        //The login button which is set to get the variables typed in and has a function to check if the information typed in is true or false in which if it is falsde the "Invalid login" message will appear and things will sort themselves out...
        loginB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = passText.getText();

                if (authenticate(user, password)) {
                    JOptionPane.showMessageDialog(null,"Welcome back " + user);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login!!");

                }
            }
        });
    }
//This is the function that was previously discussed...
    private static  boolean authenticate(String user, String password){
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(user) && passwords[i].equals(password)) {
                return true;
            }
            
        }
        return false;
    }
};
    
