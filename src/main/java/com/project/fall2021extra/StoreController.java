package com.project.fall2021extra;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.controlsfx.control.ListSelectionView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StoreController {

    static String thisCustomer_rewardNum;
    private List<Cart> order = new ArrayList<>();
    private Cart cart;


    @FXML
    private Pane pane_addToCart;
    @FXML
    private Pane pane_viewCart;

    @FXML
    private Button button_search_item;
    @FXML
    private TextField textField_itemSearch;
    @FXML
    private TextField textField_itemQuantity;


    @FXML
    private ListView<Product> productListView;
    //Key Component: ObservableList with variety of string item types for list.
    final ObservableList<Product> listProduct = FXCollections.observableArrayList();

    @FXML
    private Button button_logOff;
    @FXML
    private Button button_viewCart;
    @FXML
    private Button button_addToCart;
    @FXML
    private Label label_added;
    @FXML
    private TextArea cartView;


    @FXML
    public void onSearchItemButton_click() throws IOException{

        for(Product product: Data.products){
            if(product.getproductName().contains(textField_itemSearch.getText())){
                listProduct.add(product);
            }
        }

        productListView.setItems(listProduct);
    }

    @FXML
    public void onAddToCart_click() throws IOException{

        int item_index = productListView.getSelectionModel().getSelectedIndex();
        Product item = productListView.getSelectionModel().getSelectedItem();


        int item_quantity = Integer.valueOf(textField_itemQuantity.getText());
        //double price = item.getPrice() * item_quantity;
        label_added.setText(item_quantity + " of Product - "+item.getproductName()+" added to cart");
        cart = new Cart(
                item.getproductNumber(),
                StoreController.thisCustomer_rewardNum,
                2.99,
                item_quantity
        );

        Cart tmpCart = cart;
        order.add(tmpCart);


    }


    @FXML
    public void onLogOffButton_click() throws IOException {

        //Close CartView Stage/Window
        pane_viewCart.setVisible(false);
        pane_addToCart.setVisible(true);
        order.clear();
        Stage window;
        window = (Stage) pane_viewCart.getScene().getWindow();
        window.close();

        //Change to Store Page
        Stage Stage = new Stage();
        FXMLLoader FxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login-view.fxml"));
        Scene storeScene = new Scene(FxmlLoader.load(), 500, 400);
        Stage.setTitle("Login");
        Stage.setScene(storeScene);
        Stage.show();
    }

    @FXML
    public void onViewCartButton_click() throws IOException {
        pane_addToCart.setVisible(false);
        pane_viewCart.setVisible(true);

        for(Cart cart: order){
            cartView.appendText(cart.getproductNumber() + " - name: "+cart.getproductqunatity());
            cartView.appendText("\n");
        }
    }


}
