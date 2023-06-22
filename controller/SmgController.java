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

public class SmgController implements Initializable {

    @FXML
    private ScrollPane weaponsScrollPane;

    @FXML
    private Label smg1, smg2, smg3, smgprice1, smgprice2, smgprice3;

    @FXML
    private ImageView smgimg1, smgimg2, smgimg3;

    @FXML
    private Button smgbutton1, smgbutton2, smgbutton3, cartbutton, aboutusbutton, homebutton, contactsbutton, productsbutton;

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

        // ============== SMG 1 ==================//
        smg1.setText(LoginController.smg1.getProductName()); 
        smgprice1.setText("₱ " + Double.toString(LoginController.smg1.getProductPrice()));
        Image smG1 = new Image(getClass().getResourceAsStream("/images/smg1.png"));
        smgimg1.setImage(smG1);

        // ============== SMG 2 ==================//
        smg2.setText(LoginController.smg2.getProductName());
        smgprice2.setText("₱ " + Double.toString(LoginController.smg2.getProductPrice()));
        Image smG2 = new Image(getClass().getResourceAsStream("/images/smg2.png"));
        smgimg2.setImage(smG2);

        // ============== SMG 3 ==================//
        smg3.setText(LoginController.smg3.getProductName());
        smgprice3.setText("₱ " + Double.toString(LoginController.smg3.getProductPrice()));
        Image smG3 = new Image(getClass().getResourceAsStream("/images/smg3.png"));
        smgimg3.setImage(smG3);

    
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Hello, Elizer Duterte!", "this item is added to your cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(smgbutton1)) {
            LoginController.smg1.setProductStatus(true);
            LoginController.smg1.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane10);
        } 
        
        if (sourceButton.equals(smgbutton2)) {
            LoginController.smg2.setProductStatus(true);
            LoginController.smg2.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane11);
        }

        if (sourceButton.equals(smgbutton3)) {
            LoginController.smg3.setProductStatus(true);
            LoginController.smg3.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane12);
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
