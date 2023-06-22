package controller;

import model.*;
import alert.AlertMaker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;

public class ShotgunController implements Initializable {

    @FXML
    private ScrollPane weaponsScrollPane;

    @FXML
    private Label shotgun1, shotgun2, shotgun3, shotgunprice1, shotgunprice2, shotgunprice3;

    @FXML
    private ImageView shotgunimg1, shotgunimg2, shotgunimg3;

    @FXML
    private Button shotgunbutton1, shotgunbutton2, shotgunbutton3, cartbutton, aboutusbutton, homebutton, contactsbutton, productsbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    private CheckoutController checkoutController = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Shotgun 1 ==================//
        shotgun1.setText(LoginController.sg1.getProductName()); 
        shotgunprice1.setText("₱ " + Double.toString(LoginController.sg1.getProductPrice()));
        Image sG1 = new Image(getClass().getResourceAsStream("/images/shotgun1.png"));
        shotgunimg1.setImage(sG1);

        // ============== Shotgun 2 ==================//
        shotgun2.setText(LoginController.sg2.getProductName());
        shotgunprice2.setText("₱ " + Double.toString(LoginController.sg2.getProductPrice()));
        Image sG2 = new Image(getClass().getResourceAsStream("/images/shotgun2.png"));
        shotgunimg2.setImage(sG2);

        // ============== Shotgun 3 ==================//
        shotgun3.setText(LoginController.sg3.getProductName());
        shotgunprice3.setText("₱ " + Double.toString(LoginController.sg3.getProductPrice()));
        Image sG3 = new Image(getClass().getResourceAsStream("/images/shotgun3.png"));
        shotgunimg3.setImage(sG3);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Hello, Elizer Duterte!", "this item is added to your cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(shotgunbutton1)) {
            LoginController.sg1.setProductStatus(true);
            LoginController.sg1.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane7);
        } 
        
        if (sourceButton.equals(shotgunbutton2)) {
            LoginController.sg2.setProductStatus(true);
            LoginController.sg2.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane8);
        } 
        
        if (sourceButton.equals(shotgunbutton3)) {
            LoginController.sg3.setProductStatus(true);
            LoginController.sg3.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane9);
        } 

         LoginController.cart.showItems();
    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        LoginController.checkoutController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.checkoutController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to AboutUs.fxml
    public void gotoaboutus(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Contacts.fxml
    public void gotocontacts(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Contacts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Home.fxml
    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Products.fxml
    public void gotoproducts(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Products.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
