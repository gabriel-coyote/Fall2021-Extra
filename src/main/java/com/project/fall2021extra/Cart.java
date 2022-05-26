package com.project.fall2021extra;


import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    static List<Integer> num_cartItems = new ArrayList<>();
    static List<String> rewardNumber_ofCart = new ArrayList<>();
    static List<Integer> cartItem_quantity = new ArrayList<>();


    private String rewardNumber;    //User
    private double Price;  // For Elite Carts
    private String productNumber;
    private int  productquantity;



    //getters and setters

    public String getrewardNumber(){
        return this.rewardNumber;
    }
    public void setrewardNumber(String fname){
        rewardNumber= fname;
    }


    public Double getPrice(){
        return this.Price;
    }
    public void setPrice(double fname){
        Price= fname;
    }
    public String getproductNumber(){
        return this.productNumber;
    }
    public void setproductNumber(String fname){
        productNumber= fname;
    }
    public int getproductqunatity(){
        return this.productquantity;
    }
    public void setproductquantity(int fname){
        productquantity= fname;
    }

    /** NAME: Cart
     PARAMETERS: none
     PURPOSE: default constructor
     PRECONDITION: variables declared
     POSTCONDITION: all variables have defaults
     */
    public Cart()
    {

        this.productNumber="0000";
        this.rewardNumber= "rewardNumber";
        this.Price= 0.0;
        this.productquantity = 0;
    }


    /** NAME: Cart
     PARAMETERS: String fname, String lname, String rNum, String email
     PURPOSE: assign values to variables
     PRECONDITION: none
     POSTCONDITION: no return, just variables assigned
     */
    public Cart( String cNumber, String rewardnumber, double price, int Cartnumber)
    {

        this.productNumber= cNumber;
        this.rewardNumber= rewardnumber;
        this.Price= price;
        this.productquantity = Cartnumber;

    }


    /** NAME: toString
     PARAMETERS: none
     PURPOSE: return string
     PRECONDITION: none
     POSTCONDITION: returning string for object
     */
    public String toString()
    {
        return ("Number of Carts:\t\t\t\t" + productNumber + "rewardNumber:" + rewardNumber + "\nNumber of Cart Items:\t\t\t"+ "\nCart Number:\t\t\t" +productquantity+  "\nAmount:\t\t\t" + Price);
    }
}
