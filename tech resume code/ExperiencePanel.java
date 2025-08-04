import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class ExperiencePanel extends JPanel {
    private JTextField txtfStartDate, txtfEndDate, txtfAction, txtfSkillsGained, txtfResult, txtfCompName, txtfPosition;
    private JButton bttnAdd, bttnSave, bttnClear;

    private ArrayList<Experience> experienceArray = new ArrayList<>();
    private int countAddClicks = 1;

    private Image background;

    public ExperiencePanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints mainGbc = new GridBagConstraints();

        background = new ImageIcon(getClass().getResource("background.jpg")).getImage();
        JPanel groupBox = new JPanel(new GridBagLayout());
        groupBox.setOpaque(true);
        groupBox.setBackground(new Color(255, 255, 255, 180));
        groupBox.setBorder(BorderFactory.createTitledBorder("Work Experience"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;

        // Labels and fields
        JLabel lblStartDate = new JLabel("Start Date:");
        lblStartDate.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 0;
        groupBox.add(lblStartDate, gbc);

        txtfStartDate = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfStartDate, gbc);

        JLabel lblEndDate = new JLabel("End Date:");
        lblEndDate.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 1;
        groupBox.add(lblEndDate, gbc);

        txtfEndDate = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfEndDate, gbc);

        JLabel lblAction = new JLabel("Action:");
        lblAction.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 2;
        groupBox.add(lblAction, gbc);

        txtfAction = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfAction, gbc);

        JLabel lblSkillsGained = new JLabel("Skills Gained:");
        lblSkillsGained.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 3;
        groupBox.add(lblSkillsGained, gbc);

        txtfSkillsGained = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfSkillsGained, gbc);

        JLabel lblResult = new JLabel("Result:");
        lblResult.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 4;
        groupBox.add(lblResult, gbc);

        txtfResult = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfResult, gbc);

        JLabel lblCompName = new JLabel("Company Name:");
        lblCompName.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 5;
        groupBox.add(lblCompName, gbc);

        txtfCompName = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfCompName, gbc);

        JLabel lblPosition = new JLabel("Position:");
        lblPosition.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 6;
        groupBox.add(lblPosition, gbc);

        txtfPosition = new JTextField(20);
        gbc.gridx = 1;
        groupBox.add(txtfPosition, gbc);

        // Button panel
        JPanel bttnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bttnPanel.setOpaque(false);
        bttnAdd = new JButton("Add");
        bttnSave = new JButton("Save");
        bttnClear = new JButton("Clear");

        bttnPanel.add(bttnAdd);
        bttnPanel.add(bttnSave);
        bttnPanel.add(bttnClear);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        groupBox.add(bttnPanel, gbc);

        // Add groupBox to the main panel
        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        add(groupBox, mainGbc);

        // Action Listeners
        bttnAdd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String startDate = txtfStartDate.getText().trim();
                    String endDate = txtfEndDate.getText().trim();
                    String action = txtfAction.getText().trim();
                    String skillsGained = txtfSkillsGained.getText().trim();
                    String result = txtfResult.getText().trim();
                    String companyName = txtfCompName.getText().trim();
                    String compPosition = txtfPosition.getText().trim();

                    if (startDate.isEmpty() || endDate.isEmpty() || companyName.isEmpty()) {
                        System.out.println("Please complete the required fields.");
                        return;
                    }

                    Experience exp = new Experience(startDate, endDate, action, skillsGained, result, companyName, compPosition);
                    experienceArray.add(exp);

                    if (++countAddClicks > 5) {
                        disableFields();
                        System.out.println("Maximum of 5 entries reached.");
                    }

                    System.out.println("Experience added.");
                }
            });

        bttnSave.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (Experience exp : experienceArray) {
                        System.out.println(exp);
                    }
                    System.out.println("Successfully displayed experiences.");
                }
            });

        bttnClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    txtfStartDate.setText("");
                    txtfEndDate.setText("");
                    txtfAction.setText("");
                    txtfSkillsGained.setText("");
                    txtfResult.setText("");
                    txtfCompName.setText("");
                    txtfPosition.setText("");

                    experienceArray.clear();
                    countAddClicks = 1;
                    enableFields();

                    System.out.println("Cleared all entries.");
                }
            });
    }

    private void disableFields() {
        txtfStartDate.setEnabled(false);
        txtfEndDate.setEnabled(false);
        txtfAction.setEnabled(false);
        txtfSkillsGained.setEnabled(false);
        txtfResult.setEnabled(false);
        txtfCompName.setEnabled(false);
        txtfPosition.setEnabled(false);
        bttnAdd.setEnabled(false);
    }

    private void enableFields() {
        txtfStartDate.setEnabled(true);
        txtfEndDate.setEnabled(true);
        txtfAction.setEnabled(true);
        txtfSkillsGained.setEnabled(true);
        txtfResult.setEnabled(true);
        txtfCompName.setEnabled(true);
        txtfPosition.setEnabled(true);
        bttnAdd.setEnabled(true);
    }
    
    public ArrayList<Experience> getExperience() {
        return new ArrayList<>(experienceArray); 
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background,0,0,getWidth(),getHeight(),this);
    }
}
