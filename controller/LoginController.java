package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.BladeofChaos;
import model.BrassKnucklesKnife;
import model.ButchersKnife;
import model.Handgun1;
import model.Handgun2;
import model.Handgun3;
import model.Shotgun1;
import model.Shotgun2;
import model.Shotgun3;
import model.Smg1;                                                                                                                                                                                                                                                                                                                                                                                                                                                          
import model.Smg2;
import model.Smg3;
import model.Rifle1;
import model.Rifle2;
import model.Rifle3;
import model.Cart;


public class LoginController implements Initializable {

    @FXML
    TextField myusernamefield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    HBox myHbxox1, myHbox2, myHbox3;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;

    @FXML
    ProductsController productsController = null;

    @FXML
    ContactsController contactsController = null;

    @FXML
    AboutusController aboutusController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    static BladeofChaos bladeofchaos = new BladeofChaos();
    static BrassKnucklesKnife brassknucklesknife = new BrassKnucklesKnife();
    static ButchersKnife butchersknife = new ButchersKnife();

    static Handgun1 hg1 = new Handgun1();
    static Handgun2 hg2 = new Handgun2();
    static Handgun3 hg3 = new Handgun3();

    static Shotgun1 sg1 = new Shotgun1();
    static Shotgun2 sg2 = new Shotgun2();
    static Shotgun3 sg3 = new Shotgun3();

    static Smg1 smg1 = new Smg1();
    static Smg2 smg2 = new Smg2();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    static Smg3 smg3 = new Smg3();

    static Rifle1 r1 = new Rifle1();
    static Rifle2 r2 = new Rifle2();
    static Rifle3 r3 = new Rifle3();

    static Cart cart = new Cart();


     @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== MELEES ==================//    

        // ============== Blade of Chaos ==================//
        bladeofchaos.setProductName("Blade of Chaos");
        bladeofchaos.setProductPrice(100000.00);
        bladeofchaos.setProductImage("images/bladeofchaos.png");

        // ============== Brass Knuckles Knife ==================//
        brassknucklesknife.setProductName("Brass Knuckles Knife");
        brassknucklesknife.setProductPrice(15000.00);
        brassknucklesknife.setProductImage("images/brassknucklesknife.png");

        // ============== Butchers Knife ==================//                               
        butchersknife.setProductName("Butchers Knife (Ninong RY)");                                                                                                                                                                                     
        butchersknife.setProductPrice(20000.00);
        butchersknife.setProductImage("images/butchersknife.png");
        
        // ============== HANDGUNS ==================//    

        // ============== Handgun 1 ==================//                               
        hg1.setProductName("S&W 257");                                                                                                                                                                                   
        hg1.setProductPrice(6000.00);
        hg1.setProductImage("images/handgun1.png");

        // ============== Handgun 2 ==================//                               
        hg2.setProductName("Six Shooter");                                                                                                                                                                                   
        hg2.setProductPrice(11999.00);
        hg2.setProductImage("images/handgun2.png");

        // ============== Handgun 3 ==================//                               
        hg3.setProductName("PPK 380");                                                                                                                                                                                   
        hg3.setProductPrice(8000.00);
        hg3.setProductImage("images/handgun3.png");
        
        // ============== SHOTGUNS ==================//    

        // ============== Shotgun 1 ==================//                               
        sg1.setProductName("Pump Shotgun");                                                                                                                                                                                   
        sg1.setProductPrice(9000.00);
        sg1.setProductImage("images/shotgun1.png");

         // ============== Shotgun 2 ==================//                               
        sg2.setProductName("Heavy Shotgun");                                                                                                                                                                                   
        sg2.setProductPrice(13000.00 );
        sg2.setProductImage("images/shotgun2.png");

        // ============== Shotgun 3==================//                               
        sg3.setProductName("Level Action Shotgun");                                                                                                                                                                                   
        sg3.setProductPrice(10000.00);
        sg3.setProductImage("images/shotgun3.png");


        // ============== SMGS ==================//    

        // ============== SMG 1 ==================//                               
        smg1.setProductName("Pistol Iwi Uzi");                                                                                                                                                                                   
        smg1.setProductPrice(19000.00);
        smg1.setProductImage("images/smg1.png");

        // ============== SMG 2 ==================//                               
        smg2.setProductName("M1 Thompson");                                                                                                                                                                                   
        smg2.setProductPrice(13000.00);
        smg2.setProductImage("images/smg2.png");

        // ============== SMG 3 ==================//                               
        smg3.setProductName("Pellet Rifle");                                                                                                                                                                                   
        smg3.setProductPrice(15000.00);
        smg3.setProductImage("images/smg3.png");

        // ============== RIFLES ==================//    

        // ============== RIFLE 1 ==================//                               
        r1.setProductName("Royal Amethyst");                                                                                                                                                                                   
        r1.setProductPrice(66000.00);
        r1.setProductImage("images/rifle1.png");

        // ============== RIFLE 2 ==================//                               
        r2.setProductName("Sunstrike");                                                                                                                                                                                   
        r2.setProductPrice(44000.00);
        r2.setProductImage("images/rifle2.png");

        // ============== RIFLE 3 ==================//                               
        r3.setProductName("Opal Haze");                                                                                                                                                                                   
        r3.setProductPrice(60000.00);
        r3.setProductImage("images/rifle3.png");

        
        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }


    // Goes to Login.fxml
    public void login(ActionEvent event) throws IOException {

        String username = myusernamefield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("elizer") && password.equals("elizer")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }
    }

}
