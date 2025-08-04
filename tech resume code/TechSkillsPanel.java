import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;

public class TechSkillsPanel extends JPanel
{
    private JButton bttnAdd;
    private JButton bttnSave;
    private JButton bttnClear;
    private ArrayList<TechSkills> techArray = new ArrayList<>();
    private int countAddClicks= 1;
    private Image background;
    
    public TechSkillsPanel(){
        //Create Panel
        setLayout(new GridBagLayout());

        background = new ImageIcon(getClass().getResource("background.jpg")).getImage();
        
        JPanel groupBox1 = new JPanel(new GridBagLayout());
        groupBox1.setOpaque(true);
        groupBox1.setBackground(new Color(255, 255, 255, 180)); // semi-transparent white
        groupBox1.setBorder(BorderFactory.createTitledBorder("Technical Skills"));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        
        //skill name field and label
        JLabel lblSkillName = new JLabel("Skill name: ");
        lblSkillName.setOpaque(true);
        gbc.gridx= 0;
        gbc.gridy= 0;
        groupBox1.add(lblSkillName,gbc);

        JTextField txtfSkillName= new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfSkillName,gbc);
        
        //proficiency level field and label
        JLabel lblPLevel = new JLabel("Proficiency level: ");
        lblPLevel.setOpaque(true);
        gbc.gridx= 0;
        gbc.gridy= 1;
        groupBox1.add(lblPLevel,gbc);
        
        JTextField txtfProficiencyLevel= new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfProficiencyLevel,gbc);

        //Create Buttons
        JPanel bttnGroupbox =new JPanel(new FlowLayout(FlowLayout.CENTER,15,10));
        bttnGroupbox.setOpaque(false);
        bttnAdd = new JButton("Add");
        bttnSave = new JButton("Save");
        bttnClear = new JButton("Clear");
        
        bttnGroupbox.add(bttnAdd);
        bttnGroupbox.add(bttnSave);
        bttnGroupbox.add(bttnClear);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        groupBox1.add(bttnGroupbox,gbc);

        GridBagConstraints gridConstraint = new GridBagConstraints();
        gridConstraint.gridx = 0;
        gridConstraint.gridy = 0;
        gridConstraint.anchor = GridBagConstraints.CENTER;
        this.add(groupBox1);
        
        //Create ActionListener
        bttnAdd.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent arg0){

                    //Extract text from text fields
                    String skillName = txtfSkillName.getText();
                    int proficiencyLevel = Integer.parseInt(txtfProficiencyLevel.getText());
                    techArray.add(new TechSkills(skillName,proficiencyLevel));

                    if(countAddClicks >=5){
                        txtfSkillName.setEnabled(false);      
                        txtfProficiencyLevel.setEnabled(false);
                        bttnAdd.setEnabled(false);
                        
                    }

                    System.out.println(countAddClicks);
                    countAddClicks++;
                }
            });

        bttnSave.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){

                    for(TechSkills array : techArray){
                        System.out.println(array);
                    }
                    System.out.println("Successfully displayed skills.");
                }
            });

        bttnClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    txtfSkillName.setText("");
                    txtfProficiencyLevel.setText("");
                    techArray.clear();
                    countAddClicks = 1;
                    txtfSkillName.setEnabled(true);      
                    txtfProficiencyLevel.setEnabled(true);
                    bttnAdd.setEnabled(true);
                    System.out.println("Cleared all entries.");
                }
            });

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background,0,0,getWidth(),getHeight(),this);
    }
    public JButton getSaveButton() {
        return bttnSave;
    }
    
    public ArrayList<TechSkills> getTechSkills() {
    return new ArrayList<>(techArray);
}

}