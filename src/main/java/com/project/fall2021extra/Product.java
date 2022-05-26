package com.project.fall2021extra;

public class Product {

    private String productName;
    private String productNumber;
    private String Description;
    private double Price;  // For Elite Products
    private String imageFileName;         // For Regular Products




    //getters and setters
    public String getproductName(){
        return this.productName;
    }
    public void setproductName(String fname){
        productName= fname;
    }
    public String getproductNumber(){
        return this.productNumber;
    }
    public void setproductNumber(String fname){
        productNumber= fname;
    }
    public String getDescription(){
        return this.Description;
    }
    public void setDescription(String fname){
        Description= fname;
    }
    public Double getPrice(){
        return this.Price;
    }
    public void setPrice(double fname){
        Price= fname;
    }
    public void setImageFileName(String imgFile){ imageFileName = imgFile;}
    public String getImageFileName(){return this.imageFileName;}



    /** NAME: Product
     PARAMETERS: none
     PURPOSE: default constructor
     PRECONDITION: variables declared
     POSTCONDITION: all variables have defaults
     */
    public Product()
    {
        this.productName= "productName";
        this.productNumber= "productNumber";
        this.Description= "NULL";
        this.Price = 0.0;
        this.imageFileName = "NA";
    }


    /** NAME: Product
     PARAMETERS: String fname, String lname, String rNum, String email
     PURPOSE: assign values to variables
     PRECONDITION: none
     POSTCONDITION: no return, just variables assigned
     */
    public Product(String pname, String pNum, String descrip, String price, String img)
    {
        this.productName=pname;
        this.productNumber= pNum;
        this.Description= descrip;
        this.Price = Double.valueOf(price);
        this.imageFileName = img;

    }


    /** NAME: toString
     PARAMETERS: none
     PURPOSE: return string
     PRECONDITION: none
     POSTCONDITION: returning string for object
     */
    public String toString()
    {
        return ("Name:\t\t\t\t" + productName + "ProductNumber" + productNumber + "\nDescription:\t\t\t" + Description   + "\nImageFileName:\t\t\t" + imageFileName );
    }
}
