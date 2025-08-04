import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Resume extends JPanel {
    private PersonalPanel personalPanel;
    private TechSkillsPanel techSkillsPanel;
    private ProjectPanel projectPanel;
    private ExperiencePanel experiencePanel;
    private EducationPanel educationPanel;
    private JTextArea taResume = new JTextArea(20, 70);
    private JScrollPane scrollPane = new JScrollPane(taResume); 
    private JButton bttnResume = new JButton("Generate Resume");
    
    public Resume(PersonalPanel personalPanel, TechSkillsPanel techSkillsPanel, ProjectPanel projectPanel,
                EducationPanel educationPanel, ExperiencePanel experiencePanel) {
        this.personalPanel = personalPanel;
        this.techSkillsPanel = techSkillsPanel;
        this.projectPanel = projectPanel;
        this.educationPanel = educationPanel;
        this.experiencePanel = experiencePanel;
        taResume.setEditable(false);
        design();
    }

    public void design() {
        setLayout(new GridBagLayout());
        
        bttnResume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                StringBuilder sbText = new StringBuilder();
                
                // Personal Details Section
                ArrayList<PersonalDetails> personalList = personalPanel.getPersonalDetails();
                if (!personalList.isEmpty()) {
                    sbText.append("\nPERSONAL DETAILS\n");
                    sbText.append("==========================================\n");
                    PersonalDetails pd = personalList.get(0);
                    sbText.append(String.format("Name: %s %s\n", pd.getName(), pd.getSurname()));
                    sbText.append(String.format("Contacts: %s, %s\n", pd.getEmail(), pd.getPhoneNum()));
                    sbText.append(String.format("Links: GitHub: %s, LinkedIn: %s\n", pd.getGithubLink(), pd.getLinkedinLink()));
                    sbText.append(String.format("Location: %s\n\n", pd.getCity()));
                }
                
                // Technical Skills Section
                ArrayList<TechSkills> technicalList = techSkillsPanel.getTechSkills();
                if (!technicalList.isEmpty()) {
                    sbText.append("TECHNICAL SKILLS\n");
                    sbText.append("==========================================\n");
                    for (TechSkills ts : technicalList) {
                        sbText.append(String.format("- %s: %d/10\n", ts.getSkillName(), ts.getProficiencyLevel()));
                    }
                    sbText.append("\n");
                }
                
                // Projects Section
                ArrayList<Project> projectList = projectPanel.getProjects();
                if (!projectList.isEmpty()) {
                    sbText.append("PROJECTS\n");
                    sbText.append("==========================================\n");
                    for (Project p : projectList) {
                        sbText.append(String.format("- %s\n", p.getProjname()));
                        // Add more project details if available
                    }
                    sbText.append("\n");
                }
                
                // Education Section
                ArrayList<Education> educationList = educationPanel.getEducationEntries();
                if (!educationList.isEmpty()) {
                    sbText.append("EDUCATION\n");
                    sbText.append("==========================================\n");
                    for (Education e : educationList) {
                        sbText.append(String.format("- %s (%s - %s)\n", 
                            e.getCourseName(), e.getYear()));
                    }
                    sbText.append("\n");
                }
                
                // Experience Section
                ArrayList<Experience> experienceList = experiencePanel.getExperience();
                if (!experienceList.isEmpty()) {
                    sbText.append("EXPERIENCE\n");
                    sbText.append("==========================================\n");
                    for (Experience exp : experienceList) {
                        sbText.append(String.format("- %s at %s (%s - %s)\n", 
                            exp.getCompPosition(), exp.getCompanyName(), exp.getStartDate(), exp.getEndDate()));
                    }
                }
                
                taResume.setText(sbText.toString());
            }
        });
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(bttnResume, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(scrollPane, gbc); // Add scrollPane instead of taResume directly
    }
}