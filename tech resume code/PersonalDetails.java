/**
 * Represents personal details for a resume, including contact information and links.
 * This class serves as a data model within the TECH-RESU-MAKE application.
 *
 * Author: Sharon Galela (inferred from context)
 */
public class PersonalDetails {
    // --- Member Variables ---
    private String name;
    private String surname;
    private String email;
    private String githubLink;
    private String phoneNo;
    private String city;
    private String linkedinLink;

    public PersonalDetails(String name, String surname, String email,String githubLink, String phoneNo, String city, String linkedinLink) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.githubLink = githubLink;
        this.phoneNo = phoneNo;
        this.city = city;
        this.linkedinLink = linkedinLink;
    }

    // --- Getter Methods ---
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public String getPhoneNum() {
        return phoneNo;
    }

    public String getCity() {
        return city;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    // --- Setter Methods ---
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public void setPhoneNum(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    // --- toString Method ---
    @Override
    public String toString() {
        return String.format(
            "Name: %s %s \n" +
            "LinkedIn link: %s \n" +
            "GitHub link: %s \n" +
            "Phone number: %s \n" +
            "Email Address: %s \n" +
            "City: %s",
            name, surname, linkedinLink, githubLink, phoneNo, email, city
        );
    }
}
