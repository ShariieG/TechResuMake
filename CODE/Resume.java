
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
import java.util.ArrayList;

public class Resume
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args){
        String name, surname, email, githubLink, linkedin, phoneNo,city;        
        System.out.print("Name: ");
        name = scan.next().trim();

        System.out.print("Surname: ");
        surname = scan.next().trim();

        do{
            System.out.print("Email Address: ");
            email = scan.next().trim();
        }while(email.toLowerCase().endsWith("@gmail.com") == false );

        do{
            System.out.print("Github Acccount link: ");
            githubLink = scan.next().trim();
        }while(githubLink.toLowerCase().startsWith("https://github.com/")== false);

        do{
            System.out.print("LinkedIn Account link: ");
            linkedin = scan.next().trim();
        }while(linkedin.toLowerCase().startsWith("https://www.linkedin.com/")==false);

        do{
            System.out.print("Phone number: ");
            phoneNo = scan.next().trim();
        }while(phoneNo.length() != 10);

        System.out.print("Town/City: ");
        city = scan.next().trim();

        PersonalDetails perD =  new PersonalDetails(name,surname,email,githubLink,linkedin,phoneNo,city);
        System.out.println(perD.toString());

        //Technical skills
        System.out.print("\n\nWelcome to the Technical skill page: ");
        int proficiencyLevel;
        String skillName;

        do{
            System.out.print("Skill or q to quit:  ");
            skillName = scan.next().trim();

            do{
                System.out.print("Proficiency Level: ");
                proficiencyLevel = scan.nextInt();
            }while(proficiencyLevel<0 || proficiencyLevel>10);

            TechSkills techS= new TechSkills(skillName,proficiencyLevel);
        }while(skillName.toLowerCase().charAt(0)!='q');

        //Project Details
        System.out.print(" Welcome to the Projects page:  ");
        String projname,context, action,result;
        int projCount= 0;

        ArrayList<Project> projDetails ;
        do{
            System.out.print("Project name or q to quit: ");
            projCount= scan.nextInt();

            System.out.print("Project name: ");
            projname = scan.next().trim();

            System.out.print("Context of project: ");
            context = scan.next().trim();

            System.out.print("Action of project: ");
            action = scan.next().trim();

            System.out.print("Result of project: ");
            result = scan.next().trim();

            Project proj = new Project(projname,context,action,result);

            projDetails = new ArrayList<Project>();
            projDetails.add(proj);

            if(projCount > 5){
                break;
            }
            
            projCount++;

        }while(projCount<=5);

        System.out.println(String.format("Project name: %s \nContext of the project: %s"));
        
        int coursesCount;
        String courseName, schoolName, gradYear;
        String qualiType;

        System.out.print("Welcome to the Education Section:  ");
        do{
            System.out.print("Name of the institution or q to quit: ");
            schoolName= scan.next().trim();

            System.out.print("Qualification type and name: ");
            courseName= scan.next().trim();

            do{
                System.out.print("Enter the expected graduation year: ");
                gradYear= scan.next().trim();
            }while(gradYear.length() != 4);

            Education ed = new Education(schoolName, courseName, gradYear);
        }while(schoolName.toLowerCase().charAt(0) == 'q');
    }

    public static void experience(){
        String startDate,endDate, action,skillsGained, result;
        String companyName, compPosition;

        System.out.print("Enter the company name: ");
        companyName= scan.next().trim();

        System.out.print("The role: ");
        compPosition= scan.next();

        System.out.print("Enter the start date: ");
        startDate = scan.next().trim();

        System.out.print("The enter the end date: ");
        endDate = scan.next().trim();

        System.out.print("The action in the company: ");
        action = scan.next().trim();

        Experience exp = new Experience(startDate,endDate,action,companyName,compPosition);

    }

    public static void ProfessionalSummary(){
        String summary;
        System.out.print("Enter a secure professional summary: ");
        summary = scan.next().trim();
        
    }

    public static void userAccount(){
        char acc;

        String username, password;

        String name,surname, idNumber, gender, email, ipassword, vpassword;

        System.out.print("Do you have an account? ");
        acc= scan.next().charAt(0);

        if(acc == 'Y'|| acc == 'y'){
            System.out.println("Welcome to the Login page: ");

            System.out.print("Enter your Username: ");
            username = scan.next().trim();

            System.out.print("Enter password:  ");
            password =  scan.next().trim();

        }
        else{
            System.out.println("Welcome to the registration page: ");

            System.out.print("Enter your name: ");
            name = scan.next().trim();

            System.out.print("Enter your surname: ");
            surname = scan.next().trim();

            System.out.print("Enter your idNumber: ");
            name = scan.next().trim();

            System.out.print("Enter your gender: ");
            gender = scan.next().trim();

            System.out.print("Enter your email address: ");
            email = scan.next().trim();

            System.out.print("Enter a secure password: ");
            ipassword = scan.next().trim();

            System.out.print("Verify a password: ");
            vpassword = scan.next().trim();
        }

    }
}