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

public class MeleeController implements Initializable {

    @FXML
    private ScrollPane weaponsScrollPane;

    @FXML
    private Label melee1, melee2, melee3, meleeprice1, meleeprice2, meleeprice3;

    @FXML
    private ImageView meleeimg1, meleeimg2, meleeimg3;

    @FXML
    private Button meleebutton1, meleebutton2, meleebutton3, cartbutton, aboutusbutton, homebutton, contactsbutton, productsbutton;

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

        // ============== Blade of Chaos ==================//
        melee1.setText(LoginController.bladeofchaos.getProductName()); 
        meleeprice1.setText("₱ " + Double.toString(LoginController.bladeofchaos.getProductPrice()));
        Image bladeOfChaosImage = new Image(getClass().getResourceAsStream("/images/bladeofchaos.png"));
        meleeimg1.setImage(bladeOfChaosImage);

        // ============== Brass Knuckles Knife ==================//
        melee2.setText(LoginController.brassknucklesknife.getProductName());
        meleeprice2.setText("₱ " + Double.toString(LoginController.brassknucklesknife.getProductPrice()));
        Image brassKnucklesKnife = new Image(getClass().getResourceAsStream("/images/brassknucklesknife.png"));
        meleeimg2.setImage(brassKnucklesKnife);

        // ============== Butchers Knife ==================//                                                                                                                                                                                                                 
        melee3.setText(LoginController.butchersknife.getProductName());                                                                                                                                                                                                                                  
        meleeprice3.setText("₱ " + Double.toString(LoginController.butchersknife.getProductPrice()));
        Image butchersKnife = new Image(getClass().getResourceAsStream("/images/butchersknife.png"));
        meleeimg3.setImage(butchersKnife);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Hello, Elizer Duterte!", "this item is added to your cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(meleebutton1)) {
            LoginController.bladeofchaos.setProductStatus(true);
            LoginController.bladeofchaos.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        if (sourceButton.equals(meleebutton2)) {
            LoginController.brassknucklesknife.setProductStatus(true);
            LoginController.brassknucklesknife.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        if (sourceButton.equals(meleebutton3)) {
            LoginController.butchersknife.setProductStatus(true);
            LoginController.butchersknife.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
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
