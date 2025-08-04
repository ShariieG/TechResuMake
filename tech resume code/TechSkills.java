


public class TechSkills extends ResumeFrame
{
    private int skillCount, proficiencyLevel;
    private String skillName;
    public TechSkills(String skillName,int proficiencyLevel){
        this.skillName = skillName;
        this.proficiencyLevel = proficiencyLevel;
        
    }
    
    //setters
    public void setSkillName(String skillName){
        this.skillName = skillName;
    }
    
    public void setProficiencyLevel(int proficiencyLevel){
        this.proficiencyLevel = proficiencyLevel;
    }
    
    //getters
     public String getSkillName(){
         return skillName;
    }
    
    public int getProficiencyLevel(){
        return proficiencyLevel;
    }
    
    public String toString(){
        return String.format("Skill: %sb ",this.skillName) + "(Level: " + this.proficiencyLevel + ")" ;
    }
}