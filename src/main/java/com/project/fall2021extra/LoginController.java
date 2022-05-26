package com.project.fall2021extra;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {


    @FXML
    private Pane pane_createAccount;
    @FXML
    private Pane pane_login;
    @FXML
    private Button button_login;
    @FXML
    private Button button_register;
    @FXML
    private Button button_create;
    @FXML
    private Button button_login_page;

    //Login Page
    @FXML
    private TextField textField_lastName;
    @FXML
    private TextField textField_rewardNum;
    @FXML
    private Label label_invalidLogin;

    //Create account
    @FXML
    private Label label_create_Done;
    @FXML
    private TextField textField_create_lastName;
    @FXML
    private TextField textField_create_firstName;
    @FXML
    private TextField textField_create_email;
    @FXML
    private TextField textField_create_phoneNum;









    @FXML
    public void onRegisterButton_click(){
        pane_createAccount.setVisible(true);
        pane_login.setVisible(false);
    }

    @FXML
    public void onLoginPageButton_click(){
        label_create_Done.setText("");
        pane_createAccount.setVisible(false);
        pane_login.setVisible(true);
    }

    @FXML
    public void onCreateButton_click(){


        //Make temp customer to add to lIST of customer in DATA
        Customer tmpCustomer = new Customer(
                textField_create_firstName.getText(),
                textField_create_lastName.getText(),
                "1234",
                "no",
                "0",
                textField_create_email.getText(),
                textField_create_phoneNum.getText()
        );


        Data.number_of_customers = Data.number_of_customers + 1;
        Data.customers.add(tmpCustomer);
        label_create_Done.setText("Account created, return to login!\n LOGIN INFO:\nDefault Reward Number = 1234");
        label_create_Done.setTextFill(Color.GREEN);
    }

    @FXML
    public void onLoginButton_click() throws IOException {


        // If account is VALID
        //Check if login is valid in the LIST of customes in the Data class
        for( Customer customer: Data.customers){
            if(customer.getLastName().contains(textField_lastName.getText()) &&
                    customer.getrewardNumber().contains(textField_rewardNum.getText())){


                StoreController.thisCustomer_rewardNum = customer.getrewardNumber();
                label_invalidLogin.setText(""); //Rest invalid login text
                //Close Login Stage/Window
                Stage window;
                window = (Stage) pane_login.getScene().getWindow();
                window.close();

                //Change to Store Page
                Stage StoreStage = new Stage();
                FXMLLoader FxmlLoader = new FXMLLoader(HelloApplication.class.getResource("store_view.fxml"));
                Scene storeScene = new Scene(FxmlLoader.load(), 720, 720);
                StoreStage.setTitle("Store");
                StoreStage.setScene(storeScene);
                StoreStage.show();
                break;
            }
        }

        // If account is VALID
        label_invalidLogin.setText("INVALID login info...try again");
        label_invalidLogin.setTextFill(Color.RED);




    }

}
