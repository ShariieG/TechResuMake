
import java.lang.String;
public class Project extends ResumeFrame
{
    private String projname,context, action,result;
    
    public Project(String projname, String context, String action, String result){
        this.projname = projname;
        this.context = context;
        this.action = action;
        this.result = result;
    }
    
    public void setProjname(String projname){
        this.projname = projname;
    }
    
    public void setContext(String context){
        this.context = context;
    }
    
    public void setResult(String result){
        this.result = result;
    }
    
    public void setAction(String action){
        this.action = action;
    }
    
    //getters
    public String getProjname(){
         return projname;
    }
    
    public String getContext(){
        return context;
    }
    
     public String getResult(){
         return result;
    }
    
    public String getAction(){
        return action;
    }
    
    @Override
    public String toString() {
        return "Project Name: " + projname + "\n" +
               "Context: " + context + "\n" +
               "Action: " + action + "\n" +
               "Result: " + result + "\n";
    }
}