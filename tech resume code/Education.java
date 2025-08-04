


public class Education extends ResumeFrame
{
    private String gradYear;
    private String courseName, schoolName;
    //private String startDate, endDate;
    
    public Education(String schoolName, String courseName, String gradYear ){
        this.gradYear = gradYear;
        this.courseName = courseName;
        this.schoolName = schoolName;
    }

    
    //setters
    public void setYear(String gradYear){
        this.gradYear = gradYear;
    }
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    
    
    //getters
     public String getYear(){
         return gradYear;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
     public String schoolName(){
         return schoolName;
    }

     public String toString() {
        return String.format("Institution: %s | Course: %s | Year: %s", 
                              schoolName, courseName, gradYear);
    }
}