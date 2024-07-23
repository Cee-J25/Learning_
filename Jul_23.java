/**@author Cee_J*/
 import java.awt.desktop.UserSessionEvent;
 import javax.swing.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

public class Jul_23 {

    private static String usernames[] = {"Cee J","Rasta","Lindo","Gipson","","","","","","","","","","","","",""

    };
    private static String passwords[] = {"@NiggaPlz","Why_Not_4me","@CeeJ1234","Cee_J","","","","","","","","","","","","",""

    };
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username: ");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password: ");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);

        JTextField passText = new JTextField(20);
        passText.setBounds(100,50,165,25);
        panel.add(passText);

        JButton loginB = new JButton("Login");
        loginB.setBounds(10,80,80,25);
        panel.add(loginB);

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
    private static  boolean authenticate(String user, String password){
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(user) && passwords[i].equals(password)) {
                return true;
            }
            
        }
        return false;
    }
};
    
