
/**
 * Write a description of class Experience here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Experience extends  Resume
{
    private String startDate,endDate, action,skillsGained, result, companyName, compPosition;
    
    public Experience(String startDate,String endDate, String action, String companyName, String compPosition){
        this.startDate = startDate;
        this.endDate = endDate;
        this.action = action;
        this.skillsGained = skillsGained;
        this.result = result;
        this.companyName = companyName;
        this.compPosition = compPosition;
    }
    
     //setters
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    
    public void setEndDate(String endDate){
        this.endDate = endDate;
    }
    
    public void setAction(String action){
        this.action = action;
    }
    
    public void setSkillGained(String skillsGained){
        this.skillsGained = skillsGained;
    }
    
    public void setResult(String result){
        this.result = result;
    }
    
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    
    public void setCompPosition(String compPosition){
        this.compPosition = compPosition;
    }
    
    //getters
    
    public String getStartDate(){
        return startDate;
    }
    
    public String getEndDate(){
        return endDate;
    }
    
    public String getAction(){
        return action;
    }
    
    public String getSkillGained(){
        return skillsGained;
    }
    
    public String setResult(){
        return result;
    }
    
    public String getCompanyName(){
        return companyName;
    }
    
    public String setCompPosition(){
        return compPosition;
    }
}