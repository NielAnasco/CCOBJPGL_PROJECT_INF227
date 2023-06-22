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

public class RifleController implements Initializable {

    @FXML
    private ScrollPane weaponsScrollPane;

    @FXML
    private Label rifle1, rifle2, rifle3, rifleprice1, rifleprice2, rifleprice3;

    @FXML
    private ImageView rifleimg1, rifleimg2, rifleimg3;

    @FXML
    private Button riflebutton1, riflebutton2, riflebutton3, cartbutton, aboutusbutton, homebutton, contactsbutton, productsbutton;

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

        // ============== Rifle 1 ==================//
        rifle1.setText(LoginController.r1.getProductName()); 
        rifleprice1.setText("₱ " + Double.toString(LoginController.r1.getProductPrice()));
        Image R1 = new Image(getClass().getResourceAsStream("/images/rifle1.png"));
        rifleimg1.setImage(R1);

        // ============== Rifle 2 ==================//
        rifle2.setText(LoginController.r2.getProductName());
        rifleprice2.setText("₱ " + Double.toString(LoginController.r2.getProductPrice()));
        Image R2 = new Image(getClass().getResourceAsStream("/images/rifle2.png"));
        rifleimg2.setImage(R2);

        // ============== Rifle 3 ==================//
        rifle3.setText(LoginController.r3.getProductName());
        rifleprice3.setText("₱ " + Double.toString(LoginController.r3.getProductPrice()));
        Image R3 = new Image(getClass().getResourceAsStream("/images/rifle3.png"));
        rifleimg3.setImage(R3);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Hello, Elizer Duterte!", "this item is added to your cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(riflebutton1)) {
            LoginController.r1.setProductStatus(true);
            LoginController.r1.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane13);
        } 

        if (sourceButton.equals(riflebutton2)) {
            LoginController.r2.setProductStatus(true);
            LoginController.r2.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane14);
        } 
        
        if (sourceButton.equals(riflebutton3)) {
            LoginController.r3.setProductStatus(true);
            LoginController.r3.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane15);
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
