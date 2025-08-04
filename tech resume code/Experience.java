/**
 * Represents a work experience entry in the resume.
 */
public class Experience {
    private String startDate, endDate, action, skillsGained, result, companyName, compPosition;

    public Experience(String startDate, String endDate, String action, String skillsGained,
                      String result, String companyName, String compPosition) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.action = action;
        this.skillsGained = skillsGained;
        this.result = result;
        this.companyName = companyName;
        this.compPosition = compPosition;
    }

    // Setters
    public void setStartDate(String startDate) { 
        this.startDate = startDate;
    
    }
    
    public void setEndDate(String endDate) { 
        this.endDate = endDate;

    }
    
    public void setAction(String action) { 
        this.action = action; 
    }
    
    public void setSkillsGained(String skillsGained) { 
        this.skillsGained = skillsGained;
    
    }
    
    public void setResult(String result) { 
        this.result = result;
    }
    
    public void setCompanyName(String companyName) { 
        this.companyName = companyName; 
    }
    
    public void setCompPosition(String compPosition) { 
        this.compPosition = compPosition; 
    }

    // Getters
    public String getStartDate() { 
        return startDate;
    
    }
    public String getEndDate() { 
        return endDate;
    }
    
    public String getAction() { 
        return action;
    }
    
    public String getSkillsGained() { 
        return skillsGained;
    }
    
    public String getResult() { 
        return result;
    }
    
    public String getCompanyName() { 
        return companyName;
    }
    
    public String getCompPosition() { 
        return compPosition;
    }

    @Override
    public String toString() {
        return "Company: " + companyName + "\n" +
               "Position: " + compPosition + "\n" +
               "Start Date: " + startDate + "\n" +
               "End Date: " + endDate + "\n" +
               "Action: " + action + "\n" +
               "Skills Gained: " + skillsGained + "\n" +
               "Result: " + result;
    }
}
