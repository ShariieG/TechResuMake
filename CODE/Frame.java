import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;

public class Frame
{
    public static void main(String[] args){

        JFrame frame = new JFrame("Resume Application");
        JPanel personalPanel = new JPanel(new GridBagLayout()  );

        GridBagConstraints gridConstraint = new GridBagConstraints();

        frame.setSize(600,500);
        frame.setLayout(new BorderLayout());

        //Personal details labels
        JLabel lblTitle = new JLabel("Resume Application");

        JLabel lblName = new JLabel("Name(s): ");
        gridConstraint.gridx=0;
        gridConstraint.gridy=0;
        personalPanel.add(lblName,gridConstraint);

        JLabel lblSurname = new JLabel("Surname: ");
        gridConstraint.gridx=0;
        gridConstraint.gridy=1;
        personalPanel.add(lblSurname,gridConstraint);

        JLabel lblEmail = new JLabel("Email Address: ");
        gridConstraint.gridx=0;
        gridConstraint.gridy=2;
        personalPanel.add(lblEmail,gridConstraint);

        JLabel lblCity = new JLabel("City: ");
        gridConstraint.gridx=0;
        gridConstraint.gridy=3;
        personalPanel.add(lblCity,gridConstraint);

        JLabel lblPhoneNo = new JLabel("Phone Number: ");
        gridConstraint.gridx=0;
        gridConstraint.gridy=4;
        personalPanel.add(lblPhoneNo,gridConstraint);

        JLabel lblGithub = new JLabel("Github link: ");
        gridConstraint.gridx=0;
        gridConstraint.gridy=5;
        personalPanel.add(lblGithub,gridConstraint);

        JLabel lblLinkedIn = new JLabel("Linkein link");
        gridConstraint.gridx=0;
        gridConstraint.gridy=6;
        personalPanel.add(lblLinkedIn,gridConstraint);
        
        //Personal Details TextFields
        JTextField txtfName = new JTextField();
        txtfName.setPreferredSize(new Dimension(200,24));
        gridConstraint.gridx =1;
        gridConstraint.gridy =0;
        personalPanel.add(txtfName,gridConstraint);

    
        JTextField txtfSurname = new JTextField("");
        txtfSurname.setPreferredSize(new Dimension(200,24));
        gridConstraint.gridx =1;
        gridConstraint.gridy =1;
        personalPanel.add(txtfSurname,gridConstraint);
        
        JTextField txtfEmail = new JTextField("");
        txtfEmail.setPreferredSize(new Dimension(200,24));
        gridConstraint.gridx =1;
        gridConstraint.gridy =2;
        personalPanel.add(txtfEmail,gridConstraint);
        
        JTextField txtfCity = new JTextField("");
        txtfCity.setPreferredSize(new Dimension(200,24));
        gridConstraint.gridx =1;
        gridConstraint.gridy =3;
        personalPanel.add(txtfCity,gridConstraint);
        
        JTextField txtfPhoneNo = new JTextField("");
        txtfPhoneNo.setPreferredSize(new Dimension(200,24));
        gridConstraint.gridx =1;
        gridConstraint.gridy =4;
        personalPanel.add(txtfPhoneNo,gridConstraint);
        
        JTextField txtfGithub = new JTextField("");
        txtfGithub.setPreferredSize(new Dimension(200,24));
        gridConstraint.gridx =1;
        gridConstraint.gridy =5;
        personalPanel.add(txtfGithub,gridConstraint);
        
        JTextField txtfLinkedIn = new JTextField();
        txtfLinkedIn.setPreferredSize(new Dimension(200,24));
        gridConstraint.gridx =1;
        gridConstraint.gridy =6;
        personalPanel.add(txtfLinkedIn,gridConstraint);

        //add button
        JButton bttnSave= new JButton("Save");

        //do an action on a button
        bttnSave.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    System.out.println("Hello Sharon");
                }
            });

        //POPULATE THE DESIGN PANEL
        // personalPanel.add(lblTitle,BorderLayout.NORTH);
        // personalPanel.add(lblName,BorderLayout.NORTH);
        // personalPanel.add(lblTitle,BorderLayout.NORTH);

        //POPULATE THE FRAME
        frame.add(lblTitle,BorderLayout.NORTH);
        frame.add(personalPanel,BorderLayout.CENTER);
        frame.add(bttnSave,BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

       
       
    }
}