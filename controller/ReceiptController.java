package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount, item9Amount, item10Amount,
           item11Amount, item12Amount, item13Amount, item14Amount, item15Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10, qty11, qty12, qty13, qty14, qty15,
          product1, product2, product3, product4, product5, product6, product7, product8, product9, product10, product11, product12, product13, product14, product15, 
          price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, price14, price15,
          amount1, amount2, amount3, amount4, amount5, amount6, amount7, amount8, amount9, amount10, amount11, amount12, amount13, amount14, amount15, 
          total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    if (LoginController.bladeofchaos.getProductStatus()) {
        product1.setText(LoginController.bladeofchaos.getProductName());
        qty1.setText(Double.toString(LoginController.bladeofchaos.getProductQuantity()));
        price1.setText(Double.toString(LoginController.bladeofchaos.getProductPrice()));
        amount1.setText(Double.toString(LoginController.bladeofchaos.getProductPrice() * LoginController.bladeofchaos.getProductQuantity()));

        product1.setVisible(true);
        qty1.setVisible(true);
        price1.setVisible(true);
        amount1.setVisible(true);

        item1Amount = LoginController.bladeofchaos.getProductPrice() * LoginController.bladeofchaos.getProductQuantity();
    }

    if (LoginController.brassknucklesknife.getProductStatus()) {
        product2.setText(LoginController.brassknucklesknife.getProductName());
        qty2.setText(Double.toString(LoginController.brassknucklesknife.getProductQuantity()));
        price2.setText(Double.toString(LoginController.brassknucklesknife.getProductPrice()));
        amount2.setText(Double.toString(LoginController.brassknucklesknife.getProductPrice() * LoginController.brassknucklesknife.getProductQuantity()));

        product2.setVisible(true);
        qty2.setVisible(true);
        price2.setVisible(true);
        amount2.setVisible(true);

        item2Amount = LoginController.brassknucklesknife.getProductPrice() * LoginController.brassknucklesknife.getProductQuantity();
    }

    if (LoginController.butchersknife.getProductStatus()) {
        product3.setText(LoginController.butchersknife.getProductName());
        qty3.setText(Double.toString(LoginController.butchersknife.getProductQuantity()));
        price3.setText(Double.toString(LoginController.butchersknife.getProductPrice()));
        amount3.setText(Double.toString(LoginController.butchersknife.getProductPrice() * LoginController.butchersknife.getProductQuantity()));

        product3.setVisible(true);
        qty3.setVisible(true);
        price3.setVisible(true);
        amount3.setVisible(true);

        item3Amount = LoginController.butchersknife.getProductPrice() * LoginController.butchersknife.getProductQuantity();
    }


    if (LoginController.hg1.getProductStatus()) {
        product4.setText(LoginController.hg1.getProductName());
        qty4.setText(Double.toString(LoginController.hg1.getProductQuantity()));
        price4.setText(Double.toString(LoginController.hg1.getProductPrice()));
        amount4.setText(Double.toString(LoginController.hg1.getProductPrice() * LoginController.hg1.getProductQuantity()));

        product4.setVisible(true);
        qty4.setVisible(true);
        price4.setVisible(true);
        amount4.setVisible(true);

        item4Amount = LoginController.hg1.getProductPrice() * LoginController.hg1.getProductQuantity();
    }

    if (LoginController.hg2.getProductStatus()) {
        product5.setText(LoginController.hg2.getProductName());
        qty5.setText(Double.toString(LoginController.hg2.getProductQuantity()));
        price5.setText(Double.toString(LoginController.hg2.getProductPrice()));
        amount5.setText(Double.toString(LoginController.hg2.getProductPrice() * LoginController.hg2.getProductQuantity()));

        product5.setVisible(true);
        qty5.setVisible(true);
        price5.setVisible(true);
        amount5.setVisible(true);

        item5Amount = LoginController.hg2.getProductPrice() * LoginController.hg2.getProductQuantity();
    }

    if (LoginController.hg3.getProductStatus()) {
        product6.setText(LoginController.hg3.getProductName());
        qty6.setText(Double.toString(LoginController.hg3.getProductQuantity()));
        price6.setText(Double.toString(LoginController.hg3.getProductPrice()));
        amount6.setText(Double.toString(LoginController.hg3.getProductPrice() * LoginController.hg3.getProductQuantity()));

        product6.setVisible(true);
        qty6.setVisible(true);
        price6.setVisible(true);
        amount6.setVisible(true);

        item6Amount = LoginController.hg3.getProductPrice() * LoginController.hg3.getProductQuantity();
    }

    
    if (LoginController.sg1.getProductStatus()) {
        product7.setText(LoginController.sg1.getProductName());
        qty7.setText(Double.toString(LoginController.sg1.getProductQuantity()));
        price7.setText(Double.toString(LoginController.sg1.getProductPrice()));
        amount7.setText(Double.toString(LoginController.sg1.getProductPrice() * LoginController.sg1.getProductQuantity()));

        product7.setVisible(true);
        qty7.setVisible(true);
        price7.setVisible(true);
        amount7.setVisible(true);

        item7Amount = LoginController.sg1.getProductPrice() * LoginController.sg1.getProductQuantity();
    }

        if (LoginController.sg2.getProductStatus()) {
        product8.setText(LoginController.sg2.getProductName());
        qty8.setText(Double.toString(LoginController.sg2.getProductQuantity()));
        price8.setText(Double.toString(LoginController.sg2.getProductPrice()));
        amount8.setText(Double.toString(LoginController.sg2.getProductPrice() * LoginController.sg2.getProductQuantity()));

        product8.setVisible(true);
        qty8.setVisible(true);
        price8.setVisible(true);
        amount8.setVisible(true);

        item8Amount = LoginController.sg2.getProductPrice() * LoginController.sg2.getProductQuantity();
    }

    if (LoginController.sg3.getProductStatus()) {
        product9.setText(LoginController.sg3.getProductName());
        qty9.setText(Double.toString(LoginController.sg3.getProductQuantity()));
        price9.setText(Double.toString(LoginController.sg3.getProductPrice()));
        amount9.setText(Double.toString(LoginController.sg3.getProductPrice() * LoginController.sg3.getProductQuantity()));

        product9.setVisible(true);
        qty9.setVisible(true);
        price9.setVisible(true);
        amount9.setVisible(true);

        item9Amount = LoginController.sg3.getProductPrice() * LoginController.sg3.getProductQuantity();
    }

    if (LoginController.smg1.getProductStatus()) {
        product10.setText(LoginController.smg1.getProductName());
        qty10.setText(Double.toString(LoginController.smg1.getProductQuantity()));
        price10.setText(Double.toString(LoginController.smg1.getProductPrice()));
        amount10.setText(Double.toString(LoginController.smg1.getProductPrice() * LoginController.smg1.getProductQuantity()));

        product10.setVisible(true);
        qty10.setVisible(true);
        price10.setVisible(true);
        amount10.setVisible(true);

        item10Amount = LoginController.smg1.getProductPrice() * LoginController.smg1.getProductQuantity();
    }

    if (LoginController.smg2.getProductStatus()) {
        product11.setText(LoginController.smg2.getProductName());
        qty11.setText(Double.toString(LoginController.smg2.getProductQuantity()));
        price11.setText(Double.toString(LoginController.smg2.getProductPrice()));
        amount11.setText(Double.toString(LoginController.smg2.getProductPrice() * LoginController.smg2.getProductQuantity()));

        product11.setVisible(true);
        qty11.setVisible(true);
        price11.setVisible(true);
        amount11.setVisible(true);

        item11Amount = LoginController.smg2.getProductPrice() * LoginController.smg2.getProductQuantity();
    }

    if (LoginController.smg3.getProductStatus()) {
        product12.setText(LoginController.smg3.getProductName());
        qty12.setText(Double.toString(LoginController.smg3.getProductQuantity()));
        price12.setText(Double.toString(LoginController.smg3.getProductPrice()));
        amount12.setText(Double.toString(LoginController.smg3.getProductPrice() * LoginController.smg3.getProductQuantity()));

        product12.setVisible(true);
        qty12.setVisible(true);
        price12.setVisible(true);
        amount12.setVisible(true);

        item12Amount = LoginController.smg3.getProductPrice() * LoginController.smg3.getProductQuantity();
    }

    
    if (LoginController.r1.getProductStatus()) {
        product13.setText(LoginController.r1.getProductName());
        qty13.setText(Double.toString(LoginController.r1.getProductQuantity()));
        price13.setText(Double.toString(LoginController.r1.getProductPrice()));
        amount13.setText(Double.toString(LoginController.r1.getProductPrice() * LoginController.r1.getProductQuantity()));
    
        product13.setVisible(true);
        qty13.setVisible(true);
        price13.setVisible(true);
        amount13.setVisible(true);
    
        item13Amount = LoginController.r1.getProductPrice() * LoginController.r1.getProductQuantity();
    }

    if (LoginController.r2.getProductStatus()) {
        product14.setText(LoginController.r2.getProductName());
        qty14.setText(Double.toString(LoginController.r2.getProductQuantity()));
        price14.setText(Double.toString(LoginController.r2.getProductPrice()));
        amount14.setText(Double.toString(LoginController.r2.getProductPrice() * LoginController.r2.getProductQuantity()));

        product14.setVisible(true);
        qty14.setVisible(true);
        price14.setVisible(true);
        amount14.setVisible(true);

        item14Amount = LoginController.r2.getProductPrice() * LoginController.r2.getProductQuantity();
    }  

    if (LoginController.r3.getProductStatus()) {
        product15.setText(LoginController.r3.getProductName());
        qty15.setText(Double.toString(LoginController.r3.getProductQuantity()));
        price15.setText(Double.toString(LoginController.r3.getProductPrice()));
        amount15.setText(Double.toString(LoginController.r3.getProductPrice() * LoginController.r3.getProductQuantity()));

        product15.setVisible(true);
        qty15.setVisible(true);
        price15.setVisible(true);
        amount15.setVisible(true);

        item15Amount = LoginController.r3.getProductPrice() * LoginController.r3.getProductQuantity();
    }



        double final_amount =item1Amount + item2Amount + item3Amount + item4Amount + item5Amount +
                 item6Amount + item7Amount + item8Amount + item9Amount + item10Amount +
                 item11Amount + item12Amount + item13Amount + item14Amount + item15Amount;
                 
        total.setText("\u20B1 " +  Double.toString(final_amount));
       
    }
}