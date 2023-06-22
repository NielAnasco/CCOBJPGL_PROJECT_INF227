package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12, pane13, pane14, pane15;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15,
          price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, price14, price15,
          total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9, choicebox10, choicebox11, choicebox12, choicebox13, choicebox14, choicebox15;

    

    private String[] quantity = { "1", "2", "3" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        //======================== MELEES =========================//
        name1.setText(LoginController.bladeofchaos.getProductName());
        price1.setText(Double.toString(LoginController.bladeofchaos.getProductPrice()));
        Image bladeofChaos = new Image(LoginController.bladeofchaos.getProductImage());
        img1.setImage(bladeofChaos);

        name2.setText(LoginController.brassknucklesknife.getProductName());
        price2.setText(Double.toString(LoginController.brassknucklesknife.getProductPrice()));
        Image brassknucklesKnife = new Image(LoginController.brassknucklesknife.getProductImage());
        img2.setImage(brassknucklesKnife);

        name3.setText(LoginController.butchersknife.getProductName());
        price3.setText(Double.toString(LoginController.butchersknife.getProductPrice()));
        Image butchersKnife = new Image(LoginController.butchersknife.getProductImage());
        img3.setImage(butchersKnife);
       
        
        //======================== HANDGUNS =========================//
        name4.setText(LoginController.hg1.getProductName());
        price4.setText(Double.toString(LoginController.hg1.getProductPrice()));
        Image hG1 = new Image(LoginController.hg1.getProductImage());
        img4.setImage(hG1);

        name5.setText(LoginController.hg2.getProductName());
        price5.setText(Double.toString(LoginController.hg2.getProductPrice()));
        Image hG2 = new Image(LoginController.hg2.getProductImage());
        img5.setImage(hG2);

        name6.setText(LoginController.hg3.getProductName());
        price6.setText(Double.toString(LoginController.hg3.getProductPrice()));
        Image hG3 = new Image(LoginController.hg3.getProductImage());
        img6.setImage(hG3);


        //======================== SHOTGUNS =========================//
        name7.setText(LoginController.sg1.getProductName());
        price7.setText(Double.toString(LoginController.sg1.getProductPrice()));
        Image sG1 = new Image(LoginController.sg1.getProductImage());
        img7.setImage(sG1);

        name8.setText(LoginController.sg2.getProductName());
        price8.setText(Double.toString(LoginController.sg2.getProductPrice()));
        Image sG2 = new Image(LoginController.sg2.getProductImage());
        img8.setImage(sG2);

        name9.setText(LoginController.sg3.getProductName());
        price9.setText(Double.toString(LoginController.sg3.getProductPrice()));
        Image sG3 = new Image(LoginController.sg3.getProductImage());
        img9.setImage(sG3);


        //======================== SMGS =========================//
        name10.setText(LoginController.smg1.getProductName());
        price10.setText(Double.toString(LoginController.smg1.getProductPrice()));
        Image smG1 = new Image(LoginController.smg1.getProductImage());
        img10.setImage(smG1);

        name11.setText(LoginController.smg2.getProductName());
        price11.setText(Double.toString(LoginController.smg2.getProductPrice()));
        Image smG2 = new Image(LoginController.smg2.getProductImage());
        img11.setImage(smG2);

        name12.setText(LoginController.smg3.getProductName());
        price12.setText(Double.toString(LoginController.smg3.getProductPrice()));
        Image smG3 = new Image(LoginController.smg3.getProductImage());
        img12.setImage(smG3);


        //======================== RIFLES =========================//
        name13.setText(LoginController.r1.getProductName());
        price13.setText(Double.toString(LoginController.r1.getProductPrice()));
        Image R1 = new Image(LoginController.r1.getProductImage());
        img13.setImage(R1);

        name14.setText(LoginController.r2.getProductName());
        price14.setText(Double.toString(LoginController.r2.getProductPrice()));
        Image R2 = new Image(LoginController.r2.getProductImage());
        img14.setImage(R2);

        name15.setText(LoginController.r3.getProductName());
        price15.setText(Double.toString(LoginController.r3.getProductPrice()));
        Image R3 = new Image(LoginController.r3.getProductImage());
        img15.setImage(R3);
        
        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");
        choicebox7.setValue("1");
        choicebox8.setValue("1");
        choicebox9.setValue("1");
        choicebox10.setValue("1");
        choicebox11.setValue("1");
        choicebox12.setValue("1");
        choicebox13.setValue("1");
        choicebox14.setValue("1");
        choicebox15.setValue("1");
        

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);
        choicebox7.getItems().addAll(quantity);
        choicebox8.getItems().addAll(quantity);
        choicebox9.getItems().addAll(quantity);
        choicebox10.getItems().addAll(quantity);
        choicebox11.getItems().addAll(quantity);
        choicebox12.getItems().addAll(quantity);
        choicebox13.getItems().addAll(quantity);
        choicebox14.getItems().addAll(quantity);
        choicebox15.getItems().addAll(quantity);
        

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(event -> computeTotal(event));
        choicebox2.setOnAction(event -> computeTotal(event));
        choicebox3.setOnAction(event -> computeTotal(event));
        choicebox4.setOnAction(event -> computeTotal(event));
        choicebox5.setOnAction(event -> computeTotal(event));
        choicebox6.setOnAction(event -> computeTotal(event));
        choicebox7.setOnAction(event -> computeTotal(event));
        choicebox8.setOnAction(event -> computeTotal(event));
        choicebox9.setOnAction(event -> computeTotal(event));
        choicebox10.setOnAction(event -> computeTotal(event));
        choicebox11.setOnAction(event -> computeTotal(event));
        choicebox12.setOnAction(event -> computeTotal(event));
        choicebox13.setOnAction(event -> computeTotal(event));
        choicebox14.setOnAction(event -> computeTotal(event));
        choicebox15.setOnAction(event -> computeTotal(event));
        

    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;
        double item9Amount = 0;
        double item10Amount = 0;
        double item11Amount = 0;
        double item12Amount = 0;
        double item13Amount = 0;
        double item14Amount = 0;
        double item15Amount = 0;
       
        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (LoginController.bladeofchaos.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            LoginController.bladeofchaos.setProductQuantity(qty);
            item1Amount = LoginController.bladeofchaos.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = LoginController.bladeofchaos.getProductPrice() * qty;
            }
        }

        if (LoginController.brassknucklesknife.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            LoginController.brassknucklesknife.setProductQuantity(qty);
            item2Amount = LoginController.brassknucklesknife.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = LoginController.brassknucklesknife.getProductPrice() * qty;
            }
        }

        if (LoginController.butchersknife.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            LoginController.butchersknife.setProductQuantity(qty);
            item3Amount = LoginController.butchersknife.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = LoginController.butchersknife.getProductPrice() * qty;
            }
        }

        if (LoginController.hg1.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            LoginController.hg1.setProductQuantity(qty);
            item4Amount = LoginController.hg1.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = LoginController.hg1.getProductPrice() * qty;
            }
        }

        if (LoginController.hg2.getProductStatus()) {
            double qty = Double.parseDouble(choicebox5.getValue());
            LoginController.hg2.setProductQuantity(qty);
            item5Amount = LoginController.hg2.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = LoginController.hg2.getProductPrice() * qty;
            }
        }

        
        if (LoginController.hg3.getProductStatus()) {
            double qty = Double.parseDouble(choicebox6.getValue());
            LoginController.hg3.setProductQuantity(qty);
            item6Amount = LoginController.hg3.getProductPrice() * qty;

            if (source == choicebox13) {
                item6Amount = LoginController.hg3.getProductPrice() * qty;
            }
        }


        if (LoginController.sg1.getProductStatus()) {
            double qty = Double.parseDouble(choicebox7.getValue());
            LoginController.sg1.setProductQuantity(qty);
            item7Amount = LoginController.sg1.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = LoginController.sg1.getProductPrice() * qty;
            
            }
        }

        if (LoginController.sg2.getProductStatus()) {
            double qty = Double.parseDouble(choicebox8.getValue());
            LoginController.sg2.setProductQuantity(qty);
            item8Amount = LoginController.sg2.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = LoginController.sg2.getProductPrice() * qty;
            }
        }

        if (LoginController.sg3.getProductStatus()) {
            double qty = Double.parseDouble(choicebox9.getValue());
            LoginController.sg3.setProductQuantity(qty);
            item9Amount = LoginController.sg3.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = LoginController.sg3.getProductPrice() * qty;
            }
        }


        if (LoginController.smg1.getProductStatus()) {
            double qty = Double.parseDouble(choicebox10.getValue());
            LoginController.smg1.setProductQuantity(qty);
            item10Amount = LoginController.smg1.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = LoginController.smg1.getProductPrice() * qty;
            }
        }

        if (LoginController.smg2.getProductStatus()) {
            double qty = Double.parseDouble(choicebox11.getValue());
            LoginController.smg2.setProductQuantity(qty);
            item11Amount = LoginController.smg2.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = LoginController.smg2.getProductPrice() * qty;
            }
        }

        if (LoginController.smg3.getProductStatus()) {
            double qty = Double.parseDouble(choicebox12.getValue());
            LoginController.smg3.setProductQuantity(qty);
            item12Amount = LoginController.smg3.getProductPrice() * qty;

            if (source == choicebox12) {
                item12Amount = LoginController.smg3.getProductPrice() * qty;
            }
        }

       

        if (LoginController.r1.getProductStatus()) {
            double qty = Double.parseDouble(choicebox13.getValue());
            LoginController.r1.setProductQuantity(qty);
            item13Amount = LoginController.r1.getProductPrice() * qty;

            if (source == choicebox13) {
                item13Amount = LoginController.r1.getProductPrice() * qty;
            }
        }

        if (LoginController.r2.getProductStatus()) {
            double qty = Double.parseDouble(choicebox14.getValue());
            LoginController.r2.setProductQuantity(qty);
            item14Amount = LoginController.r2.getProductPrice() * qty;

            if (source == choicebox14) {
                item14Amount = LoginController.r2.getProductPrice() * qty;
            }
        }

        if (LoginController.r3.getProductStatus()) {
            double qty = Double.parseDouble(choicebox15.getValue());
            LoginController.r3.setProductQuantity(qty);
            item15Amount = LoginController.r3.getProductPrice() * qty;

            if (source == choicebox15) {
                item15Amount = LoginController.r3.getProductPrice() * qty;
            }
        }



        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount +
                      item6Amount + item7Amount + item8Amount + item9Amount + item10Amount +
                      item11Amount + item12Amount + item13Amount + item14Amount + item15Amount;

          // Display total amount in total label
        total.setText("₱ " + Double.toString(totalAmount));
    }

    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (LoginController.bladeofchaos.getProductStatus()) {
            totalAmount += LoginController.bladeofchaos.getProductPrice();
        }

        if (LoginController.brassknucklesknife.getProductStatus()) {
            totalAmount += LoginController.brassknucklesknife.getProductPrice();
        }

        if (LoginController.butchersknife.getProductStatus()) {
            totalAmount += LoginController.butchersknife.getProductPrice();
        } 

        if (LoginController.hg1.getProductStatus()) {
            totalAmount += LoginController.hg1.getProductPrice();
        }

        if (LoginController.hg2.getProductStatus()) {
        totalAmount += LoginController.hg2.getProductPrice();
        }

        if (LoginController.hg3.getProductStatus()) {
            totalAmount += LoginController.hg3.getProductPrice();
        }


        if (LoginController.sg1.getProductStatus()) {
            totalAmount += LoginController.sg1.getProductPrice();
        }

              
        if (LoginController.sg2.getProductStatus()) {
            totalAmount += LoginController.sg2.getProductPrice();
        }

        if (LoginController.sg3.getProductStatus()) {
            totalAmount += LoginController.sg3.getProductPrice();
        }

               
        if (LoginController.smg1.getProductStatus()) {
            totalAmount += LoginController.smg1.getProductPrice();
        }

        if (LoginController.smg2.getProductStatus()) {
            totalAmount += LoginController.smg2.getProductPrice();
        }

        if (LoginController.smg3.getProductStatus()) {
            totalAmount += LoginController.smg3.getProductPrice();
        }

        if (LoginController.r1.getProductStatus()) {
            totalAmount += LoginController.r1.getProductPrice();
        }

        if (LoginController.r2.getProductStatus()) {
            totalAmount += LoginController.r2.getProductPrice();
        }

        if (LoginController.r3.getProductStatus()) {
            totalAmount += LoginController.r3.getProductPrice();
        }
            total.setText("₱ " + Double.toString(totalAmount));
            
        }

    // Go to Receipt Page
    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

  
    
    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }
}
