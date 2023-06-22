package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class HomeController {
 
    @FXML
    private ScrollPane weaponsScrollPane;

    @FXML
    private ImageView notificationIcon, userIcon;

    @FXML
    Button  button1, button2, button3, button4;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    FXMLLoader loader;

    @FXML
    private void initialize() {
        notificationIcon.setOnMouseClicked(event -> showNotification());
        userIcon.setOnMouseClicked(event -> showUser());
    }

    @FXML
    private void showNotification() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setHeaderText(null);
        alert.setContentText("John Wick accepts your Challenge.");
        Alert alert1 = new Alert(AlertType.INFORMATION);
        alert1.setTitle("Notification");
        alert1.setHeaderText(null);
        alert1.setContentText("Sir pantawid gutom lang!!!");
        Alert alert2 = new Alert(AlertType.INFORMATION);
        alert2.setTitle("Notification");
        alert2.setHeaderText(null);
        alert2.setContentText("Baka naman sir!");
        
        
       
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResourceAsStream("../images/notificationicon.png")));
        
        alert.showAndWait(); 
        alert1.showAndWait();
        alert2.showAndWait();
    }
    @FXML
    private void showUser() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Account User");
        alert.setHeaderText(null);
        alert.setContentText("Hello, Elizer! Welcome to Ammunation. This is your Account.");
        
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResourceAsStream("../images/sir.jpg")));
        
        alert.showAndWait();
    }
    
    // Goes to Products.fxml
    public void gotoproducts (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Products.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    // Goes to AboutUs.fxml
    public void gotoaboutus (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

    // Goes to Contact.fxml
    public void gotocontacts (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Contacts.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
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
}
