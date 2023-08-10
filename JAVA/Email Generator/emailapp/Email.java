package emailapp;
import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private int mailboxcapacity = 500;
    private String email;
    private String alternateEmail;
    private String companySuffix = "company.com";
    Scanner scan = new Scanner(System.in);
    //constructor to receive the first name and last name
    public Email(String firstname,String lastname) 
    {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("\nEmail Successfully Created!!! : \n");
        
        //call a method asking for the department -return the department
        this.department = setDepartment();
        
        //call a method that return random password
        this.password = setRandomPassword(defaultPasswordLength);

        //combine elements to generate email
        email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
    }
    private String setDepartment() // choosing department
    {
        System.out.println("These are given department : \n1 for Sales\n2 for Accounting\n3 for Development\n0 for none");
        System.out.print("Enter department code : ");
        int dep_choice = scan.nextInt();
        if(dep_choice==1){return "sales";}
        else if(dep_choice==2){return "accounting";}
        else if(dep_choice==3){return "development";}
        else{return "";}
    }
    private String setRandomPassword(int length) // Generate random password
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@!#$%&*";
        char[] password = new char[length];
        for(int i=0; i<length; i++)
        {
            int rand = (int)(Math.random()*passwordSet.length()); // Math.random() : return double type number from 0.0 to 1.0
            password[i] = passwordSet.charAt(rand); // from passwordSet string charAt() returning a single character from given index passed as parameter
        }
        return new String(password);
    }
    public void setMailBoxCapacity(int capacity)
    {
        this.mailboxcapacity = capacity;
    }
    public void setAlternateEmail(String altmail)
    {
        this.alternateEmail = altmail;
    }
    public void changePassword(String password)
    {
        this.password = password;
    }
    public int getMailBoxCapacity(){return mailboxcapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showinfo()
    {
        return "\nDISPLAY NAME     :\t"+firstname+" "+lastname+
                "\nCOMPANY EMAIL    :\t"+email+
                "\nMAILBOX CAPACITY :\t"+mailboxcapacity+"mb"+
                "\nPASSWORD         :\t"+password;
    }

}
