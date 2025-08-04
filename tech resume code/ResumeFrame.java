import javax.swing.*;
import java.awt.*;

public class ResumeFrame {
    public static void main(String[] args) {
        //Create the Frame
        JFrame frame = new JFrame("Resume Application");
        frame.setSize(900,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create custom panels
        PersonalPanel personalPanel = new PersonalPanel();
        TechSkillsPanel techPanel = new TechSkillsPanel();
        ProjectPanel projPanel = new ProjectPanel();
        EducationPanel eduPanel= new EducationPanel();
        ExperiencePanel expPanel = new ExperiencePanel();
        Resume resumePanel = new Resume(personalPanel,techPanel,projPanel,eduPanel,expPanel);

        // Panel to hold cards
        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(personalPanel, "Personal");
        cardPanel.add(techPanel, "Tech");
        cardPanel.add(projPanel, "Project");
        cardPanel.add(eduPanel, "Education");
        cardPanel.add(expPanel, "Experience");
        cardPanel.add(resumePanel, "Resume");
        

        // Create toolbar 
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        //Create buttons for toolbar
        JButton bttnPersonal = new JButton("Personal Details");
        JButton bttnTechSkills = new JButton("Technical Skills");
        JButton bttnProject = new JButton("Projects");
        JButton bttnEducation = new JButton("Education");
        JButton bttnExperience = new JButton("Experience");
        JButton bttnResume = new JButton("Resume");
        

        //Add buttons to the toolbar
        toolbar.add(bttnPersonal);
        toolbar.add(bttnTechSkills);
        toolbar.add(bttnProject);
        toolbar.add(bttnEducation);
        toolbar.add(bttnExperience);
        toolbar.add(bttnResume);
    

        // Add toolbar and card panel to frame
        frame.add(toolbar, BorderLayout.NORTH);
        frame.add(cardPanel, BorderLayout.CENTER);

        // CardLayout reference
        CardLayout cl = (CardLayout) cardPanel.getLayout();

        // Button actions
        bttnPersonal.addActionListener(e -> cl.show(cardPanel, "Personal"));
        bttnTechSkills.addActionListener(e -> cl.show(cardPanel, "Tech"));
        bttnProject.addActionListener(e -> cl.show(cardPanel, "Project"));
        bttnEducation.addActionListener(e -> cl.show(cardPanel, "Education"));
        bttnExperience.addActionListener(e -> cl.show(cardPanel, "Experience"));
        bttnResume.addActionListener(e -> cl.show(cardPanel, "Resume"));        
        
        frame.setVisible(true);
    }
}
