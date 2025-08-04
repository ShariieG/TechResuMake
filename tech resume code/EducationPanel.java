import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class EducationPanel extends JPanel {
    private JButton bttnAdd;
    private JButton bttnSave;
    private JButton bttnClear;

    private ArrayList<Education> educationArray = new ArrayList<>();
    private int countAddClicks = 1;

    private Image background;

    public EducationPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints mainGbc = new GridBagConstraints();

        background = new ImageIcon(getClass().getResource("background.jpg")).getImage();

        JPanel groupBox1 = new JPanel(new GridBagLayout());
        groupBox1.setOpaque(true);
        groupBox1.setBackground(new Color(255, 255, 255, 180)); // semi-transparent white
        groupBox1.setBorder(BorderFactory.createTitledBorder("Education Details"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;

        // School name
        JLabel lblSchoolName = new JLabel("School Name: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        groupBox1.add(lblSchoolName, gbc);

        JTextField txtfSchoolName = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfSchoolName, gbc);

        // Course name
        JLabel lblCourseName = new JLabel("Course Name: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        groupBox1.add(lblCourseName, gbc);

        JTextField txtfCourseName = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfCourseName, gbc);

        // Graduation year
        JLabel lblGradYear = new JLabel("Graduation Year: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        groupBox1.add(lblGradYear, gbc);

        JTextField txtfGradYear = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfGradYear, gbc);

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
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        groupBox1.add(bttnPanel, gbc);

        // Add group box to main panel
        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        add(groupBox1, mainGbc);

        // Action Listeners
        bttnAdd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String schoolName = txtfSchoolName.getText().trim();
                    String courseName = txtfCourseName.getText().trim();
                    String gradYear = txtfGradYear.getText().trim();

                    if (schoolName.isEmpty() || courseName.isEmpty() || gradYear.length() != 4) {
                        System.out.println("Please complete all fields with valid input.");
                        return;
                    }

                    Education education = new Education(schoolName, courseName, gradYear);
                    educationArray.add(education);

                    countAddClicks++;
                    if (countAddClicks > 5) {
                        txtfSchoolName.setEnabled(false);
                        txtfCourseName.setEnabled(false);
                        txtfGradYear.setEnabled(false);
                        bttnAdd.setEnabled(false);
                        System.out.println("Maximum of 5 entries reached.");
                    }
                }
            });

        bttnSave.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (Education edu : educationArray) {
                        System.out.println(edu); // Ensure toString() is implemented in Education
                    }
                    System.out.println("Education entries saved/displayed.");
                }
            });

        bttnClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    txtfSchoolName.setText("");
                    txtfCourseName.setText("");
                    txtfGradYear.setText("");

                    educationArray.clear();
                    countAddClicks = 1;

                    txtfSchoolName.setEnabled(true);
                    txtfCourseName.setEnabled(true);
                    txtfGradYear.setEnabled(true);
                    bttnAdd.setEnabled(true);

                    System.out.println("Cleared all education entries.");
                }
            });
    }

    public ArrayList<Education> getEducationEntries() {
        return new ArrayList<>(educationArray);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background,0,0,getWidth(),getHeight(),this);
    }
}
