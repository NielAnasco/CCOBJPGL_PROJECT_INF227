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

public class HandgunController implements Initializable {

    @FXML
    private ScrollPane weaponsScrollPane;

    @FXML
    private Label handgun1, handgun2, handgun3, handgunprice1, handgunprice2, handgunprice3;

    @FXML
    private ImageView handgunimg1, handgunimg2, handgunimg3;

    @FXML
    private Button handgunbutton1, handgunbutton2, handgunbutton3, cartbutton, aboutusbutton, homebutton, contactsbutton, productsbutton;

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

        // ============== Hand Gun 1 ==================//
        handgun1.setText(LoginController.hg1.getProductName()); 
        handgunprice1.setText("₱ " + Double.toString(LoginController.hg1.getProductPrice()));
        Image hG1 = new Image(getClass().getResourceAsStream("/images/handgun1.png"));
        handgunimg1.setImage(hG1);

        // ============== Hand Gun 2 ==================//
        handgun2.setText(LoginController.hg2.getProductName()); 
        handgunprice2.setText("₱ " + Double.toString(LoginController.hg2.getProductPrice()));
        Image hG2 = new Image(getClass().getResourceAsStream("/images/handgun2.png"));
        handgunimg2.setImage(hG2);

        // ============== Hand Gun 3 ==================//
        handgun3.setText(LoginController.hg3.getProductName()); 
        handgunprice3.setText("₱ " + Double.toString(LoginController.hg3.getProductPrice()));
        Image hG3 = new Image(getClass().getResourceAsStream("/images/handgun3.png"));
        handgunimg3.setImage(hG3);
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Hello, Elizer Duterte!", "this item is added to your cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(handgunbutton1)) {
            LoginController.hg1.setProductStatus(true);
            LoginController.hg1.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }

        if (sourceButton.equals(handgunbutton2)) {
            LoginController.hg2.setProductStatus(true);
            LoginController.hg2.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane5);
        }

        if (sourceButton.equals(handgunbutton3)) {
            LoginController.hg3.setProductStatus(true);
            LoginController.hg3.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane6);
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
