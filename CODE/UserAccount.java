
public class UserAccount extends Resume
{
    private String idnumber, name, surname, email, password, githubLink, linkedinLink;
    
    public UserAccount(String idnumber, String name, String surname, String email, String password, String githubLink, String linkedinLink){
        this.idnumber=idnumber;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.githubLink = githubLink;
        this.linkedinLink = linkedinLink;
    }
    
    //setters
    public void setIDnumb(String idnumber){
        this.idnumber=idnumber;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(){
        this.surname = surname;
    }
    
    public void setEmail(){
        this.email = email;
    }
    
    public void setPassword(){
        this.password = password;
    }
    
    public void setGitLink(){
        this.githubLink = githubLink;
    }
    
    public void setLinkedLink(){
        this.linkedinLink = linkedinLink;
    }
    
    //getters
     public String getIDnumb(){
         return idnumber;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getGitLink(){
        return githubLink;
    }
    
    public String getLinkedLink(){
        return linkedinLink;
    }
    
}