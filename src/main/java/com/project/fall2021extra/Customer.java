package com.project.fall2021extra;


public class Customer {

    private String firstName;
    private String lastName;
    private String rewardNumber;
    private String eliteStatus;         //yes || no
    private String discountPercentage;  // For Elite customers
    private String starsEarned;         // For Regular customers
    private String email;
    private String phoneNum;



    //getters and setters
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String fname){
        firstName= fname;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String fname){
        lastName= fname;
    }
    public String getrewardNumber(){
        return this.rewardNumber;
    }
    public void setrewardNumber(String fname){
        rewardNumber= fname;
    }
    public String geteliteStatus(){
        return this.eliteStatus;
    }
    public void seteliteStatus(String fname){
        eliteStatus= fname;
    }
    public String getdiscountPercentage(){
        return this.discountPercentage;
    }
    public void setdiscountPercentage(String fname){
        discountPercentage= fname;
    }
    public String getemail(){
        return this.email;
    }
    public void setemail(String fname){
        email= fname;
    }
    public String getphoneNum(){
        return this.phoneNum;
    }
    public void setphoneNum(String fname){
        email= fname;
    }

    /** NAME: customer
     PARAMETERS: none
     PURPOSE: default constructor
     PRECONDITION: variables declared
     POSTCONDITION: all variables have defaults
     */
    public Customer()
    {
        this.firstName= "FIRSTNAME";
        this.lastName= "LASTNAME";
        this.rewardNumber= "NULL";
        this.eliteStatus= "NA";
        this.discountPercentage = "0.0";
        this.starsEarned = "NA";
        this.email="firstname.lastname@rNum.company.com";
        this.phoneNum="123-456-7890";
    }


    /** NAME: customer
     PARAMETERS: String fname, String lname, String rNum, String email
     PURPOSE: assign values to variables
     PRECONDITION: none
     POSTCONDITION: no return, just variables assigned
     */
    public Customer(String fname, String lname, String rNum, String eStatus,String stars_or_discount, String Email, String pNum)
    {
        this.firstName=fname;
        this.lastName= lname;
        this.rewardNumber= rNum;
        this.email= Email;
        this.eliteStatus= eStatus;
        this.discountPercentage = stars_or_discount;
        this.starsEarned = stars_or_discount;
        this.phoneNum= pNum;
    }


    /** NAME: toString
     PARAMETERS: none
     PURPOSE: return string
     PRECONDITION: none
     POSTCONDITION: returning string for object
     */
    public String toString()
    {
        return ("Name:\t\t\t\t" + firstName + " " + lastName + "\nrNum:\t\t\t" + rewardNumber + "\nElite Status:\t\t"+ eliteStatus+ "\nemail:\t" + email + "\nphone num:\t\t\t" + phoneNum );
    }

}
