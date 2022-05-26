package com.project.fall2021extra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Data {

    final static String customersPath = "src/main/resources/Data/customers.txt";
    final static String productsPath = "src/main/resources/Data/products.txt";
    final static String cartsPath = "src/main/resources/Data/carts.txt";


    static List<Customer> customers = new ArrayList<>();
    static List<Product> products = new ArrayList<>();
    static List<Cart> carts = new ArrayList<>();

    static int number_of_customers = 0;
    static int number_of_products = 0;




    public static void parsefiles() throws IOException{

        parseCustomers();
        parseProducts();
        //parseCart();

    }


    public static void parseCustomers() throws IOException {
        int custCount;      //How many customers in .txt file



        try { //FileNotFoundException
            //String fileNameString = Files.readString(Path.of(Data.customersPath), StandardCharsets.US_ASCII);
            //System.out.println(fileNameString);

            File pointer = new File(Data.customersPath);
            Scanner pointRead = new Scanner(pointer); // opens file
            custCount = Integer.parseInt(pointRead.nextLine());
            Data.number_of_customers = custCount;
            //System.out.println(custCount);
            try { //ArrayIndexOutOfBoundsException
                try { //NoSuchElementException
                    while (pointRead.hasNextLine()) {
                        Customer tmpCustomer = new Customer(
                                pointRead.nextLine(),
                                pointRead.nextLine(),
                                pointRead.next(),
                                pointRead.nextLine(),
                                pointRead.nextLine(),
                                pointRead.nextLine(),
                                pointRead.nextLine()
                        );

                        /*
                        System.out.println(tmpCustomer.getFirstName());
                        System.out.println(tmpCustomer.getLastName());
                        System.out.println(tmpCustomer.getrewardNumber()+ " ");
                        System.out.print(tmpCustomer.geteliteStatus());
                        System.out.println(tmpCustomer.getdiscountPercentage());
                        System.out.println(tmpCustomer.getemail());
                        System.out.println(tmpCustomer.getphoneNum());
                        System.out.println();
                        */


                        Data.customers.add(tmpCustomer);
                    }

                } catch (ArrayIndexOutOfBoundsException f) // if we go past array
                {
                    return;
                }

            } catch (NoSuchElementException f) // if element isnt found
            {
                System.out.println("No such element exception,");
            }


        } catch (FileNotFoundException e) // if file dne
        {
            System.out.println("File not found.");
        }

    }


    public static void parseProducts() throws IOException{
        int productCount;      //How many product in .txt file



        try { //FileNotFoundException


            File pointer = new File(Data.productsPath);
            Scanner pointRead = new Scanner(pointer); // opens file
            productCount = Integer.parseInt(pointRead.nextLine());
            Data.number_of_products = productCount;
            //System.out.println(productCount);
            try { //ArrayIndexOutOfBoundsException
                try { //NoSuchElementException
                    while (pointRead.hasNextLine()) {
                        Product tmpProduct = new Product(
                                pointRead.nextLine(),
                                pointRead.nextLine(),
                                pointRead.nextLine(),
                                pointRead.nextLine(),
                                pointRead.nextLine()

                        );


                        System.out.println(tmpProduct.getproductName());
                        System.out.println(tmpProduct.getDescription());
                        System.out.println(tmpProduct.getPrice());
                        System.out.println(tmpProduct.getImageFileName());
                        System.out.println();


                        Data.products.add(tmpProduct);
                    }

                } catch (ArrayIndexOutOfBoundsException f) // if we go past array
                {
                    return;
                }

            } catch (NoSuchElementException f) // if element isnt found
            {
                System.out.println("No such element exception,");
            }


        } catch (FileNotFoundException e) // if file dne
        {
            System.out.println("File not found.");
        }
    }

    public static void parseCart() throws IOException{

    }
}