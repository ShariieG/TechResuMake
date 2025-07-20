
public class PersonalDetails extends Resume
{
    private String name, surname, email, githubLink, linkedinLink, phoneNo,city;  
    
    public PersonalDetails(String name, String surname, String email, String githubLink, String linkedinLink, String phoneNo, String city){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.githubLink = githubLink;
        this.phoneNo = phoneNo;
        this.city = city;
        this.linkedinLink= linkedinLink;
    }
    
     //setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String Surname){
        this.surname = surname;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNum(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setGitLink(String  githubLink){
        this.githubLink = githubLink;
    }
    
    public void setLinkedLink(String linkedinLink){
        this.linkedinLink = linkedinLink;
    }
    
    //getters
    public String getName( ){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getGitLink(){
        return githubLink;
    }
    
    public String getLinkedLink(){
        return linkedinLink;
    }
    
    public String getPhoneNum(){
        return phoneNo;
    }
    
    public String getCity(){
        return city;
    }
    
    public String toString(){
        return String.format("Name: %s %s \nLinkedIn link: %s \nGitHub link: %s ",name,surname,linkedinLink, githubLink)
        + "\n" + String.format("\nPhone number: %s \nEmail Address: %s \nCity:  ",phoneNo, email,city);
    }
}