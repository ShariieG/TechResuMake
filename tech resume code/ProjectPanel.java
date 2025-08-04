import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.Insets;

/**
 * Write a description of class ProjectPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProjectPanel extends JPanel
{
    private JButton bttnAdd;
    private JButton bttnSave;
    private JButton bttnClear;
    private ArrayList<Project> projectArray = new ArrayList<>();
    private int countAddClicks= 1;
    
    private Image background;
    public ProjectPanel(){
        setLayout(new GridBagLayout());
        GridBagConstraints mainGbc = new GridBagConstraints();

        background = new ImageIcon(getClass().getResource("background.jpg")).getImage();
        
        
        
        //Create Labels
        JPanel groupBox = new JPanel(new GridBagLayout());
        groupBox.setOpaque(true);
        groupBox.setBackground(new Color(255, 255, 255, 180)); // semi-transparent white
        groupBox.setBorder(BorderFactory.createTitledBorder("Projects"));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        
        JLabel lblProjName = new JLabel("Project Name: ");
        lblProjName.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 0;
        groupBox.add(lblProjName, gbc);
        
        JTextField txtfProjName = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfProjName, gbc);

        JLabel lblContext = new JLabel("Context: ");
        lblContext.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 1;
        groupBox.add(lblContext, gbc);

        JTextField txtfContext = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfContext, gbc);

        JLabel lblAction = new JLabel("Action: ");
        lblAction.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 2;
        groupBox.add(lblAction, gbc);

        JTextField txtfAction = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfAction, gbc);
        
        JLabel lblResult = new JLabel("Result: ");
        lblResult.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 3;
        groupBox.add(lblResult, gbc);


        JTextField txtfResult = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfResult, gbc);

        
        //Create Buttons
        JPanel bttnGroupBox = new JPanel(new FlowLayout(FlowLayout.CENTER,10,15));
        bttnGroupBox.setOpaque(false);
        bttnAdd = new JButton("Add");
        bttnSave = new JButton("Save");
        bttnClear = new JButton("Clear");
        
        bttnGroupBox.add(bttnAdd);
        bttnGroupBox.add(bttnSave);
        bttnGroupBox.add(bttnClear);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        groupBox.add(bttnGroupBox,gbc);

        mainGbc.gridx=0;
        mainGbc.gridy=0;
        this.add(groupBox,mainGbc);

        //Create ActionListener
        bttnAdd.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent arg0){

                    //Extract text from text fields
                    String projName = txtfProjName.getText();
                    String context= txtfContext.getText();
                    String action = txtfAction.getText();
                    String result= txtfResult.getText();

                    if(countAddClicks >=5){
                        txtfProjName.setEnabled(false);      
                        txtfContext.setEnabled(false);
                        txtfAction.setEnabled(false);
                        txtfResult.setEnabled(false);
                    }

                    System.out.println(countAddClicks);
                    countAddClicks++;
                }
            });

        bttnSave.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){

                    for(Project array : projectArray){
                        System.out.println(array);
                    }
                    System.out.println("Successfully displayed skills.");
                }
            });

        bttnClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    txtfProjName.setText("");
                    txtfContext.setText("");
                    txtfAction.setText("");
                    txtfResult.setText("");
                    projectArray.clear();
                    countAddClicks = 1;
                    txtfProjName.setEnabled(false);      
                    txtfContext.setEnabled(false);
                    txtfAction.setEnabled(false);
                    txtfResult.setEnabled(false);
                    System.out.println("Cleared all entries.");
                }
            });

    }
    public ArrayList<Project> getProjects() {
    return new ArrayList<>(projectArray);
}
     protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background,0,0,getWidth(),getHeight(),this);
    }
}