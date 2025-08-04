import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PersonalPanel extends JPanel {
    private JTextField txtfName, txtfSurname, txtfEmail, txtfCity, txtfPhoneNo, txtfGithub, txtfLinkedIn;
    private JButton bttnSave, bttnClear, bttnAdd;

    public ArrayList<PersonalDetails> personalList = new ArrayList<>();
    private int countAddClicks = 1;

    private Image backgroundImage;

    public PersonalPanel() {
        setLayout(new GridBagLayout());
        backgroundImage = new ImageIcon(getClass().getResource("background.jpg")).getImage();

        GridBagConstraints mainGbc = new GridBagConstraints();

        // === GroupBox-like wrapper panel ===
        JPanel groupBox1 = new JPanel(new GridBagLayout());
        groupBox1.setOpaque(true);
        groupBox1.setBackground(new Color(255, 255, 255, 180)); // semi-transparent white
        groupBox1.setBorder(BorderFactory.createTitledBorder("Personal Information"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;

        // Labels and Fields
        JLabel lblName = new JLabel("Name(s): ");
        lblName.setOpaque(true);
        gbc.gridx = 0; 
        gbc.gridy = 0;
        groupBox1.add(lblName, gbc);
        txtfName = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfName, gbc);

        JLabel lblSurname = new JLabel("Surname: ");
        lblSurname.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 1;
        groupBox1.add(lblSurname, gbc);

        txtfSurname = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfSurname, gbc);

        JLabel lblEmail = new JLabel("Email Address: ");
        lblEmail.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 2;
        groupBox1.add(lblEmail, gbc);

        txtfEmail = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfEmail, gbc);

        JLabel lblCity = new JLabel("City: ");
        lblCity.setOpaque(true);
        gbc.gridx = 0; 
        gbc.gridy = 3;
        groupBox1.add(lblCity, gbc);

        txtfCity = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfCity, gbc);

        JLabel lblPhoneNo = new JLabel("Phone Number: ");
        lblPhoneNo.setOpaque(true);
        gbc.gridx = 0; gbc.gridy = 4;
        groupBox1.add(lblPhoneNo, gbc);
        txtfPhoneNo = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfPhoneNo, gbc);

        JLabel lblGithub = new JLabel("Github link: ");
        lblGithub.setOpaque(true);
        gbc.gridx = 0; gbc.gridy = 5;
        groupBox1.add(lblGithub, gbc);
        txtfGithub = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfGithub, gbc);

        JLabel lblLinkedIn = new JLabel("LinkedIn link");
        lblLinkedIn.setOpaque(true);
        gbc.gridx = 0; gbc.gridy = 6;
        groupBox1.add(lblLinkedIn, gbc);
        txtfLinkedIn = new JTextField(20);
        gbc.gridx = 1;
        groupBox1.add(txtfLinkedIn, gbc);

        // === Button panel ===
        JPanel bttnGroupBox = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        bttnGroupBox.setOpaque(false);
        bttnAdd = new JButton("Add");
        bttnClear = new JButton("Clear");
        bttnSave = new JButton("Save");

        bttnGroupBox.add(bttnAdd);
        bttnGroupBox.add(bttnClear);
        bttnGroupBox.add(bttnSave);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        groupBox1.add(bttnGroupBox, gbc);

        // === Add wrapperPanel to the main panel ===
        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        mainGbc.anchor = GridBagConstraints.CENTER;
        add(groupBox1, mainGbc);

        // === Button Actions ===
        bttnSave.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    for (PersonalDetails pd : personalList) {
                        System.out.println(pd);
                    }
                    System.out.println("Saved personal details.");
                }
            });

        bttnAdd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    String name = txtfName.getText().trim();
                    String surname = txtfSurname.getText().trim();
                    String email = txtfEmail.getText().trim();
                    String githubLink = txtfGithub.getText().trim();
                    String linkedin = txtfLinkedIn.getText().trim();
                    String phoneNo = txtfPhoneNo.getText().trim();
                    String city = txtfCity.getText().trim();

                    try {
                        if (!email.endsWith("@gmail.com")) {
                            throw new IllegalArgumentException("Email must end with @gmail.com");
                        }

                        if (!githubLink.startsWith("https://github.com/")) {
                            throw new IllegalArgumentException("GitHub link must start with https://github.com/");
                        }

                        if (!phoneNo.matches("\\d{10,}")) {
                            throw new IllegalArgumentException("Phone number must be at least 10 digits and numeric only.");
                        }

                        if (!linkedin.startsWith("https://www.linkedin.com/")) {
                            throw new IllegalArgumentException("LinkedIn link must start with https://www.linkedin.com/");
                        }

                        PersonalDetails perD = new PersonalDetails(name, surname, email, githubLink, linkedin, phoneNo, city);
                        personalList.add(perD);

                        if (countAddClicks >= 5) {
                            txtfName.setEnabled(false);
                            txtfSurname.setEnabled(false);
                            txtfEmail.setEnabled(false);
                            txtfGithub.setEnabled(false);
                            txtfLinkedIn.setEnabled(false);
                            txtfPhoneNo.setEnabled(false);
                            txtfCity.setEnabled(false);
                        }

                        countAddClicks++;
                        System.out.println("Add Click Count: " + countAddClicks);

                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(PersonalPanel.this, ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        bttnClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    txtfName.setText("");
                    txtfSurname.setText("");
                    txtfEmail.setText("");
                    txtfCity.setText("");
                    txtfPhoneNo.setText("");
                    txtfGithub.setText("");
                    txtfLinkedIn.setText("");

                    txtfName.setEnabled(true);
                    txtfSurname.setEnabled(true);
                    txtfEmail.setEnabled(true);
                    txtfGithub.setEnabled(true);
                    txtfLinkedIn.setEnabled(true);
                    txtfPhoneNo.setEnabled(true);
                    txtfCity.setEnabled(true);

                    personalList.clear();
                    countAddClicks = 1;

                    System.out.println("Cleared all fields.");
                }
            });
    }

    public ArrayList<PersonalDetails> getPersonalDetails() {
        return new ArrayList<>(personalList); // Return a copy to maintain encapsulation
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
